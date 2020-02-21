package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskMyAnnotationServlet", urlPatterns = "/myAnnotation.jsp")
public class TaskMyAnnotationServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;

  /*
   * Path of the task db file.
   */
  private static final String filePath = "/WEB-INF/db/tasks/";
  
  private static final String task = StandardTask.MY_ANNOTATION.toString();
  private static final String taskName = StandardTask.MY_ANNOTATION.getName();

  /*
   * Retrieves the data entered by the user. 
   * Saves the new data in the db file.
   * Redirects to a random task page.
   */
  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String[] word = { request.getParameter("word") };
    String[] example = { request.getParameter("example") };
    String[] words = request.getParameterValues("words");
    String[][] data = { word, example, words };

    File taskFile = new File(request.getServletContext().getRealPath(filePath + taskName + ".json"));
    TaskManager.saveTask(task, taskFile, data);
    response.sendRedirect(TaskManager.randomTask(taskName + ".html"));
  }
}
