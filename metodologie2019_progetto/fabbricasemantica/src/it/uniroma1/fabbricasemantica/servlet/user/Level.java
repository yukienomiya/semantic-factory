package it.uniroma1.fabbricasemantica.servlet.user;

public enum Level {
  A1,
  A2,
  B1,
  B2,
  C1,
  C2;

  // e' per avere l'oggetto Level da una stringa
  public static Level getLevel(String s) {
    switch(s) {
      case "A1": return Level.A1;
      case "A2": return Level.A2;
      case "B1": return Level.B1;
      case "B2": return Level.B2;
      case "C1": return Level.C1;
      case "C2": return Level.C2;
      default: return null;
    }
  }
}
