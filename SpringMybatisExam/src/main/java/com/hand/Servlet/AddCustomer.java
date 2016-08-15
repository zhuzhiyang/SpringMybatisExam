package com.hand.Servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hand.Entity.Address;
import com.hand.Entity.Customer;
import com.hand.Service.ActorService;
import com.hand.Service.AddressService;
import com.hand.Service.CustomerService;
import com.hand.Service.PaymentService;
import com.hand.Service.RentalSercvice;

/**
 * Servlet implementation class AddCustomer
 */
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomer() {
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
		ServletContext servletContext = this.getServletContext();  
	    WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(servletContext);  
		AddressService addressService= (AddressService)context.getBean("addressService"); 
		CustomerService customerService= (CustomerService)context.getBean("customerService");
        Scanner scanner=new Scanner(System.in);
		System.out.println("请输入First_name");
		String first_name= scanner.next();
		System.out.println("请输入Last_name");
		String last_name= scanner.next();
		System.out.println("请输入Email");
		String email= scanner.next();
		System.out.println("请输入address_id");
		int address_id=scanner.nextInt();
		Address address=addressService.findById(address_id);
		int i=0;
		while(i==0)
		{
		 if(address.getAddress_id()==null)
	     {
	    	System.out.println("你输入的地址ID不存在,请重新输入！");
	    	address_id=scanner.nextInt();
	      }
		  else
		  {
			 i=1;
		  }
		}
		Timestamp create_date = new Timestamp(System.currentTimeMillis());
		Customer c=new Customer();
		c.setFirst_name(first_name);
		c.setLast_name(last_name);
		c.setEmail(email);
		c.setAddress_id(address_id);
		c.setCreate_date(create_date);
		customerService.addCustomer(c);
		System.out.println("请输入你要删除CUSTOMER的ID");
		int id=scanner.nextInt();
		customerService.deleteCustomer(id);
		System.out.println("删除成功！");
		
	}
//  public  boolean  JudgeAddressid(int address_id){
//	  AddressService addressService= (AddressService)context.getBean("addressService"); 
//	  Address address=addressService.findById(address_id);
//	  Boolean result=false;
//	  if(address.getAddress_id()!=null)
//	  {
//	    	result=true; 
//	    }
//	 return result;
//  }
}
