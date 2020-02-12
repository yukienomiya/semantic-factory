package it.uniroma1.fabbricasemantica.servlet.user;

/**
 * Represents a Language implemented in FS.
 */
public enum Language {
  ITALIANO("Italiano"),
  ENGLISH("English");

  /**
   * Represents the name of the Language.
   */
  private final String name;

  /**
   * Constructs a Language with name as the name.
   * @param name [name of the costant]
   */
  private Language(String name) {
    this.name = name;
  }

  /**
   * Returns a String representation of the Language.
   * @return [name of the costant]
   */
  @Override
  public String toString() {
    return name;
  }

  /**
   * Returns the Language from its string representation.
   * @return [the Language]
   * @param s [the string that represents the Language]
   */
  public static Language getLanguage(String s) {
    return valueOf(s);
  }
}
