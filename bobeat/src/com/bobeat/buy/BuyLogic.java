package com.bobeat.buy;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.bobeat.member.SqlMemberDao;
public class BuyLogic {
	Logger logger = Logger.getLogger(BuyLogic.class);
	private SqlBuyDao sqlBuyDao = null;
	public BuyLogic() {
		sqlBuyDao = new SqlBuyDao();
	}
	public List<Map<String, Object>> bobeat_market() {
		logger.info("bobeat_market 호출 성공");
		List<Map<String, Object>> buyList = null;
		buyList = sqlBuyDao.bobeat_market();
		return buyList;
	}
	public List<Map<String, Object>> bobeat_share() {
		logger.info("bobeat_share 호출 성공");
		List<Map<String, Object>> buyList = null;
		buyList = sqlBuyDao.bobeat_share();
		return buyList;
	}
}
