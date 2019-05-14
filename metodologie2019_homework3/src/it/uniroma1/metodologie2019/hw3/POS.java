package it.uniroma1.metodologie2019.hw3;

/**
 * Represents a Part of Speech Type.
 */
public enum POS {

  /**
   * Noun.
   * @param "n" [String abbreviation of the costant.
   */
  NOUN("n"),

  /**
   * Verb.
   * @param "v" [String abbreviation of the costant.]
   */
  VERB("v"),

  /**
   * Adjective.
   * @param "a" [String abbreviation of the costant.]
   */
  ADJECTIVE("a"),

  /**
   * Adverb.
   * @param "r" [String abbreviation of the costant.]
   */
  ADVERB("r");


  /**
   * String abbreviation of the costant.
   */
  private final String str;

  /**
   * Constructs a POS costant with str as the String abbreviation.
   * @param str [String abbreviation of the costant]
   */
  private POS(String str) {
    this.str = str;
  }

  /**
   * Returns the enum linked to the String in Input.
   * @param  s [the String that represents one of the POS types]
   * @return   [The enum linked to the input String, if it exists; Null otherwise.]
   */
  public static POS fromStringToPOS(String s) {
    switch (s) {
      case "n": return NOUN;
      case "v": return VERB;
      case "a": return ADJECTIVE;
      case "s": return ADJECTIVE;
      case "r": return ADVERB;
      default: return null;
    }
  }

  /**
   * Returns a String representation of the POS.
   * @return [the String abbreviation of the costant]
   */
  @Override
  public String toString() {
    return str;
  }
}
