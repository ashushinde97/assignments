package com.yash.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.demo.model.Auther;


@Component
public class AutherDAO {
	 @Autowired
	  JdbcTemplate jdbc;
	 
	 public int addauth(Auther objuser)
		{
			if(jdbc!=null)
			{
			int rcount;
			rcount= jdbc.update("insert into auther (authname,email) values(?,?)",objuser.getAuthname(),objuser.getEmail());
			return rcount;
			}
			return 0;
		}
	 
	 public List<Auther> getAllAuther()
		{
			return jdbc.query("select * from auther", new RowMapper<Auther>() {
				public Auther mapRow(ResultSet rs,int rowno) throws SQLException
				{
					Auther obju = new Auther();
					obju.setAuid(rs.getInt("auid"));
					obju.setAuthname(rs.getString("authname"));
					obju.setEmail(rs.getString("email"));
					 
					return obju;
				}
			});		
		}
	 
	 
	 
	 public int updateauth(Auther objE)
	   {
		  
		  String query = "update auther set authname='"+objE.getAuthname()+"',email='"+objE.getEmail()+"' Where auid="+objE.getAuid();
		  return jdbc.update(query);
		 
	   }
	   public int deleteauth(String id)
		{
			String query ="delete from Auther where auid="+Integer.parseInt(id);
			return jdbc.update(query);
		}

}
