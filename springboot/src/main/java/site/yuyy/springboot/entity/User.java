package site.yuyy.springboot.entity;

import java.util.Date;

public class User {

	private Integer id;
	private String userName;
	private Date createDate;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getCreateDate() {
		return this.createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		
		return "{" + "id:" + this.id + "userName:" + this.userName + "createDate:" + this.createDate + "}";
	}
}
