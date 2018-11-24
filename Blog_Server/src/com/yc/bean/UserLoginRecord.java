package com.yc.bean;

import java.sql.Timestamp;

public class UserLoginRecord implements java.io.Serializable{
	private Long id;
	private Long userId;
	private Timestamp time;
	private String loginIp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	@Override
	public String toString() {
		return "UserLoginRecord [id=" + id + ", userId=" + userId + ", time=" + time + ", loginIp=" + loginIp + "]";
	}
	public UserLoginRecord(Long id, Long userId, Timestamp time, String loginIp) {
		super();
		this.id = id;
		this.userId = userId;
		this.time = time;
		this.loginIp = loginIp;
	}
	public UserLoginRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
