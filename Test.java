package com.aaa.test;


	
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.Statement;
	/*
	 * sql����������õ���from����������ֵ�Ǵ�1��ʼ��
	 * ��ѯ����ͨ������ֵ��ȡ��Ҳ����ͨ����ĸ�������ֵ��ȡ�����test1������������ֱ���Age��Name
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
