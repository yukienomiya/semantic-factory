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
  private static final String filePath = "/WEB-INF/db/users/";
  private static final String homeUrl = "home.html";
  private static final String signupUrl = "signup.html";

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

    // TODO valida input

    File usersFile = new File(request.getServletContext().getRealPath(filePath + username + ".json"));

    // se lo username non è gia registrato e la password e conferma password sono uguali, inizia a costruire lo User
    if ((!usersFile.exists()) && (password.equals(password2))) {
      List<Language> nat = new ArrayList<>();
      for (String s : cbNativeLang) {
        if (s != null) {
          nat.add(Language.getLanguage(s));
        }
      }

      // Le lingue aggiuntive.
      // Non sapevo come farle meglio, quindi ho fatto i due casi separati (per ora devo solo fare queste due lingue)
      List<Pair<Language, Level>> other = new ArrayList<>();
      if (cbItOther != null) {
        Level levelIT = Level.getLevel(livIt);
        Pair<Language, Level> p1 = new Pair<>(Language.IT, levelIT);
        other.add(p1);
      }

      if (cbEnOther != null) {
        Level levelEn = Level.getLevel(livEn);
        Pair<Language, Level> p2 = new Pair<>(Language.EN, levelEn);
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
