package com.yash.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.demo.model.Booktitle;
import com.yash.demo.model.Publisher;

@Component
public class BooktitleDAO {
	 @Autowired
	  JdbcTemplate bookjdbc;
	 
	 public int addbook(Booktitle objuser)
		{
			if(bookjdbc!=null)
			{
			int rcount;
			rcount= bookjdbc.update("insert into Booktitle (auid1,auid2,auid3,pubid,price,title) values(?,?,?,?,?,?)",objuser.getAuid1(),objuser.getAuid2(),objuser.getAuid3(),objuser.getPubid(),objuser.getPrice(),objuser.getTitle());
			return rcount;
			}
			return 0;
		}
	 
	 public List<Booktitle> getAllBook()
		{
			return bookjdbc.query("select * from Booktitle", new RowMapper<Booktitle>() {
				public Booktitle mapRow(ResultSet rs,int rowno) throws SQLException
				{
					Booktitle obju = new Booktitle();
					obju.setBtid(rs.getInt("btid"));
					obju.setAuid1(rs.getInt("auid1"));
					obju.setAuid2(rs.getInt("auid2"));
					obju.setAuid3(rs.getInt("auid3"));
					obju.setPubid(rs.getInt("pubid"));
					obju.setPrice(rs.getString("price"));
					obju.setTitle(rs.getString("title"));	 
					return obju;
				}
			});		
		}
	 
	 public int deletebook(String id)
		{
			String query ="delete from Booktitle where btid="+Integer.parseInt(id);
			return bookjdbc.update(query);
		}

}
