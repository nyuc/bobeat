package com.bobeat.point;

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

public class PointController implements Controller {
	Logger logger = Logger.getLogger(PointController.class);
	String requestName = null;
	private PointLogic pointLogic = null;
	public PointController(String requestName) {
		this.requestName = requestName;
		pointLogic = new PointLogic();
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		logger.info("execute 호출 성공"+requestName);
		ModelAndView mav = null;
		if(req.getLocalPort()==9000) {
			if("my_point".equals(requestName)) {
				logger.info("my_point 조회 호출 성공");
				List<Map<String,Object>> pointList = null;
				pointList = pointLogic.my_point();
				mav = new ModelAndView(req,res);
				//mav.addObject("pointList", pointList);
				mav.setViewName(requestName+".jsp");
			}
			else if("point_charge".equals(requestName)) {
				logger.info("point_charge 조회 호출 성공");
				List<Map<String,Object>> pointList = null;
				pointList = pointLogic.point_charge();
				mav = new ModelAndView(req,res);
				//mav.addObject("pointList", pointList);
				mav.setViewName(requestName+".jsp");
			}
			else if("point_change".equals(requestName)) {
				logger.info("point_change 조회 호출 성공");
				List<Map<String,Object>> pointList = null;
				pointList = pointLogic.point_change();
				mav = new ModelAndView(req,res);
				//mav.addObject("pointList", pointList);
				mav.setViewName(requestName+".jsp");
			}
		}
		else if(req.getLocalPort()==4444) {
			if("admin_point_payback".equals(requestName)) {
				logger.info("admin_point_payback 조회 호출 성공");
				List<Map<String,Object>> pointList = null;
				pointList = pointLogic.admin_point_payback();
				mav = new ModelAndView(req,res);
				//mav.addObject("pointList", pointList);
				mav.setViewName(requestName+".jsp");
			}
		}
		return mav;
	}
}
