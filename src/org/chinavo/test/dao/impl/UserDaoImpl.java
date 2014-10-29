package org.chinavo.test.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.chinavo.test.dao.UserDao;
import org.chinavo.test.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public String findUserByName(String userName) {
		// TODO Auto-generated method stub
		String sql = "select * from user where username="+userName;
		Object[] args;
	/*	getJdbcTemplate().query(sql,  args, new UserRowMapper extends RowMapper(){
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	            User m = new User();
	            
	            return m;
	        }
		});*/
		return null;
	}

}
