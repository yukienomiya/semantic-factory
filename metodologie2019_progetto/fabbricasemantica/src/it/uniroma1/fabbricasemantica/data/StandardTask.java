package it.uniroma1.fabbricasemantica.data;

/* 
 * Represents the StandardTask of FS.
*/
public enum StandardTask implements Task {

  /**
   * Task: "given a word and its definition, guess the translation"
   * @param "translationAnnotation" [Name of the task]
   */
  TRANSLATION_ANNOTATION("translationAnnotation"),

  /**
   * Task: "given a definition, guess the word"
   * @param "wordAnnotation" [Name of the task]
   */
  WORD_ANNOTATION("wordAnnotation"),

  /**
   * Task: "given a word and its hypernym, guess its definition"
   * @param "definitionAnnotation" [Name of the task]
   */
  DEFINITION_ANNOTATION("definitionAnnotation"),

  /**
   * Task: "given a word and an example of its use, guess its definition"
   * @param "senseAnnotation" [Name of the task]
   */
  SENSE_ANNOTATION("senseAnnotation"),

  /**
   * Task: "given a word and its definition, guess its translation "
   * @param "translationValidation" [Name of the task]
   */
  TRANSLATION_VALIDATION("translationValidation"),

  /**
   * Task: "given a word, an example of its use and a definition, guess whether the definition describes the word or not"
   * @param "senseValidation" [Name of the task]
   */
  SENSE_VALIDATION("senseValidation"),

  /**
   * Task: "given a word and an example of its use, guess its synonym"
   * @param "myAnnotation" [Name of the task]
   */
  MY_ANNOTATION("myAnnotation");

  /*
   * The name of the Task.
   */
  private String name;

  /**
   * Constructs a StandardTask with "name" as its name.
   * @param name [Name of the task]
   */
  private StandardTask(String name) {
    this.name = name;
  }

  /**
   * Returns the StandardTask's name.
   * @return name [Name of the task]
   */
  public String getName() {
    return this.name;
  }
}
