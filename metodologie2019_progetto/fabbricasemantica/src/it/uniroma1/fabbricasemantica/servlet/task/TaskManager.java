package it.uniroma1.fabbricasemantica.servlet.task;

import java.util.Random;

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
}
