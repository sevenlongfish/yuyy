package site.yuyy.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	/**
	 * 根据id查询用户
	 * @param userId
	 * @return
	 */
	public Map<String, Object> selUserById(Integer userId){
		
		StringBuffer sqlBuffer = new StringBuffer("select * from t_user where ID=").append(userId);
		
		List<Map<String, Object>> userList = jdbctemplate.queryForList(sqlBuffer.toString());
		
		if(null != userList){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	/**
	 * 给用户表添加字段
	 * @return
	 */
	public int addUserColumns(){
//		String columns = "ID,USER_NAME,USER_MOBILE,USER_EMAIL,CREATE_TIME";
		
		String sql = "alter table t_user add USER_PASSWD varchar(64) comment 'insert by java'";
		
		int result = jdbctemplate.update(sql);
		
		return result;
	}
}
