package com.bobeat.point;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class SqlPointDao {
	Logger logger = Logger.getLogger(SqlPointDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	MyBatisCommonFactory mcf = null;
	public SqlPointDao() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
	public List<Map<String, Object>> my_point() {
		logger.info("my_point 호출 성공");
		List<Map<String, Object>> pointList = new ArrayList<>();
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
		return pointList;
	}
	public List<Map<String, Object>> point_charge() {
		logger.info("point_charge 호출 성공");
		List<Map<String, Object>> pointList = new ArrayList<>();
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
		return pointList;
	}
	public List<Map<String, Object>> point_change() {
		logger.info("point_change 호출 성공");
		List<Map<String, Object>> pointList = new ArrayList<>();
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
		return pointList;
	}
	public List<Map<String, Object>> admin_point_payback() {
		logger.info("admin_point_payback 호출 성공");
		List<Map<String, Object>> pointList = new ArrayList<>();
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
		return pointList;
	}
}