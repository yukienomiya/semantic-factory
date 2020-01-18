package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskSenseAnnotationServlet", urlPatterns = "/senseAnnotation.jsp")
public class TaskSenseAnnotationServlet extends BaseServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String filePath = "/WEB-INF/db/tasks/";
    String[] word = {request.getParameter("word")};
    String[] description = {request.getParameter("description")};
    String[] senses = request.getParameterValues("senses");
    String[][] data = {word, description, senses};

    File taskFile = new File(request.getServletContext().getRealPath(filePath + "senseAnnotation.json"));
    TaskManager.saveTask("senseAnnotation", taskFile, data);
    response.sendRedirect(TaskManager.randomTask("senseAnnotation.html"));
  }

}
