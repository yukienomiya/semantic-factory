package it.uniroma1.fabbricasemantica.data;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Represents the Standard Data Provider for the tasks examples.
 * The SDP relies on the wordsDB.txt file.
 * The file currently contains about 2000 lines, each representing a synset.
 * Each line has the following structure:
 * "offset word synonym hypernym#description#example#translation"
 */
public class StandardDataProvider implements DataProvider<String> {

  /**
   * Represents the path of the custom db file.
   */
  private static String dbFile = "./wordsDB.txt";

  /**
   * Returns a String containing the example for the task of type "task".
   * 
   * @param task [The task for which data is needed]
   * @return [The string in the JSON format that contains the example.]
   */
  @Override
  public String getData(Task task) throws IOException {
    HashMap<String, String> synset = randomSynset();
    String word = synset.get("word");
    String synonym = synset.get("synonym");
    String hypernym = synset.get("hypernym");
    String description = synset.get("description");
    String example = synset.get("example");
    String translation = synset.get("translation");

    if (task == StandardTask.TRANSLATION_ANNOTATION) {
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"description\": \"" + description + "\"" +
        "}";
    } else if (task == StandardTask.WORD_ANNOTATION) {
      return "{\"description\": \"" + description + "\"}";
    } else if (task == StandardTask.DEFINITION_ANNOTATION) {
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"hypernym\": \"" + hypernym + "\"" +
        "}";
    } else if (task == StandardTask.SENSE_ANNOTATION) {
      HashMap<String, String> syn2 = randomSynset();
      HashMap<String, String> syn3 = randomSynset();
      HashMap<String, String> syn4 = randomSynset();
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"description\": \"" + example + "\"," +
        "\"senses\":" + createJSONArray(description, syn2.get("description"), syn3.get("description"), syn4.get("description")) +
        "}";
    } else if (task == StandardTask.TRANSLATION_VALIDATION) {
      HashMap<String, String> syn2 = randomSynset();
      HashMap<String, String> syn3 = randomSynset();
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"description\": \"" + description + "\"," +
        "\"translations\":" + createJSONArray(translation, syn2.get("translation"), syn3.get("translation"), "<nessuna>") +
        "}";
    } else if (task == StandardTask.SENSE_VALIDATION) {
      String def = description;
      Random r = new Random();
      boolean value = r.nextBoolean();
      if (!value) {
        HashMap<String, String> syn2 = randomSynset();
        def = syn2.get("description");
      }
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"example\": \"" + example + "\"," +
        "\"sense\": \"" + def + "\"" +
        "}";
    } else if (task == StandardTask.MY_ANNOTATION) {
      HashMap<String, String> syn2 = randomSynset();
      HashMap<String, String> syn3 = randomSynset();
      HashMap<String, String> syn4 = randomSynset();
      return "{\"word\":\"" + synset.get("word") + "\"," +
        "\"example\": \"" + example + "\"," +
        "\"words\":" + createJSONArray(synonym, syn2.get("word"), syn3.get("word"), syn4.get("word")) + 
        "}";
    }
    return null;
  }

  /**
   * Returns a random synset from the db.
   * @return [The Map that maps the name of the synset field its value for that specific synset.]
   */
  public HashMap<String, String> randomSynset() throws IOException {
    HashMap<String, String> result = new HashMap<>();
    ClassLoader cl = getClass().getClassLoader();
    File file = new File(cl.getResource(dbFile).getFile());

    // Counts the db file's lines.
    Scanner sc = new Scanner(file);
    int count = 0;
    while (sc.hasNextLine()) {
      count++;
      sc.nextLine();
    }
    sc.close();

    // Chooses a random line.
    int rand = new Random().nextInt(count);
    String synset = "";
    Scanner sc2 = new Scanner(file);
    for (int idx = 0; idx < rand; idx++) {
      synset = sc2.nextLine();
    } 
    sc2.close();
    
    String[] synsetData2 = synset.split("#");
    String[] synsetData1 = synsetData2[0].split(" ");
    result.put("offset", synsetData1[0]);
    result.put("word", synsetData1[1]);
    result.put("synonym", synsetData1[2]);
    result.put("hypernym", synsetData1[3]);
    result.put("description", synsetData2[1]);
    result.put("example", synsetData2[2]);
    result.put("translation", synsetData2[3]);
    return result;
  }

  /**
   * Creates a String in the JSON Array format containing the input Strings in
   * random order.
   * 
   * @param s1 [First string]
   * @param s2 [Second string]
   * @param s3 [Third string]
   * @param s4 [Fourth string]
   * @return [The String representing the JSON Array containing the shuffled Strings.]
   */
  public String createJSONArray(String s1, String s2, String s3, String s4) {
    String[] array = {s1, s2, s3, s4}; 
    List<String> list = Arrays.asList(array);
    Collections.shuffle(list);
    String result = "";
    for (String s : list) {
      result += "\"" + s + "\",";
    }
    return "[" + result.substring(0, result.length() - 1) + "]";
  }
}
