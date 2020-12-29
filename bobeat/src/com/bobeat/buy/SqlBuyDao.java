package com.bobeat.buy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class SqlBuyDao {
	Logger logger = Logger.getLogger(SqlBuyDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	MyBatisCommonFactory mcf = null;
	public SqlBuyDao() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
	public List<Map<String, Object>> bobeat_market() {
		logger.info("bobeat_market 호출 성공");
		List<Map<String, Object>> buyList = new ArrayList<>();
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
		return buyList;
	}
	public List<Map<String, Object>> bobeat_share() {
		logger.info("bobeat_share 호출 성공");
		List<Map<String, Object>> buyList = new ArrayList<>();
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
		return buyList;
	}
	
}