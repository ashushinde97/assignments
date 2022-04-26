package com.hibernate;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUser {

	public static void main(String[] args) {
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		UserDAO udao = (UserDAO) objAC.getBean("userdao");
		User objE = new User();
		int ch;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"1. get all records \n 2. Search by first name \n 3. Search by email \n 4. Search by mob. no \n 5. Update record ");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				List<User> ulist = udao.getUser();
				for (User e : ulist) {
					System.out.println(
							e.getFirstname() + "\t" + e.getLastname() + "\t " + e.getAdd1() + "\t" + e.getAdd2() + "\t"
									+ e.getDob() + "\t" + e.getEmail() + "\t" + e.getCity() + "\t" + e.getMobile());
				}
				break;
			case 2:
				String f;
				System.out.println("Enter first name");
				f = sc.nextLine();
				List<User> ur = udao.getUserByFirstname(f);
				for (User e : ur) {
					if (f.equals(e.getFirstname())) {
						System.out.println(e.getFirstname() + "\t" + e.getLastname() + "\t " + e.getAdd1() + "\t"
								+ e.getAdd2() + "\t" + e.getDob() + "\t" + e.getEmail() + "\t" + e.getCity() + "\t"
								+ e.getMobile());
					}
				}
				break;
			case 3:
				String f1;
				System.out.println("Enter email");
				f1 = sc.nextLine();
				List<User> email = udao.getUserByFirstname(f1);
				for (User e : email) {
					if (f1.equals(e.getEmail())) {
						System.out.println(e.getFirstname() + "\t" + e.getLastname() + "\t " + e.getAdd1() + "\t"
								+ e.getAdd2() + "\t" + e.getDob() + "\t" + e.getEmail() + "\t" + e.getCity() + "\t"
								+ e.getMobile());
					}
				}
				break;
			case 4:
				String f2;
				System.out.println("Enter Mobile No");
				f2 = sc.nextLine();
				List<User> mob = udao.getUserByFirstname(f2);
				for (User e : mob) {
					if (f2.equals(e.getMobile())) {
						System.out.println(e.getFirstname() + "\t" + e.getLastname() + "\t " + e.getAdd1() + "\t"
								+ e.getAdd2() + "\t" + e.getDob() + "\t" + e.getEmail() + "\t" + e.getCity() + "\t"
								+ e.getMobile());
					}
				}
				break;
			case 5:
				String a = "", b = "", c = "", d = "", e = "", q = "", g = "", h = "", i = "";
				int z;
				while (true) {
					System.out.println("Enter id");
					z = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter First Name");
					a = sc.nextLine();
					System.out.println("Enter Last Name");
					b = sc.nextLine();
					System.out.println("Enter add1");
					c = sc.nextLine();
					System.out.println("Enter add2");
					d = sc.nextLine();
					System.out.println("Enter date of birth");
					e = sc.nextLine();
					System.out.println("Enter email");
					q = sc.nextLine();
					System.out.println("Enter password");
					g = sc.nextLine();
					System.out.println("Enter city");
					h = sc.nextLine();
					System.out.println("Enter mobile");
					i = sc.nextLine();
					objE.setId(z);
					objE.setFirstname(a);
					objE.setLastname(b);
					objE.setAdd1(c);
					objE.setAdd2(d);
					objE.setDob(e);
					objE.setEmail(q);
					objE.setPassword(g);
					objE.setCity(h);
					objE.setMobile(i);
					udao.updateUser(objE);
					System.out.println("want to do more 1 for yes 0 for no");
					ch = sc.nextInt();
					if (ch == 0)
						break;
				}
				break;
			}
		}

	}

}
