package com.comp5130.eAssess.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.comp5130.eAssess.controller.bean.User;
import com.comp5130.eAssess.dao.UserDao;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public User getUserByUsername(String username) {
		String sql = "select * from user where username=?";

		return getJdbcTemplate().queryForObject(sql, new Object[] { username }, new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User user = new User();
				user.setUsername(username);
				user.setPassword(rs.getString(1));
				return user;
			}
		});
	}

}
