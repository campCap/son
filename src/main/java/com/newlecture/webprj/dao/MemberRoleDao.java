package com.newlecture.webprj.dao;

public interface MemberRoleDao {

	String getDefaultRole(String memberId);

	boolean hasRole(String memberId, String string);

}
