package com.yc.biz;




import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import com.yc.DBHelper;
import com.yc.bean.User;

public class UserBiz {
	
	/**
	 * 登录方法
	 * @param username
	 * @param userpwd
	 * @return 返回登陆成功的用户对象
	 * */
	public User login(String username, String userpwd) throws BizException{
		if (username == null || username.trim().isEmpty()) {
			throw new BizException("请填写用户名!");
		}
		if(userpwd == null || userpwd.trim().isEmpty()){
			throw new BizException("请填写密码!");
		}
		
		//查询数据库判断用户是否存在
	/*	DBHelper dbhelper = new DBHelper();
		List<Object> params = new ArrayList<Object>();
		params.add(username);
		params.add(userpwd);*/
		String sql ="select * from user where account = ? and pwd = ?";
		//Map<String, String> user = dbhelper.findMap(sql, params);
		return DBHelper.unique(sql, User.class,username,userpwd);
		//return user;
		
	}

	public List<User> findAll() {
		return DBHelper.select("select * from user", User.class);
	}

	public void add(User user,String repwd) throws BizException {
		if (user.getName() == null || user.getName().trim().isEmpty()) {
			throw new BizException("请填写用户名!");
		}
		/**
		 * 请完成用户属性的校验
		 * 同名用户校验
		 */
		String sql = "insert into user (name,account,tel,pwd) values(?,?,?,?)";
		DBHelper.insert(sql,user.getName(),user.getAccount(),user.getTel(),user.getPwd());
	}
	public User findById(String id){
		return DBHelper.unique("select * from user where id=?", User.class,id);
	}
	
	public void save(User user) throws BizException{
		if (user.getAccount() == null || user.getAccount().trim().isEmpty()) {
			throw new BizException("请填写用户名!");
		}
		if (user.getName() == null || user.getName().trim().isEmpty()) {
			throw new BizException("请填写姓名!");
		}
		DBHelper.update("update user set name=?, account=?, tel=? where id=?",
				user.getName(), user.getAccount(), user.getTel(), user.getId());
	}

	public Object find(User user) {
		/*动态拼接条件*/
		String sql ="select * from user where 1=1 ";//要有空格不然报错
		ArrayList<Object> params = new ArrayList<Object>();
		if (user.getAccount()!=null && user.getAccount().trim().isEmpty() == false) {
			sql +=" and account like concat('%',?,'%')";
			params.add(user.getAccount());
		}
		if (user.getName()!=null && user.getName().trim().isEmpty() == false) {
			sql +=" and name like ?";
			params.add("%"+user.getName()+"%");
		}
		if (user.getTel()!=null && user.getTel().trim().isEmpty()== false) {
			sql +=" and tel like ?";
			params.add("%"+user.getTel()+"%");
		}
		return DBHelper.select(sql, params);
	}


}
