package com.hand.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginCheck
 */
public class LoginCheck implements Filter {

    /**
     * Default constructor. 
     */
    public LoginCheck() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest	req=(HttpServletRequest)request;
		HttpServletResponse	reps=(HttpServletResponse)response;
		String path=req.getServletPath();
	
		String flag=(String)req.getSession().getAttribute("result");
	
		if(path.equals("/index.jsp")||path.equals("/login.jsp")||path.equals("/login"))
		{
			chain.doFilter(request, response);
			}
		else if(flag!=null&&flag.equals("loginsuccess"))
		{
			chain.doFilter(request, response);
		
		}
		else
		{
			req.getRequestDispatcher("login.jsp").forward(req, reps);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
