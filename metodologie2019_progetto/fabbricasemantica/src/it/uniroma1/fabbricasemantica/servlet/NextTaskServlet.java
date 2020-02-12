package it.uniroma1.fabbricasemantica.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;
import it.uniroma1.fabbricasemantica.servlet.task.TaskManager;

@WebServlet(name = "NextTaskServlet", urlPatterns = "/nextTask.jsp")
public class NextTaskServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;

  /* 
   * Redirects the user to a random task page.
  */
  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect(TaskManager.randomTask());
  }
}
