package site.yuyy.springboot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import site.yuyy.springboot.entity.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Map<String, Object> selUserById(Integer userId) {
		String sql = "select * from t_user where id = " + userId;
		
		Map<String, Object> result = jdbcTemplate.queryForList(sql).get(0);
		return result;
	}
	
	public User selUserByIdA(Integer userId) {
//		String sql = "select * from t_user where id = " + userId;
		
//		User result = jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}
	
	public List<Map<String, Object>> selUserList() {
		String sql = "select * from t_user";
		
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		return result;
	}
	
}
