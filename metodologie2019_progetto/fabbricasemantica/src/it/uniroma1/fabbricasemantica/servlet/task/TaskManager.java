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

  public static String randomTask(String currentTask) {
    while(true) {
      Random r = new Random();
      String randomTask = tasks[r.nextInt(tasks.length)];
      if (!randomTask.equals(currentTask)) {
        return randomTask;
      }
    }
  }

  public static String randomTaskSKIP() {
    Random r = new Random();
    return tasks[r.nextInt(tasks.length)];
  }



  public static void saveTranslationAnnotation(File taskFile, String word, String description, String translation) throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);

    if (taskJSON.has(word)) {
      // the word is already a key of the jsonObj
      JSONObject defs = taskJSON.getJSONObject(word);
      if (defs.has(description)) {
        // the description for that word is already in the jsonObj
        JSONArray transl = defs.getJSONArray(description);
        for (Object i : transl) {
          if (translation.equals(i.toString())) {
            // the entered translation (for that word, with that description) was already in the db
            return;
          }
        }
        // add the translation to the JsonArray of te description
        transl.put(translation);
      }
      else {
        // add an entry (key: description, value:JsonArray with the translation) to the JsonObj of the word
        defs.put(description, new JSONArray(new String[] {translation}));
      }
    }
    else {
      // add an entry (key: word, value: JsonObj(key: description, value: JsonArray with the translation)) to the task file
      JSONArray transl = new JSONArray();
      transl.put(translation);
      JSONObject defs = new JSONObject();
      defs.put(description, transl);
      taskJSON.put(word, defs);
    }

    try (FileWriter file = new FileWriter(taskFile)) {
      file.write(taskJSON.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }



  public static void saveWordAnnotation(File taskFile, String description, String word) throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);

    if (taskJSON.has(description)) {
      JSONArray words = taskJSON.getJSONArray(description);
      for (Object i : words) {
        if (word.equals(i.toString())) {
          return;
        }
      }
      words.put(word);
    }
    else {
      taskJSON.put(description, new JSONArray(new String[] {word}));
    }
    try (FileWriter file = new FileWriter(taskFile)) {
      file.write(taskJSON.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }



  public static void saveDefinitionAnnotation(File taskFile, String word, String hypernym, String definition)
      throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);

    if (taskJSON.has(word)) {
      JSONObject hyp = taskJSON.getJSONObject(word);
      if (hyp.has(hypernym)) {
        JSONArray def = hyp.getJSONArray(definition);
        for (Object i : def) {
          if (definition.equals(i.toString())) {
            return;
          }
        }
        def.put(definition);
      } else {
        hyp.put(hypernym, new JSONArray(new String[] {definition}));
      }
    } else {
      JSONArray def = new JSONArray();
      def.put(definition);
      JSONObject hyp = new JSONObject();
      hyp.put(hypernym, def);
      taskJSON.put(word, hyp);
    }

    try (FileWriter file = new FileWriter(taskFile)) {
      file.write(taskJSON.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }



  public static void saveSenseAnnotation(File taskFile, String word, String description, String[] senses)
      throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);

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

    try (FileWriter file = new FileWriter(taskFile)) {
      file.write(taskJSON.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }



  public static void saveTranslationValidation(File taskFile, String word, String description, String[] translations)
      throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);
    
    Set<String> t = new HashSet<String>();
    for (String s : translations) {
      if(!s.equals("<nessuna>")) {
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

    try (FileWriter file = new FileWriter(taskFile)) {
      file.write(taskJSON.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }



  public static void saveSenseValidation(File taskFile, String word, String example, String sense, String[] answer) throws FileNotFoundException {
    InputStream is = new FileInputStream(taskFile);
    JSONTokener tokener = new JSONTokener(is);
    JSONObject taskJSON = new JSONObject(tokener);

    if (answer[0].equals("Si")) {
      if (taskJSON.has(word)) {
        JSONObject examples = taskJSON.getJSONObject(word);
        if (examples.has(example)) {
          JSONArray senses = examples.getJSONArray(example);
          for (Object i : senses) {
            if (sense.equals(i.toString())) {
              return;
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

      try (FileWriter file = new FileWriter(taskFile)) {
        file.write(taskJSON.toString());
        file.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
