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

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		boolean isLoggedIn = session.getAttribute("username") != null;
		if (isLoggedIn) {
			response.sendRedirect(TaskManager.randomTaskSKIP());
		}
		else {
			response.sendRedirect("login.html");
		}
	}
}
