package com.yc;


import com.yc.bean.Columns;


public class Test {
	
	public static void main(String[] args) {
		
		//DBHelper helper = new DBHelper();
		
		System.out.println(DBHelper.select("select * from columns"));

		System.out.println(DBHelper.select("select * from columns where aliasName=?","web"));
		
		Columns col = DBHelper.unique("select * from columns where aliasName=?", Columns.class,"web");
		
		System.out.println(col);
		
	}

}
