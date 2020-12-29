package com.bobeat.community;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class CommunityLogic {
	Logger logger = Logger.getLogger(CommunityLogic.class);
	private SqlCommunityDao sqlCommunityDao = null;
	public CommunityLogic() {
		sqlCommunityDao = new SqlCommunityDao();
	}
	public List<Map<String, Object>> bobeat_notice() {
		logger.info("bobeat_notice 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.bobeat_notice();
		return communityList;
	}
	public List<Map<String, Object>> bobeat_qna() {
		logger.info("bobeat_qna 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.bobeat_qna();
		return communityList;
	}
	public List<Map<String, Object>> bobeat_writeForm() {
		logger.info("bobeat_writeForm 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.bobeat_writeForm();
		return communityList;
	}
	public List<Map<String, Object>> share_free() {
		logger.info("share_free 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.share_free();
		return communityList;
	}
	public List<Map<String, Object>> share_group() {
		logger.info("share_group 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.share_group();
		return communityList;
	}
	public List<Map<String, Object>> board_solution() {
		logger.info("board_solution 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.board_solution();
		return communityList;
	}
	public List<Map<String, Object>> report_content() {
		logger.info("report_content 호출 성공");
		List<Map<String, Object>> communityList = null;
		communityList = sqlCommunityDao.report_content();
		return communityList;
	}
}
