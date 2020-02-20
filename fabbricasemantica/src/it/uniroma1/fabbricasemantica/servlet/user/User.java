package it.uniroma1.fabbricasemantica.servlet.user;

import java.util.List;

/* 
 * Represents a User object.
*/
public class User {

  private String username;
  private String password;
  private List<Language> natLanguages;
  private List<Pair<Language, Level>> otherLanguages;

  /*
   * Constructs a User object.
   * @param username [The User username is its email address.]
   * @param password [Password chosen by the User.]
   * @param natLanguages [List of the Native Languages of the User.]
   * @param otherLanguages [List of the Other Languages of the User (and the relative Level).]
   */
  public User(String username, String password, List<Language> natLanguages, List<Pair<Language, Level>> otherLanguages) {
    this.username = username;
    this.password = password;
    this.natLanguages = natLanguages;
    this.otherLanguages = otherLanguages;
  }

  /**
   * Returns the username of the User.
   * @return [the username of the User]
   */
  public String getUsername() {
    return username;
  }

  /**
   * Returns the password of the User.
   * @return [the password of the User]
   */
  public String getPassword() {
    return password;
  }

  /**
   * Returns the native languages of the User.
   * @return [the list of native languages of the User]
   */
  public List<Language> getNatLanguages() {
    return natLanguages; 
  }

  /**
   * Returns the other languages of the User.
   * @return [the list of other languages of the User]
   */
  public List<Pair<Language, Level>> getOtherLanguages() {
    return otherLanguages;
  }
}
