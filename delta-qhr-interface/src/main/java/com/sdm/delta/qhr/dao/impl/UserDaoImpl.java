package com.sdm.delta.qhr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sdm.delta.qhr.dao.UserDao;
import com.sdm.delta.qhr.model.User;
@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
	private final static String SQL_UPDATE = 
			"update Users set id = ?, name = ?, email = ? where ID = ?";
  
 

    /* (non-Javadoc)
	 * @see com.sdm.delta.qhr.dao.impl.UserDao#findAll()
	 */
    @Override
	@Transactional(readOnly=true)
    public List<User> findAll() {
        return jdbcTemplate.query("select * from users", 
                new UserRowMapper());
    }

    /* (non-Javadoc)
	 * @see com.sdm.delta.qhr.dao.impl.UserDao#findUserById(int)
	 */
    @Override
	@Transactional(readOnly=true)
    public User findUserById(int id) {
        return jdbcTemplate.queryForObject(
            "select * from users where id=?",
            new Object[]{id}, new UserRowMapper());
    }

    /* (non-Javadoc)
	 * @see com.sdm.delta.qhr.dao.impl.UserDao#create(com.sdm.delta.qhr.model.User)
	 */
    @Override
	public User create(final User user) 
    {
        final String sql = "insert into users(id,name,email) values(?,?,?)";

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1, user.getId());
                ps.setString(2, user.getName());
                ps.setString(3, user.getEmail());
                return ps;
            }
        });

        return user;
    }

	@Override
	public boolean isUserExist(User user) {
		Integer cnt = jdbcTemplate.queryForObject(
			    "SELECT count(*) FROM users WHERE name = ?", Integer.class, user.getName());
		return cnt != null && cnt > 0;
	}

	@Override
	public void saveUser(User user) {
		int result = jdbcTemplate.update( SQL_UPDATE, getValuesForUpdate(user) );
		
	}

	@Override
	public void updateUser(User user) {
		int result = jdbcTemplate.update( SQL_UPDATE, getValuesForUpdate(user) );
		
	}
	
	protected Object[] getValuesForUpdate(User user) {
		return new Object[] {		
			user.getId(),
			user.getName(), // "name" : java.lang.String
			user.getEmail(), // "email" : java.lang.Integer
			user.getId()  // "ID" : java.lang.Integer
		};
	}

	@Override
	public void deleteUserById(int id) {
		jdbcTemplate.update("DELETE from users WHERE id = ?", id);
		
	}

	@Override
	public void deleteAllUsers() {
		int result = jdbcTemplate.update("Delete from users");
		
	}
}

class UserRowMapper implements RowMapper<User>
{
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
    }
}
