package com.bobeat.point;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.bobeat.member.SqlMemberDao;
public class PointLogic {
	Logger logger = Logger.getLogger(PointLogic.class);
	private SqlPointDao sqlPointDao = null;
	public PointLogic() {
		sqlPointDao = new SqlPointDao();
	}
	public List<Map<String, Object>> my_point() {
		logger.info("my_point 호출 성공");
		List<Map<String, Object>> pointList = null;
		pointList = sqlPointDao.my_point();
		return pointList;
	}
	public List<Map<String, Object>> point_charge() {
		logger.info("point_charge 호출 성공");
		List<Map<String, Object>> pointList = null;
		pointList = sqlPointDao.point_charge();
		return pointList;
	}
	public List<Map<String, Object>> point_change() {
		logger.info("point_change 호출 성공");
		List<Map<String, Object>> pointList = null;
		pointList = sqlPointDao.point_change();
		return pointList;
	}
	public List<Map<String, Object>> admin_point_payback() {
		logger.info("admin_point_payback 호출 성공");
		List<Map<String, Object>> pointList = null;
		pointList = sqlPointDao.admin_point_payback();
		return pointList;
	}
}
