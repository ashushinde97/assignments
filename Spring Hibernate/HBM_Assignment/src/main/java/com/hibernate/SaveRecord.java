package com.hibernate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.User;
import com.hibernate.UserDAO;

public class SaveRecord {

	public static void main(String[] args) {
			
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		UserDAO udao = (UserDAO) objAC.getBean("userdao");
		User objE = new User();
		String a="",b="",c="",d="",e="",f="",g="",h="",i="";
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("Enter First Name");
			a=sc.nextLine();
			System.out.println("Enter Last Name");
			b=sc.nextLine();
			System.out.println("Enter add1");
			c=sc.nextLine();
			System.out.println("Enter add2");
			d=sc.nextLine();
			System.out.println("Enter date of birth");
			e=sc.nextLine();
			System.out.println("Enter email");
			f=sc.nextLine();
			System.out.println("Enter password");
			g=sc.nextLine();
			System.out.println("Enter city");
			h=sc.nextLine();
			System.out.println("Enter mobile");
			i=sc.nextLine();
			objE.setFirstname(a);
			objE.setLastname(b);
			objE.setAdd1(c);
			objE.setAdd2(d);
			objE.setDob(e);
			objE.setEmail(f);
			objE.setPassword(g);
			objE.setCity(h);
			objE.setMobile(i);
			udao.saveUser(objE);
			
			System.out.println("want to do more 1 for yes 0 for no");
			int ch;
			ch = sc.nextInt();
			if (ch == 0)
				break;
		}

	}

}
