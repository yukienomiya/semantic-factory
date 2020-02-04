package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class TaskManager {
  private static final String[] tasks = {"translationAnnotation.html", "wordAnnotation.html", "definitionAnnotation.html", "senseAnnotation.html", "translationValidation.html", "senseValidation.html", "myAnnotation.html"};

  // could be removed
  public static String randomTask(String currentTask) {
    while(true) {
      Random r = new Random();
      String randomTask = tasks[r.nextInt(tasks.length)];
      if (!randomTask.equals(currentTask)) {
        return randomTask;
      }
    }
  }

  public static String randomTask() {
    Random r = new Random();
    return tasks[r.nextInt(tasks.length)];
  }



  public static void saveTask(String taskName, File taskFile, String[][] data) throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);

    switch (taskName) {
    case "translationAnnotation":
      taskJSON = translationAnnotationJSON(taskJSON, data);
      break;
    case "wordAnnotation":
      taskJSON = wordAnnotationJSON(taskJSON, data);
      break;
    case "definitionAnnotation":
      taskJSON = definitionAnnotationJSON(taskJSON, data);
      break;
    case "senseAnnotation":
      taskJSON = senseAnnotationJSON(taskJSON, data);
      break;
    case "translationValidation":
      taskJSON = translationValidationJSON(taskJSON, data);
      break;
    case "senseValidation":
      taskJSON = senseValidationJSON(taskJSON, data);
      break;
    case "myAnnotation":
      taskJSON = myAnnotationJSON(taskJSON, data);
      break;
    default:
      break;
    }
    try (FileWriter file = new FileWriter(taskFile)) {
      file.write(taskJSON.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }



  public static JSONObject translationAnnotationJSON(JSONObject taskJSON, String[][] data) {
    String word = data[0][0];
    String description = data[1][0];
    String translation = data[2][0];

    if (taskJSON.has(word)) {
      // the word is already a key of the jsonObj
      JSONObject defs = taskJSON.getJSONObject(word);
      if (defs.has(description)) {
        // the description for that word is already in the jsonObj
        JSONArray transl = defs.getJSONArray(description);
        for (Object i : transl) {
          if ((translation.toLowerCase()).equals(i.toString().toLowerCase())) {
            // the entered translation (for that word, with that description) was already in
            // the db
            return taskJSON;
          }
        }
        // add the translation to the JsonArray of te description
        transl.put(translation);
      } else {
        // add an entry (key: description, value:JsonArray with the translation) to the
        // JsonObj of the word
        defs.put(description, new JSONArray(new String[] { translation }));
      }
    } else {
      // add an entry (key: word, value: JsonObj(key: description, value: JsonArray
      // with the translation)) to the task file
      JSONArray transl = new JSONArray();
      transl.put(translation);
      JSONObject defs = new JSONObject();
      defs.put(description, transl);
      taskJSON.put(word, defs);
    }
    return taskJSON;
  }



  public static JSONObject wordAnnotationJSON(JSONObject taskJSON, String[][] data) {
    String description = data[0][0];
    String word = data[1][0];

    if (taskJSON.has(description)) {
      JSONArray words = taskJSON.getJSONArray(description);
      for (Object i : words) {
        if ((word.toLowerCase()).equals(i.toString().toLowerCase())) {
          return taskJSON;
        }
      }
      words.put(word);
    } else {
      taskJSON.put(description, new JSONArray(new String[] { word }));
    }
    return taskJSON;
  }



  public static JSONObject definitionAnnotationJSON(JSONObject taskJSON, String[][] data) {
    String word = data[0][0];
    String hypernym = data[1][0];
    String definition = data[2][0];

    if (taskJSON.has(word)) {
      JSONObject hyp = taskJSON.getJSONObject(word);
      if (hyp.has(hypernym)) {
        JSONArray def = hyp.getJSONArray(hypernym);
        for (Object i : def) {
          if ((definition.toLowerCase()).equals(i.toString().toLowerCase())) {
            return taskJSON;
          }
        }
        def.put(definition);
      } else {
        hyp.put(hypernym, new JSONArray(new String[] { definition }));
      }
    } else {
      JSONArray def = new JSONArray();
      def.put(definition);
      JSONObject hyp = new JSONObject();
      hyp.put(hypernym, def);
      taskJSON.put(word, hyp);
    }
    return taskJSON;
  }



  public static JSONObject senseAnnotationJSON(JSONObject taskJSON, String[][] data) {
    String word = data[0][0];
    String description = data[1][0];
    String[] senses = data[2];

    if (taskJSON.has(word)) {
      JSONObject descr = taskJSON.getJSONObject(word);
      if (descr.has(description)) {
        Set<String> sensesSet = new HashSet<String>();
        for (Object o : descr.getJSONArray(description)) {
          sensesSet.add(o.toString());
        }
        for (String s : senses) {
          sensesSet.add(s);
        }
        descr.put(description, new JSONArray(sensesSet));
      } else {
        descr.put(description, new JSONArray(Arrays.asList(senses)));
      }
    } else {
      JSONObject descr = new JSONObject();
      descr.put(description, new JSONArray(Arrays.asList(senses)));
      taskJSON.put(word, descr);
    }
    return taskJSON;
  }



  public static JSONObject translationValidationJSON(JSONObject taskJSON, String[][] data) {
    String word = data[0][0];
    String description = data[1][0];
    String[] translations = data[2];

    Set<String> t = new HashSet<String>();
    for (String s : translations) {
      if (!s.equals("<nessuna>")) {
        t.add(s);
      }
    }

    if (taskJSON.has(word)) {
      JSONObject descr = taskJSON.getJSONObject(word);
      if (descr.has(description)) {
        Set<String> translSet = new HashSet<String>();
        for (Object o : descr.getJSONArray(description)) {
          translSet.add(o.toString());
        }
        for (String s : t) {
          translSet.add(s);
        }
        descr.put(description, new JSONArray(translSet));
      } else {
        descr.put(description, new JSONArray(t));
      }
    } else {
      JSONObject descr = new JSONObject();
      descr.put(description, new JSONArray(t));
      taskJSON.put(word, descr);
    }
    return taskJSON;
  }



  public static JSONObject senseValidationJSON(JSONObject taskJSON, String[][] data) {
    String word = data[0][0];
    String example = data[1][0];
    String sense = data[2][0];
    String[] answer = data[3];
    
    if (answer[0].equals("Si")) {
      if (taskJSON.has(word)) {
        JSONObject examples = taskJSON.getJSONObject(word);
        if (examples.has(example)) {
          JSONArray senses = examples.getJSONArray(example);
          for (Object i : senses) {
            if (sense.equals(i.toString())) {
              return taskJSON;
            }
          }
          senses.put(sense);
        } else {
          examples.put(example, new JSONArray(new String[] {sense}));
        }
      } else {
        JSONArray senses = new JSONArray();
        senses.put(sense);
        JSONObject examples = new JSONObject();
        examples.put(example, senses);
        taskJSON.put(word, examples);
      }
    }
    return taskJSON;
  }



  public static JSONObject myAnnotationJSON(JSONObject taskJSON, String[][] data) {
    String hypernym = data[0][0];
    String[] words = data[1];

    if (taskJSON.has(hypernym)) {
      JSONArray w = taskJSON.getJSONArray(hypernym);
      Set<String> wordsSet = new HashSet<String>();
      for (Object o : w) {
        wordsSet.add(o.toString());
      }
      for (String s : words) {
        wordsSet.add(s);
      }
      taskJSON.put(hypernym, new JSONArray(wordsSet));
    } else {
      taskJSON.put(hypernym, new JSONArray(Arrays.asList(words)));
    }
    return taskJSON;
  }
}