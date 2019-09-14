package it.uniroma1.fabbricasemantica.servlet.user;

import java.util.List;

public class User {
  private String username; // email che fa anche da id
  private String password;
  private List<Language> natLanguages;
  private List<Pair<Language, Level>> otherLanguages; // Language e Level come classi annidate?

  public User(String username, String password, List<Language> natLanguages, List<Pair<Language, Level>> otherLanguages) {
    this.username = username;
    this.password = password;
    this.natLanguages = natLanguages;
    this.otherLanguages = otherLanguages;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public List<Language> getNatLanguages() {
    return natLanguages; 
  }

  public List<Pair<Language, Level>> getOtherLanguages() {
    return otherLanguages;
  }
}
