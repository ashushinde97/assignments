package com.springjdbc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springjdbc.model.*;

public class StudentDAO {

	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveStudent(Student objE)
	{
		String query ="insert into student (firstname,lastname,fathername,mothername,classname,section,dob,date_of_addmission,gender,add1,add2,s_phone,p_phone,p_email,cityid)"
				+ " values ('"+objE.getFirstname()+"','"+objE.getLastname()+"','"+objE.getFathername()+"','"+objE.getMothername()+"','"+objE.getClassname()+"','"+objE.getSection()+"','"+objE.getDob()+"','"+objE.getDate_of_addmission()+"','"+objE.getGender()+"','"+objE.getAdd1()+"','"+objE.getAdd2()+"','"+objE.getS_phone()+"','"+objE.getP_phone()+"','"+objE.getP_email()+"',"+objE.getCityid()+")";
		int no;
		no = objJDBC.update(query);
		return no;
	}
//	public int updateStudent(Student objE)
//	{
//		String query="update student set ename='"+objE.getFirstname()+"','"+objE.getLastname()+"','"+objE.getFathername()+"','"+objE.getMothername()+"','"+objE.getClassname()+"','"+objE.getSection()+"','"+objE.getDob()+"','"+objE.getDate_of_addmission()+"','"+objE.getGender()+"','"+objE.getAdd1()+"','"+objE.getAdd2()+"','"+objE.getS_phone()+"','"+objE.getP_phone()+"','"+objE.getP_email()+"',"+objE.getCityid()+" where empid="+objE.getSid();
//		int no;
//		no =objJDBC.update(query);
//		return no;
//			
//	}
	public int deleteStudent(int sid)
	{
		String query ="delete from student where sid="+sid;
		return objJDBC.update(query);
	}
	public List<Student> getAllRecordstu()
	{
		return objJDBC.query("select * from student", new ResultSetExtractor<List<Student>>() {
			
			
		
		public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException
		{
			List <Student> ulist=new ArrayList<Student>();
				while(rs.next())
				{
					Student e=new Student();
					e.setFirstname(rs.getString("firstname"));
					e.setLastname(rs.getString("lastname"));
					e.setFathername(rs.getString("fathername"));
					e.setMothername(rs.getString("mothername"));
					e.setClassname(rs.getString("classname"));
					e.setSection(rs.getString("section"));
					e.setDob(rs.getString("dob"));
					e.setDate_of_addmission(rs.getString("date_of_addmission"));
					e.setGender(rs.getString("gender"));
					e.setAdd1(rs.getString("add1"));
					e.setAdd2(rs.getString("add2"));
					e.setS_phone(rs.getString("s_phone"));
					e.setP_phone(rs.getString("p_phone"));
					e.setP_email(rs.getString("p_email"));
					e.setCityid(rs.getInt("cityid"));
					
					ulist.add(e);
				}
		return ulist;		
			}
			
		});
	}
	
	
	
	
	
}
