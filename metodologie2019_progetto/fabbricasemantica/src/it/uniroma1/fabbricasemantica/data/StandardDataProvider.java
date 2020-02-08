package it.uniroma1.fabbricasemantica.data;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * Questa classe restituisce i dati necessari per il task ricevuto in input.
 * Il metodo {@link #getData(Task)} restituira' una stringa in formato JSON
 * che le pagine in JSweet andranno a formattare.
 * N.B. Il proprio {@link DataProvider} dovrebbe evitare di avere stringhe codificate, questo e' solo un esempio.
 * */
public class StandardDataProvider implements DataProvider<String> {

  @Override
  public String getData(Task task) throws IOException {
    String[] synset = randomSynset();
    if (task == StandardTask.TRANSLATION_ANNOTATION) {
      return "{" +
        "\"word\": \"" + synset[1] + "\"," +
        "\"description\": \"" + synset[4] + "\"" +
        "}";
    }else if (task == StandardTask.WORD_ANNOTATION) {
      return "{\"description\": \"" + synset[4] + "\"}";
    }else if (task == StandardTask.DEFINITION_ANNOTATION) {
      return "{" +
        "\"word\": \"" + synset[1] + "\"," +
        "\"hypernym\": \"" + synset[3] + "\"" +
        "}";
    }else if (task == StandardTask.SENSE_ANNOTATION) {
      // decidere dove mettere la parola giusta --> set?
      String[] syn2 = randomSynset();
      String[] syn3 = randomSynset();
      String[] syn4 = randomSynset();
      return "{" +
        "\"word\": \"" + synset[1] + "\"," +
        "\"description\": \"" + synset[5] + "\"," +
        "\"senses\":" + createJSONArray(synset[4], syn2[4], syn3[4], syn4[4]) +
        "}";
    }else if (task == StandardTask.TRANSLATION_VALIDATION) {
      String[] syn2 = randomSynset();
      String[] syn3 = randomSynset();
      String[] syn4 = randomSynset();
      return "{" +
        "\"word\": \"" + synset[1] + "\"," +
        "\"description\": \"" + synset[4] + "\"," +
        "\"translations\":" + createJSONArray(synset[6], syn2[6], syn3[6], "<nessuna>") +
        "}";
    }else if (task == StandardTask.SENSE_VALIDATION) {
      String def = synset[4];
      Random r = new Random();
      boolean value = r.nextBoolean();
      if (!value) {
        String[] syn2 = randomSynset();
        def = syn2[4];
      }
      return "{" +
        "\"word\": \"" + synset[1] + "\"," +
        "\"example\": \"" + synset[5] + "\"," +
        "\"sense\": \"" + def + "\"" +
        "}";
    } else if (task == StandardTask.MY_ANNOTATION) {
      String[] syn2 = randomSynset();
      String[] syn3 = randomSynset();
      String[] syn4 = randomSynset();
      return "{\"word\":\"" + synset[1] + "\"," +
        "\"example\": \"" + synset[5] + "\"," +
        "\"words\":" + createJSONArray(synset[2], syn2[1], syn3[1], syn4[1]) + 
        "}";
    }
    return null;
  }

  public String[] randomSynset() throws IOException {
    ClassLoader cl = getClass().getClassLoader();
    File file = new File(cl.getResource("./wordsDB.txt").getFile());
    int r = new Random().nextInt(1910);
    Scanner sc = new Scanner(file); 
    String synset = "";
    for (int idx = 0; idx < r; idx++) {
      synset = sc.nextLine();
    } 
    String[] s2 = synset.split("#");
    String[] s1 = s2[0].split(" ");
    String[] s = {s1[0], s1[1], s1[2], s1[3], s2[1], s2[2], s2[3]};
    return s;
  }

  public String createJSONArray(String s1, String s2, String s3, String s4) {
    String[] arr = { s1, s2, s3, s4}; 
    Set<String> set = new HashSet<>(Arrays.asList(arr)); 
    String result = "";
    for (String s : set) {
      result += "\"" + s + "\",";
    }
    return "[" + result.substring(0, result.length() - 1) + "]";
  }
}
