package com.bobeat.member;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class MemberLogic {
	Logger logger = Logger.getLogger(MemberLogic.class);
	private SqlMemberDao sqlMemberDao = null;
	public MemberLogic() {
		sqlMemberDao = new SqlMemberDao();
	}
	public List<Map<String, Object>> bobeat_login() {
		logger.info("bobeat_login 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.bobeat_login();
		return memberList;
	}
	public List<Map<String, Object>> new_member() {
		logger.info("new_member 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.new_member();
		return memberList;
	}
	public List<Map<String, Object>> bobeat_my() {
		logger.info("bobeat_my 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.bobeat_my();
		return memberList;
	}
	public List<Map<String, Object>> my_info() {
		logger.info("my_info 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.my_info();
		return memberList;
	}
	public List<Map<String, Object>> mem_password_check() {
		logger.info("mem_password_check 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.mem_password_check();
		return memberList;
	}
	public List<Map<String, Object>> my_info_change() {
		logger.info("my_info_change 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.my_info_change();
		return memberList;
	}
	public List<Map<String, Object>> my_marketList() {
		logger.info("my_marketList 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.my_marketList();
		return memberList;
	}
	public List<Map<String, Object>> my_basket() {
		logger.info("my_basket 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.my_basket();
		return memberList;
	}
	public List<Map<String, Object>> my_report() {
		logger.info("my_report 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.my_report();
		return memberList;
	}
	public List<Map<String, Object>> bobeat_admin() {
		logger.info("bobeat_admin 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.bobeat_admin();
		return memberList;
	}
	public List<Map<String, Object>> admin_member() {
		logger.info("admin_member 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.admin_member();
		return memberList;
	}
	public List<Map<String, Object>> admin_reportList() {
		logger.info("admin_reportList 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.admin_reportList();
		return memberList;
	}
	public List<Map<String, Object>> admin_qna() {
		logger.info("admin_qna 호출 성공");
		List<Map<String, Object>> memberList = null;
		memberList = sqlMemberDao.admin_qna();
		return memberList;
	}
}
