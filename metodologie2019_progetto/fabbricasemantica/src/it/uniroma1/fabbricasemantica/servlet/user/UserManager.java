package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserManager {

  /*
   * Verifies if the password entered is equal to the one saved in the User
   * details.
   * @param userDetails [The JSONObject from the user db file.]
   * @param pwd [The password entered by the User]
   * @return {@code true} if the entered password is correct, {@code false} otherwise.
   */
    public static boolean verify(JSONObject userDetails, String pwd) {
    String secret = userDetails.getString("secret");
    String pwdEncoded = encode(pwd);
    return pwdEncoded.equals(secret);
  }

  /*
   * Signs up the user (writes its details in the relative file in the db).
   * @param user [The User Object ]
   * @param usersFile [The user's db file.]
   */
  public static void signUp(User user, File usersFile) {
    JSONObject userDetails = new JSONObject();
    userDetails.put("username", user.getUsername());

    String secret = encode(user.getPassword());
    userDetails.put("secret", secret);

    JSONArray nat = new JSONArray();
    for (Language l : user.getNatLanguages()) {
      nat.put(l.toString());
    }
    userDetails.put("nativeLanguage", nat);

    JSONArray other = new JSONArray();
    for (Pair<Language, Level> p : user.getOtherLanguages()) {
      other.put(p.toString());
    }
    userDetails.put("otherLanguage", other);

    try (FileWriter file = new FileWriter(usersFile)) {
      file.write(userDetails.toString());
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /*
   * (TODO) This method should encode the password, in order to save it in the db encripted.
   * @param pwd [The password entered by the User]
   * @return the encoded password.
   */
  public static String encode(String pwd) {
    return pwd;
  }
}
