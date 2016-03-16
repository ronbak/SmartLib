package com.test.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.util.ConnectionUtil;

/**
 * Servlet implementation class LogServlet
 */
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
        
        System.out.println("action"+action);
        
            login(request, response);
	}
	   protected void login(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	        
			String u_num=request.getParameter("u_num");
	        String u_password=request.getParameter("u_password");
	        
			System.out.println("phone number ::: "+u_num);
	        
			System.out.println("password ::: "+u_password);
	        
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        try {
	            connection = ConnectionUtil.openConnection();

	            String query="select U_NAME,u_num,u_password from user_details where u_num="+u_num+" and u_password="+u_password+"";
	            preparedStatement = connection.prepareStatement(query);
	            resultSet = preparedStatement.executeQuery();
	            System.out.println(query);
	                    
	            if (resultSet.next())
	            {
	            	System.out.println("valid user");
	                HttpSession session = request.getSession();
	                session.setAttribute("u_num", u_num);
	                session.setAttribute("name", resultSet.getString(1));
	                RequestDispatcher dispatcher = request.getRequestDispatcher("abc.jsp");
	                dispatcher.forward(request, response);
	            } else {
	            	System.out.println("invalid user");
	                RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	                request.setAttribute("message", "Invalid phone number and password");
	                dispatcher.forward(request, response);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	            request.setAttribute("message", "Please try after some time due to some technical problem");
	            dispatcher.forward(request, response);
	        } finally {
	            ConnectionUtil.closeConnection(resultSet, preparedStatement,connection);
	        }
	    }

	    protected void register(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	    }
}
