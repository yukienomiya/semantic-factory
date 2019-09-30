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
  // per sicurezza, li sto facendo entrambi, almeno sono sicura funga tutto
  public static Language getLanguage(String s) {
    if (s.equals("Italiano") || s.equals("IT")) return IT;
    if (s.equals("English") || s.equals("EN")) return EN;
    else return null;
  }
}
