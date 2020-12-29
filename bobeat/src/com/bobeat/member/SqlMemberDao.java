package com.bobeat.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class SqlMemberDao {
	Logger logger = Logger.getLogger(SqlMemberDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	MyBatisCommonFactory mcf = null;
	public SqlMemberDao() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
	public List<Map<String, Object>> bobeat_login() {
		logger.info("bobeat_login 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
		Map<String, Object> pMap = new HashMap<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			memberList = sqlSession.selectList("memberList",pMap);
			logger.info("memberList.size():"+memberList);
			memberList.add(pMap);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return memberList;
	}
	public List<Map<String, Object>> new_member() {
		logger.info("new_member 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
		Map<String, Object> pMap = new HashMap<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			//memberList = sqlSession.selectList("subjectList",pMap);
			logger.info("memberList.size():"+memberList);
			memberList.add(pMap);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트할 경우 오라클 서버에 세션의 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야하므로 반드시 닫아준다.
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return memberList;
	}
	public List<Map<String, Object>> my_report() {
		logger.info("my_report 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> my_basket() {
		logger.info("my_basket 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> my_marketList() {
		logger.info("my_marketList 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> my_info_change() {
		logger.info("my_info_change 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> mem_password_check() {
		logger.info("mem_password_check 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> my_info() {
		logger.info("my_info 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> bobeat_my() {
		logger.info("bobeat_my 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> bobeat_admin() {
		logger.info("bobeat_admin 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> admin_member() {
		logger.info("admin_member 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> admin_reportList() {
		logger.info("admin_reportList 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
	public List<Map<String, Object>> admin_qna() {
		logger.info("admin_qna 호출 성공");
		List<Map<String, Object>> memberList = new ArrayList<>();
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
		return memberList;
	}
}