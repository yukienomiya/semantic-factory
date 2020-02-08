package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskMyAnnotationServlet", urlPatterns = "/myAnnotation.jsp")
public class TaskMyAnnotationServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String filePath = "/WEB-INF/db/tasks/";
    String[] word = { request.getParameter("word") };
    String[] example = { request.getParameter("example") };
    String[] words = request.getParameterValues("words");
    String[][] data = { word, example, words };

    File taskFile = new File(request.getServletContext().getRealPath(filePath + "myAnnotation.json"));
    TaskManager.saveTask("myAnnotation", taskFile, data);
    response.sendRedirect(TaskManager.randomTask("myAnnotation.html"));
  }
}
