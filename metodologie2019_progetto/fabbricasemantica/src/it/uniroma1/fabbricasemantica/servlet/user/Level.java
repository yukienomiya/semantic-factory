package it.uniroma1.fabbricasemantica.servlet.user;

/**
 * Represents the language knowledge levels.
 * Based on the Common European Framework of Reference for Languages (CEFR).
 */
public enum Level {
  A1,
  A2,
  B1,
  B2,
  C1,
  C2;

  /**
   * Returns the Level from its string representation.
   * @return [the Level]
   * @param s [the string that represents the Level]
   */
  public static Level getLevel(String s) {
    return valueOf(s);
  }
}
