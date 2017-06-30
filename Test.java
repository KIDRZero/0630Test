package com.aaa.test;


	
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.Statement;
	/*
	 * sql语句中这里用的是from表名，索引值是从1开始的
	 * 查询可以通过索引值获取，也可以通过表的各项列名值获取，这个test1表的两个列名分别是Age和Name
	 */
	public class Test {
	     public static void main(String[] args) throws Exception {
			Connection con=DBHelper.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				//System.out.println(rs.getInt("Age")+" "+rs.getString("Name"));
			}
			
		}
	}
