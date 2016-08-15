package com.hand.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hand.Entity.Actor;
import com.hand.Entity.FilmActor;
import com.hand.Service.ActorService;
import com.hand.Service.FilmActorService;
import com.hand.ServiceImpl.ActorServiceImpl;

/**
 * Servlet implementation class getActors
 */
public class getActors extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getActors() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  ServletContext servletContext = this.getServletContext();  
	      WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(servletContext);  
	      ActorService actorService= (ActorService)context.getBean("actorService"); 
	      FilmActorService filmActorService= (FilmActorService)context.getBean("filmActorService"); 
		  List<Actor> actors=actorService.getAllActors(); 
		  FilmActor fa=filmActorService.getAllActorbyfilmid(1);
		  System.out.println(fa.getActor().toString());
		  request.setAttribute("actors",actors);
		  request.getRequestDispatcher("ActorList.jsp").forward(request,response);
	}
}
