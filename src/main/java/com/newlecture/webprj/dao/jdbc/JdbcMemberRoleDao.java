package com.newlecture.webprj.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.newlecture.webprj.dao.MemberRoleDao;
import com.newlecture.webprj.entity.Member;
import com.newlecture.webprj.entity.MemberRole;

public class JdbcMemberRoleDao implements MemberRoleDao {

	public String getDefaultRole(String memberId) {
		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
	     String sql = "select roleId from MemberRole where memberId = ? and defaultRole = 1";
	     String m = null;
	      
	      try {
	         Class.forName("com.mysql.jdbc.Driver");

	         // ���� / ����
	         Connection con = DriverManager.getConnection(url, "sist", "cclass");

	         // ����
	         //Statement st = con.createStatement();
	         PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, memberId);
	         
	         // ��� ��������
	         ResultSet rs = st.executeQuery();

	         // Model 
	         
	         
	         // ��� ����ϱ�
	         if (rs.next()) 
	            m = new String(rs.getString("roleId"));
	         
	         rs.close();
	         st.close();
	         con.close();
	         
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
		
		return  m;
	}

	public boolean hasRole(String memberId, String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
