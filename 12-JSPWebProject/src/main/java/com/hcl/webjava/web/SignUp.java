package com.hcl.webjava.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.webjava.utility.*;

@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 2508215096678706482L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		// Getting data from "signup.jsp"
		String sUsername = req.getParameter("username");
		String sPassword = req.getParameter("password");
		String sEmail = req.getParameter("email");
		
		try {
			//sign up
			DBHandling.signupUser(sUsername,sPassword,sEmail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Go back to index.jsp
		resp.sendRedirect("index.jsp");
	}
}
