package com.yc.bean;

import java.sql.Timestamp;
/**
 * 序列化接口: io包下面的 
 * 在实体类里面都要有序列化接口(一个空的接口,养成加上去的习惯)
 * */
public class User implements java.io.Serializable{
	//使用包装器类型 不要用基础类型(无法控制) 
		//datatime 对应 TimeStamp:日期+时间   java.sql.Date:纯日期 没有时分秒
	private Long id ;
	private String name;//昵称
	private String account;//账号
	private String pwd;
	private String tel;
	private String createBy;
	private Timestamp createDate;
	private String status;
	private String type;
	//sql对大小写不敏感用下划线 而在java里面用首字母大写的驼峰法
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", pwd=" + pwd + ", tel=" + tel
				+ ", createBy=" + createBy + ", createDate=" + createDate + ", status=" + status + ", type=" + type
				+ "]";
	}
	public User(Long id, String name, String account, String pwd, String tel, String createBy, Timestamp createDate,
			String status, String type) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.pwd = pwd;
		this.tel = tel;
		this.createBy = createBy;
		this.createDate = createDate;
		this.status = status;
		this.type = type;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
