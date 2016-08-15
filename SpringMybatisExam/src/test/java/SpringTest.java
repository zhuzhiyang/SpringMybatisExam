
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.Entity.Actor;
import com.hand.Entity.Address;
import com.hand.Entity.Customer;
import com.hand.Service.ActorService;
import com.hand.Service.AddressService;
import com.hand.Service.CustomerService;
import com.hand.Service.FilmService;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");		
		AddressService addressService= (AddressService)ac.getBean("addressService"); 
		CustomerService customerService= (CustomerService)ac.getBean("customerService");
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
		 if(address==null)
	     {
	    	System.out.println("你输入的地址ID不存在,请重新输入！");
	    	address_id=scanner.nextInt();
	    	address=addressService.findById(address_id);
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

}
