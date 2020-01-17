package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskDefinitionAnnotationServlet", urlPatterns = "/definitionAnnotation.jsp")
public class TaskDefinitionAnnotationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filePath = "/WEB-INF/db/tasks/";
    String definition = request.getParameter("definition");
    String word = request.getParameter("word");
    String hypernym = request.getParameter("hypernym");

    File taskFile = new File(request.getServletContext().getRealPath(filePath + "definitionAnnotation.json"));
    TaskManager.saveDefinitionAnnotation(taskFile, word, hypernym, definition);
		response.sendRedirect(TaskManager.randomTask("definitionAnnotation.html"));
	}

}
