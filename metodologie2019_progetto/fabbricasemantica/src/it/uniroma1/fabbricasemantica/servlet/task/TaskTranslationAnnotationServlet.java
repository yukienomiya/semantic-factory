package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskTranslationAnnotationServlet", urlPatterns = "/translationAnnotation.jsp")
public class TaskTranslationAnnotationServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;
  private static final String filePath = "/WEB-INF/db/tasks/";
  private static final String task = StandardTask.TRANSLATION_ANNOTATION.toString();
  private static final String taskName = StandardTask.TRANSLATION_ANNOTATION.getName();

  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String[] word = { request.getParameter("word") };
    String[] description = { request.getParameter("description") };
    String[] translation = { request.getParameter("translation") };
    String[][] data = { word, description, translation };

    File taskFile = new File(request.getServletContext().getRealPath(filePath + taskName + ".json"));
    TaskManager.saveTask(task, taskFile, data);
    response.sendRedirect(TaskManager.randomTask(taskName + ".html"));
  }

}
