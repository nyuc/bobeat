package com.bobeat.community;

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
import com.bobeat.buy.BuyLogic;

public class CommunityController implements Controller {
	Logger logger = Logger.getLogger(CommunityController.class);
	String requestName = null;
	private CommunityLogic communityLogic = null;
	public CommunityController(String requestName) {
		this.requestName = requestName;
		communityLogic = new CommunityLogic();
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		logger.info("execute 호출 성공"+requestName);
		ModelAndView mav = null;
		if(req.getLocalPort()==9000) {
			if("bobeat_notice".equals(requestName)) {
				logger.info("bobeat_notice 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.bobeat_notice();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_qna".equals(requestName)) {
				logger.info("bobeat_qna 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.bobeat_qna();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_writeForm".equals(requestName)) {
				logger.info("bobeat_writeForm 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.bobeat_writeForm();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("share_free".equals(requestName)) {
				logger.info("share_free 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.share_free();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("share_group".equals(requestName)) {
				logger.info("share_group 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.share_group();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
		}
		else if(req.getLocalPort()==4444) {
			if("bobeat_notice".equals(requestName)) {
				logger.info("bobeat_notice 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.bobeat_notice();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_qna".equals(requestName)) {
				logger.info("bobeat_qna 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.bobeat_qna();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_writeForm".equals(requestName)) {
				logger.info("bobeat_writeForm 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.bobeat_writeForm();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("share_free".equals(requestName)) {
				logger.info("share_free 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.share_free();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("share_group".equals(requestName)) {
				logger.info("share_group 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.share_group();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("board_solution".equals(requestName)) {
				logger.info("board_solution 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.board_solution();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
			else if("report_content".equals(requestName)) {
				logger.info("report_content 조회 호출 성공");
				List<Map<String,Object>> communityList = null;
				communityList = communityLogic.report_content();
				mav = new ModelAndView(req,res);
				//mav.addObject("communityList", communityList);
				mav.setViewName(requestName+".jsp");
			}
		}
		return mav;
	}
}
