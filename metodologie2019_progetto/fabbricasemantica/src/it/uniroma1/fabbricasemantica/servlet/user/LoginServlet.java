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
  private static final String filePath = "/WEB-INF/db/users/";
  private static final String homeUrl = "home.html";
  private static final String loginUrl = "login.html";

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
        response.sendRedirect(homeUrl);
      } else {
        response.sendRedirect(loginUrl);
      }
    } catch (NullPointerException e) {
      response.sendRedirect(loginUrl);
    }
  }
}
