package com.yash.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.demo.model.Auther;
import com.yash.demo.model.Publisher;
@Component
public class PublisherDAO {
	 @Autowired
	  JdbcTemplate authjdbc;
	
	 public int addpublisher(Publisher objuser)
		{
			if(authjdbc!=null)
			{
			int rcount;
			rcount= authjdbc.update("insert into publisher (publishername,emailid,address) values(?,?,?)",objuser.getPublishername(),objuser.getEmailid(),objuser.getAddress());
			return rcount;
			}
			return 0;
		}
	 
	 public List<Publisher> getAllPublisher()
		{
			return authjdbc.query("select * from publisher", new RowMapper<Publisher>() {
				public Publisher mapRow(ResultSet rs,int rowno) throws SQLException
				{
					Publisher obju = new Publisher();
					obju.setPubid(rs.getInt("pubid"));
					obju.setPublishername(rs.getString("publishername"));
					obju.setEmailid(rs.getString("emailid"));
					obju.setAddress(rs.getString("address"));
					 
					return obju;
				}
			});		
		}
	 
	 public int updatepub(Publisher objE)
	   {
		  
		  String query = "update publisher set publishername='"+objE.getPublishername()+"',emailid='"+objE.getEmailid()+"',address='"+objE.getAddress()+"' Where pubid="+objE.getPubid();
		  return authjdbc.update(query);
		 
	   }
	   public int deletepub(String id)
		{
			String query ="delete from publisher where pubid="+Integer.parseInt(id);
			return authjdbc.update(query);
		}
}
