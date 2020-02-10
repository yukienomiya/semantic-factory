package it.uniroma1.fabbricasemantica.data;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class StandardDataProvider implements DataProvider<String> {
  private static String dbFile = "./wordsDB.txt";

  @Override
  public String getData(Task task) throws IOException {
    String[] synset = randomSynset();
    String word = synset[1];
    String synonym = synset[2];
    String hyperonym = synset[3];
    String description = synset[4];
    String example = synset[5];
    String translation = synset[6];
    if (task == StandardTask.TRANSLATION_ANNOTATION) {
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"description\": \"" + description + "\"" +
        "}";
    }else if (task == StandardTask.WORD_ANNOTATION) {
      return "{\"description\": \"" + description + "\"}";
    }else if (task == StandardTask.DEFINITION_ANNOTATION) {
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"hypernym\": \"" + hyperonym + "\"" +
        "}";
    }else if (task == StandardTask.SENSE_ANNOTATION) {
      String[] syn2 = randomSynset();
      String[] syn3 = randomSynset();
      String[] syn4 = randomSynset();
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"description\": \"" + example + "\"," +
        "\"senses\":" + createJSONArray(description, syn2[4], syn3[4], syn4[4]) +
        "}";
    }else if (task == StandardTask.TRANSLATION_VALIDATION) {
      String[] syn2 = randomSynset();
      String[] syn3 = randomSynset();
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"description\": \"" + description + "\"," +
        "\"translations\":" + createJSONArray(translation, syn2[6], syn3[6], "<nessuna>") +
        "}";
    }else if (task == StandardTask.SENSE_VALIDATION) {
      String def = description;
      Random r = new Random();
      boolean value = r.nextBoolean();
      if (!value) {
        String[] syn2 = randomSynset();
        def = syn2[4];
      }
      return "{" +
        "\"word\": \"" + word + "\"," +
        "\"example\": \"" + example + "\"," +
        "\"sense\": \"" + def + "\"" +
        "}";
    } else if (task == StandardTask.MY_ANNOTATION) {
      String[] syn2 = randomSynset();
      String[] syn3 = randomSynset();
      String[] syn4 = randomSynset();
      return "{\"word\":\"" + synset[1] + "\"," +
        "\"example\": \"" + example + "\"," +
        "\"words\":" + createJSONArray(synonym, syn2[1], syn3[1], syn4[1]) + 
        "}";
    }
    return null;
  }

  public String[] randomSynset() throws IOException {
    ClassLoader cl = getClass().getClassLoader();
    File file = new File(cl.getResource(dbFile).getFile());
    // conta le righe del file
    Scanner sc = new Scanner(file);
    int count = 0;
    while (sc.hasNextLine()) {
      count++;
      sc.nextLine();
    }
    sc.close();
    // prende una riga a caso
    int rand = new Random().nextInt(count);
    String synset = "";
    Scanner sc2 = new Scanner(file);
    for (int idx = 0; idx < rand; idx++) {
      synset = sc2.nextLine();
    } 
    sc2.close();
    
    String[] synsetData2 = synset.split("#");
    String[] synsetData1 = synsetData2[0].split(" ");
    String offset = synsetData1[0];
    String word = synsetData1[1];
    String synonym = synsetData1[2];
    String hyperonym = synsetData1[3];
    String description = synsetData2[1];
    String example = synsetData2[2];
    String translation = synsetData2[3];

    String[] s = {offset, word, synonym, hyperonym, description, example, translation};
    return s;
  }

  public String createJSONArray(String s1, String s2, String s3, String s4) {
    String[] arr = {s1, s2, s3, s4}; 
    Set<String> set = new HashSet<>(Arrays.asList(arr)); 
    String result = "";
    for (String s : set) {
      result += "\"" + s + "\",";
    }
    return "[" + result.substring(0, result.length() - 1) + "]";
  }
}
