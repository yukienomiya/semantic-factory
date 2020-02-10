package it.uniroma1.fabbricasemantica.data;

public enum StandardTask implements Task {
  TRANSLATION_ANNOTATION("translationAnnotation"),
  WORD_ANNOTATION("wordAnnotation"),
  DEFINITION_ANNOTATION("definitionAnnotation"),
  SENSE_ANNOTATION("senseAnnotation"),
  TRANSLATION_VALIDATION("translationValidation"),
  SENSE_VALIDATION("senseValidation"),
  MY_ANNOTATION("myAnnotation");

  private String name;

  private StandardTask(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
