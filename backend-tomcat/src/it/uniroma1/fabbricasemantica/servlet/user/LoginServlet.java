package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.IOUtils;

import org.json.JSONObject;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;


@WebServlet(name="LoginServlet", urlPatterns="/login.jsp")
public class LoginServlet extends BaseServlet {
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
   * Url of the Login page.
   */
  private static final String loginUrl = "login.html";

  /*
   * Access the user db file and checks whether the user is signed up or not. 
   * A file "username.json" is created for each user when they sign up on FS.
   * (Therefore if the file doesn't exist, the user with that username is not signed up).
   */
  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("email");
    String password = request.getParameter("password");

    ServletContext context = getServletContext();
    try {
      InputStream is = context.getResourceAsStream(filePath + username + ".json");
      String obj = IOUtils.toString(is);
      JSONObject jsonProps = new JSONObject(obj);

      if (UserManager.verify(jsonProps, password)) {
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        // redirect to the Home page if the user is Signed Up and the password is correct.
        response.sendRedirect(homeUrl);
      } else {
        // redirect to the Login page if the password is not correct.
        response.sendRedirect(loginUrl);
      }
    } catch (NullPointerException e) {
      // redirect to the Login page if the user is not Signed Up.
      response.sendRedirect(loginUrl);
    }
  }
}
