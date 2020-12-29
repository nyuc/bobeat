package com.bobeat.buy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.bobeat.Controller;
import com.bobeat.ModelAndView;
import com.bobeat.member.MemberLogic;

public class BuyController implements Controller {
	Logger logger = Logger.getLogger(BuyController.class);
	String requestName = null;
	private BuyLogic buyLogic = null;
	public BuyController(String requestName) {
		this.requestName = requestName;
		buyLogic = new BuyLogic();
	}
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		logger.info("execute 호출 성공"+requestName);
		ModelAndView mav = null;
		if(req.getLocalPort()==9000) {
			if("bobeat_market".equals(requestName)) {
				logger.info("bobeat_market 조회 호출 성공");
				List<Map<String,Object>> buyList = null;
				buyList = buyLogic.bobeat_market();
				mav = new ModelAndView(req,res);
				//mav.addObject("subList", subList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_share".equals(requestName)) {
				logger.info("bobeat_share 조회 호출 성공");
				List<Map<String,Object>> buyList = null;
				buyList = buyLogic.bobeat_share();
				mav = new ModelAndView(req,res);
				//mav.addObject("subList", subList);
				mav.setViewName(requestName+".jsp");
			}
		}
		else if(req.getLocalPort()==4444) {
			if("bobeat_market".equals(requestName)) {
				logger.info("bobeat_market 조회 호출 성공");
				List<Map<String,Object>> buyList = null;
				buyList = buyLogic.bobeat_market();
				mav = new ModelAndView(req,res);
				//mav.addObject("subList", subList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_share".equals(requestName)) {
				logger.info("bobeat_share 조회 호출 성공");
				List<Map<String,Object>> buyList = null;
				buyList = buyLogic.bobeat_share();
				mav = new ModelAndView(req,res);
				//mav.addObject("subList", subList);
				mav.setViewName(requestName+".jsp");
			}
		}
		return mav;
	}
}
