package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "HomeServlet", urlPatterns = "/home.jsp")
public class HomeServlet extends BaseServlet {
private static final long serialVersionUID = 1L;

  /*
   * Url of the Login page.
   */
  private static final String loginUrl = "login.html";

  /*
   * If the user is logged in, it redirects to a random task page.
   * Redirects to the Login page otherwise.
   */
  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    boolean isLoggedIn = session.getAttribute("username") != null;
    if (isLoggedIn) {
      response.sendRedirect(TaskManager.randomTask());
    }
    else {
      response.sendRedirect(loginUrl);
    }
  }
}
