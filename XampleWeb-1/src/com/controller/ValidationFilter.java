package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFilter
 */
@WebFilter("/stdreg")
public class ValidationFilter implements Filter
{

	public void destroy()
	{
		System.out.println("Filter is Destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{

		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int marks = 0;

		try
		{
			marks = Integer.parseInt(request.getParameter("marks"));
		}
		catch (Exception ex)
		{

		}

		if (name.equals(""))
		{
			out.println("Name is Required");
		}
		else if (email.equals(""))
		{
			out.println("Email is Required");
		}
		else if (marks == 0)
		{
			out.println("Marks is Required");
		}
		else
		{
			out.println("<div style='color:green;'>");
			chain.doFilter(request, response);
			out.println("</div> ");
		}

		// pass the request along the filter chain
		// chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		String value = fConfig.getInitParameter("Key");
		System.out.println(value + " of Key filter Parameter");
	}

}
