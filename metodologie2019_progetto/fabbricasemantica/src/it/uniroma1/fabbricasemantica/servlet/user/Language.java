package it.uniroma1.fabbricasemantica.servlet.user;

public enum Language {
  IT("Italiano"),
  EN("English");

  private final String name;

  private Language(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  // per avere l'oggetto Language da una stringa (si può fare in un altro modo?)
  public static Language getLanguage(String s) {
    if (s.equals("Italiano")) return IT;
    if (s.equals("English")) return EN;
    else return null;
  }
}
