package com.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDAO;
import com.springjdbc.model.Student;


public class StudentMain {

	public static void main(String[] args) {
		int ch;
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAO objed = (StudentDAO) objAC.getBean("edao");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("choose option \n 1. Add Records \n 2. delete \n 3. get all records");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				String a = "", b = "", c = "", d = "", e = "", f = "", g = "", h = "", i = "", j = "", k = "", l = "",
						m = "", n = "";
				int o;
				while (true) 
				{
					
					System.out.println("Enter FirstName");
					a = sc.nextLine();
					System.out.println("Enter LastName");
					b = sc.nextLine();
					System.out.println("Enter Father Name");
					c = sc.nextLine();
					System.out.println("Enter Mother Name");
					d = sc.nextLine();
					System.out.println("Enter Class Name");
					e = sc.nextLine();
					System.out.println("Enter Section");
					f = sc.nextLine();
					System.out.println("Enter Date of birth");
					g = sc.nextLine();
					System.out.println("Enter date of addmission");
					h = sc.nextLine();
					System.out.println("Enter gender");
					i = sc.nextLine();
					System.out.println("Enter address line 1");
					j = sc.nextLine();
					System.out.println("Enter address line 2");
					k = sc.nextLine();
					System.out.println("Enter Student phone no");
					l = sc.nextLine();
					System.out.println("Enter parent phone no");
					m = sc.nextLine();
					System.out.println("Enter parent email");
					n = sc.nextLine();
					System.out.println("Enter city");
					o = sc.nextInt();
					Student objE = new Student();
					objE.setFirstname(a);
					objE.setLastname(b);
					objE.setFathername(c);
					objE.setMothername(d);
					objE.setClassname(e);
					objE.setSection(f);
					objE.setDob(g);
					objE.setDate_of_addmission(h);
					objE.setGender(i);
					objE.setAdd1(j);
					objE.setAdd2(k);
					objE.setS_phone(l);
					objE.setP_phone(m);
					objE.setP_email(n);
					objE.setCityid(o);

					System.out.println("Total record saved:- " + objed.saveStudent(objE));
					System.out.println("want to do more 1 for yes 0 for no");
					ch = sc.nextInt();
					if (ch == 0)
						break;
				} // end of while
				break;
			case 2:
				int p;
				System.out.println("Enter id");
				p = sc.nextInt();
				System.out.println("Total Record Deleted:- "+objed.deleteStudent(p));
				break;
			case 3:
				List<Student> sli=objed.getAllRecordstu();
				for(Student s : sli)
				{
					System.out.println(s.getFirstname()+"\t"+s.getFathername()+"\t"+s.getLastname()+"\t"+s.getMothername()+"\t"+s.getClassname()+"\t"+s.getDob()+"\t"+s.getDate_of_addmission()+"\t"+s.getAdd1()+"\t"+s.getAdd2()+"\t"+s.getCityid());
				}
				break;
			default:
				System.out.println("Wrong option");
			}
		} // end of outer while
	}

}
