package com.hcl.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		Users u1=new Users();
		u1.setUsername(uname);
		u1.setPassword(pwd);
		req.setAttribute("abc", u1);
		
		boolean status=u1.validateUserNamePwd();
		if (status) {
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
			rd.forward(req, res);
		}
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}
	
	
	

}
