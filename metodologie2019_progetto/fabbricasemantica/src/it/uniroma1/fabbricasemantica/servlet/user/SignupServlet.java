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

  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String filePath = "/WEB-INF/db/users/";

    //1. prendere i dati del form (Non trovo un modo piu' carino di farlo, magari lo faccio in seguito)
    String username = request.getParameter("email");
    System.out.println(username);
    String psw = request.getParameter("password");
    System.out.println(psw);
    String psw2 = request.getParameter("password2");
    System.out.println(psw2);
    String[] cbNat = request.getParameterValues("cbNat");
    for (String s : cbNat) {
      System.out.println(s);
    }
    String cbItOther = request.getParameter("cbItalianOther");
    System.out.println("cbItOther: " + cbItOther);
    String cbEnOther = request.getParameter("cbEnglishOther");
    System.out.println("cbEnOther: " + cbEnOther);
    String livIt = request.getParameter("livIT");
    System.out.println("livIt: " + livIt);
    String livEn = request.getParameter("livEN");
    System.out.println("livEn: " + livEn);



    File usersFile = new File(request.getServletContext().getRealPath(filePath + username + ".json"));

    // se lo username non è gia registrato e la psw e conferma psw sono uguali, inizia a costruire lo User
    if ((!usersFile.exists()) && (psw.equals(psw2))) {
      List<Language> nat = new ArrayList<>();
      for (String s : cbNat) {
        if (s != null) {
          nat.add(Language.getLanguage(s));
        }
      }

      // Le lingue aggiuntive.
      // Non sapevo come farle meglio, quindi ho fatto i due casi separati (per ora devo solo fare queste due lingue)
      List<Pair<Language, Level>> other = new ArrayList<>();
      if (cbItOther != null) {
        Level levelIT = Level.getLevel(livIt);
        Pair<Language, Level> p1 = new Pair<>(Language.getLanguage("Italiano"), levelIT);
        other.add(p1);
      }

      if (cbEnOther != null) {
        Level levelEn = Level.getLevel(livEn);
        Pair<Language, Level> p2 = new Pair<>(Language.getLanguage("English"), levelEn);
        other.add(p2);
      }

      User user = new User(username, psw, nat, other);
      UserManager.signUp(user, usersFile);

      HttpSession session = request.getSession();
      session.setAttribute("username", username);
      response.sendRedirect("home.html");

    } else {
      response.sendRedirect("signup.html");
    }
  }
}
