package Servlet_lifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/demo")
public class Demo implements Servlet
{
static
{
	System.out.println("Class is loaded");
}
public Demo()
{
	System.out.println("object for Demo is created");
}
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method is called");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method is called");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method is called");
	}

}
