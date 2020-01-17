package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskTranslationAnnotationServlet", urlPatterns = "/translationAnnotation.jsp")
public class TaskTranslationAnnotationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String filePath = "/WEB-INF/db/tasks/";
    String translation = request.getParameter("translation");
    String word = request.getParameter("word");
    String description = request.getParameter("description");

    File taskFile = new File(request.getServletContext().getRealPath(filePath + "translationAnnotation.json"));
    TaskManager.saveTranslationAnnotation(taskFile, word, description, translation);
		response.sendRedirect(TaskManager.randomTask("translationAnnotation.html"));
	}

}
