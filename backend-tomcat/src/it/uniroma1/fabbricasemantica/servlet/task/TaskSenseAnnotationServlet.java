package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskSenseAnnotationServlet", urlPatterns = "/senseAnnotation.jsp")
public class TaskSenseAnnotationServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;

  /*
   * Path of the task db file.
   */
  private static final String filePath = "/WEB-INF/db/tasks/";

  private static final String task = StandardTask.SENSE_ANNOTATION.toString();
  private static final String taskName = StandardTask.SENSE_ANNOTATION.getName();

  /*
   * Retrieves the data entered by the user. 
   * Saves the new data in the db file.
   * Redirects to a random task page.
   */
  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String[] word = {request.getParameter("word")};
    String[] description = {request.getParameter("description")};
    String[] senses = request.getParameterValues("senses");
    String[][] data = {word, description, senses};

    File taskFile = new File(request.getServletContext().getRealPath(filePath + taskName + ".json"));
    TaskManager.saveTask(task, taskFile, data);
    response.sendRedirect(TaskManager.randomTask(taskName + ".html"));
  }

}
