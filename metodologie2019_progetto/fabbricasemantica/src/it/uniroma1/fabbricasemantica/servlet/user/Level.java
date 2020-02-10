package it.uniroma1.fabbricasemantica.servlet.user;

public enum Level {
  A1,
  A2,
  B1,
  B2,
  C1,
  C2;

  public static Level getLevel(String s) {
    return valueOf(s);
  }
}
