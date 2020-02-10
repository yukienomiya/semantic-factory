package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskTranslationValidationServlet", urlPatterns = "/translationValidation.jsp")
public class TaskTranslationValidationServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;
  private static final String filePath = "/WEB-INF/db/tasks/";
  private static final String task = StandardTask.TRANSLATION_VALIDATION.toString();
  private static final String taskName = StandardTask.TRANSLATION_VALIDATION.getName();

  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String[] word = { request.getParameter("word") };
    String[] description = { request.getParameter("description") };
    String[] translations = request.getParameterValues("translations");
    String[][] data = {word, description, translations};

    File taskFile = new File(request.getServletContext().getRealPath(filePath + taskName + ".json"));
    TaskManager.saveTask(task, taskFile, data);
    response.sendRedirect(TaskManager.randomTask(taskName + ".html"));
  }
}
