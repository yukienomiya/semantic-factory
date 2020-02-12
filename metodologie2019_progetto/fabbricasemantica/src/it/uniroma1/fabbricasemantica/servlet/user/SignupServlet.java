package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name="SignupServlet", urlPatterns="/signup.jsp")
public class SignupServlet extends BaseServlet {
  private static final long serialVersionUID = 8484501789787L;

  /*
   * Path of the user db file.
   */
  private static final String filePath = "/WEB-INF/db/users/";

  /*
   * Url of the Home page.
   */
  private static final String homeUrl = "home.html";

  /*
   * Url of the Signup page.
   */
  private static final String signupUrl = "signup.html";

  /* 
   * If the user is not already signed up and if the data entered is valid, creates the user file, logs the user in and redirects it to the Home page.
   * Otherwise, redirects it to the SignUp page.
  */
  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String username = request.getParameter("email");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
    String[] cbNativeLang = request.getParameterValues("cbNat");
    String cbItOther = request.getParameter("cbItalianOther");
    String cbEnOther = request.getParameter("cbEnglishOther");
    String livIt = request.getParameter("livIT");
    String livEn = request.getParameter("livEN");

    File usersFile = new File(request.getServletContext().getRealPath(filePath + username + ".json"));

    // if the username is not already signed up and if the password is equal to the password confirmation, begin to construct the User object
    if ((!usersFile.exists()) && (password.equals(password2))) {
      // the native languages
      List<Language> nat = new ArrayList<>();
      for (String s : cbNativeLang) {
        if (s != null) {
          nat.add(Language.getLanguage(s));
        }
      }

      // the other languages
      List<Pair<Language, Level>> other = new ArrayList<>();
      if (cbItOther != null) {
        Level levelIT = Level.getLevel(livIt);
        Pair<Language, Level> p1 = new Pair<>(Language.ITALIANO, levelIT);
        other.add(p1);
      }
      if (cbEnOther != null) {
        Level levelEn = Level.getLevel(livEn);
        Pair<Language, Level> p2 = new Pair<>(Language.ENGLISH, levelEn);
        other.add(p2);
      }

      User user = new User(username, password, nat, other);
      UserManager.signUp(user, usersFile);

      HttpSession session = request.getSession();
      session.setAttribute("username", username);
      response.sendRedirect(homeUrl);
    } else {
      response.sendRedirect(signupUrl);
    }
  }
}
