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

  public static Language getLanguage(String s) {
    return valueOf(s);
  }
}
