package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "LoginCheckServlet", urlPatterns = "/logCheck.jsp")
public class LoginCheckServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		boolean isLoggedIn = session.getAttribute("username") != null;
		PrintWriter out = response.getWriter();
		response.setContentType("boolean");
		out.print(isLoggedIn);
		out.flush();
	}
}
