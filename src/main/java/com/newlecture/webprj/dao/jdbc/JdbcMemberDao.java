package com.newlecture.webprj.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.webprj.dao.MemberDao;
import com.newlecture.webprj.entity.Member;
import com.newlecture.webprj.entity.Notice;
import com.newlecture.webprj.entity.NoticeView;

public class JdbcMemberDao implements MemberDao {
	
	public Member get(String id) {
		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
	     String sql = "SELECT *FROM Member WHERE id = ?";
	     Member m = null;
	      
	      try {
	         Class.forName("com.mysql.jdbc.Driver");

	         // ���� / ����
	         Connection con = DriverManager.getConnection(url, "sist", "cclass");

	         // ����
	         //Statement st = con.createStatement();
	         PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, id);
	         
	         // ��� ��������
	         ResultSet rs = st.executeQuery();

	         // Model 
	         
	         
	         // ��� ����ϱ�
	         if (rs.next()) {
	            m = new Member();
	            		m.setId(rs.getString("id"));
	            		m.setPwd(rs.getString("pwd"));
	            		m.setIsLunar(rs.getString("isLunar"));
	            		m.setName(rs.getString("name"));
	            		m.setGender(rs.getString("gender"));
	            		m.setBirthday(rs.getString("phone"));
	            		m.setBirthday(rs.getString("birthday"));
	         }
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

	public int insert(String id, String pwd, String name, String phone, String email) {
		// TODO Auto-generated method stub
		return insert(new Member(id, pwd, name,null,null,phone,email));
	}

	public int insert(Member member) {
	      int result=0;
	      String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
	      String sql = "insert into Member(id, pwd, moon, name, gender, birthday, phone) values(?,?,?,?,?,?,?)" ;

	      
	      try {
	         Class.forName("com.mysql.jdbc.Driver");

	         // ���� / ����
	         Connection con = DriverManager.getConnection(url, "sist", "cclass");

	         // ����
	         //Statement st = con.createStatement();
	         PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, member.getId());
	         st.setString(2, member.getPwd());
	         st.setString(3, member.getIsLunar());
	         st.setString(4, member.getName());
	         st.setString(5, member.getGender());
	         st.setString(6, member.getBirthday());
	         st.setString(7, member.getPhone());
	         
	         // �����̽� ��� �������� �����
	         result = st.executeUpdate();
	         

	         // Model 
	         
	            
	         st.close();
	         con.close();
	         
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }

	     return result;
		}

	


}
