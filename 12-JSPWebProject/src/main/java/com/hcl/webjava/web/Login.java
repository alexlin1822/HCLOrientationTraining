package com.hcl.webjava.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.webjava.utility.*;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 8367150559057528621L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Getting data from "index.jsp"
		String sUsername = req.getParameter("username");
		String sPassword = req.getParameter("password");

		try {
			// Check user name and password
			if (DBHandling.checkUser(sUsername, sPassword) > 0) {
				// redirects to successful.jsp when user name and password are correct.
				resp.sendRedirect("successful.jsp");
			} else {
				HttpSession s = req.getSession();
			}
		} catch (ClassNotFoundException e) {
			System.out.print(e);
		}
	}

}
