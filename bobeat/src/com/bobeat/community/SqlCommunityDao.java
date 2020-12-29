package com.bobeat.community;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class SqlCommunityDao {
	Logger logger = Logger.getLogger(SqlCommunityDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	MyBatisCommonFactory mcf = null;
	public SqlCommunityDao() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
	public List<Map<String, Object>> bobeat_notice() {
		logger.info("bobeat_notice 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}
	public List<Map<String, Object>> bobeat_qna() {
		logger.info("bobeat_qna 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}
	public List<Map<String, Object>> bobeat_writeForm() {
		logger.info("bobeat_writeForm 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}
	public List<Map<String, Object>> share_free() {
		logger.info("share_free 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}
	public List<Map<String, Object>> share_group() {
		logger.info("share_group 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}
	public List<Map<String, Object>> board_solution() {
		logger.info("board_solution 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}
	public List<Map<String, Object>> report_content() {
		logger.info("report_content 호출 성공");
		List<Map<String, Object>> communityList = new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return communityList;
	}

}