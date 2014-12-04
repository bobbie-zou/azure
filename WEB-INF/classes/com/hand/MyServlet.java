package com.hand;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		String fullName = request.getParameter("fullname").toString();

		out.println("<html>");

		out.println("<head>");

		out.println("<title>Bienvenido</title>");

		out.println("</head>");

		out.println("<body>");

		out.println("<p>Hi " + fullName
				+ ", greetings from JAVA Server environment!! </p>");

		out.println("</body>");

		out.println("</html>");

		out.close();

	}

}
