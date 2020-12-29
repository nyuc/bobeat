package com.bobeat.member;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.bobeat.Controller;
import com.bobeat.ModelAndView;

public class MemberController implements Controller {
	Logger logger = Logger.getLogger(MemberController.class);
	String requestName = null;
	private MemberLogic memberLogic = null;
	public MemberController(String requestName) {
		this.requestName = requestName;
		memberLogic = new MemberLogic();
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		logger.info("execute 호출 성공"+requestName);
		ModelAndView mav = null;
		if(req.getLocalPort()==9000) {
			if("bobeat_login".equals(requestName)) {
				logger.info("bobeat_login 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.bobeat_login();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("new_member".equals(requestName)) {
				logger.info("new_member 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.new_member();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_my".equals(requestName)) {
				logger.info("bobeat_my 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.bobeat_my();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("my_info".equals(requestName)) {
				logger.info("my_info 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.my_info();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("mem_password_check".equals(requestName)) {
				logger.info("mem_password_check 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.mem_password_check();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("my_info_change".equals(requestName)) {
				logger.info("my_info_change 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.my_info_change();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("my_marketList".equals(requestName)) {
				logger.info("my_marketList 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.my_marketList();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("my_basket".equals(requestName)) {
				logger.info("my_basket 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.my_basket();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("my_report".equals(requestName)) {
				logger.info("my_report 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.my_report();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
		}
		else if(req.getLocalPort()==4444) {
			if("bobeat_login".equals(requestName)) {
				logger.info("bobeat_login 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.bobeat_login();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("bobeat_admin".equals(requestName)) {
				logger.info("bobeat_admin 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.bobeat_admin();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("admin_member".equals(requestName)) {
				logger.info("admin_member 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.admin_member();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("admin_reportList".equals(requestName)) {
				logger.info("admin_reportList 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.admin_reportList();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
			else if("admin_qna".equals(requestName)) {
				logger.info("admin_qna 조회 호출 성공");
				List<Map<String,Object>> memberList = null;
				memberList = memberLogic.admin_qna();
				mav = new ModelAndView(req,res);
				//mav.addObject("memberList", memberList);
				mav.setViewName(requestName+".jsp");
			}
		}
		return mav;
	}
}
