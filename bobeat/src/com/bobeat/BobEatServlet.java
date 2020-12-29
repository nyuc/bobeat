package com.bobeat;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.bobeat.buy.BuyController;
import com.bobeat.community.CommunityController;
import com.bobeat.member.MemberController;
import com.bobeat.point.PointController;

public class BobEatServlet extends HttpServlet {
	Logger logger = Logger.getLogger(BobEatServlet.class);
	@Override
	public void init(ServletConfig config) throws ServletException{
		//해당 서블릿의 초기화를 담당 ex)오라클 서버의 물리적인 정보들 DataSource, Connection을 물리기 위한 사전 정보 초기화 작업
		logger.info("init 호출 성공");
	}
	public void doService(HttpServletRequest req, HttpServletResponse res)//HttpServlet 안에는 doService가 없기 때문에 override불가
	throws ServletException, IOException 
	{
		logger.info("doService 호출 성공");
		String uri = req.getRequestURI();
		logger.info("uri:"+uri);
		String context = req.getContextPath();
		logger.info("context:"+context);
		String command = uri.substring(context.length()+1);
		int end = command.lastIndexOf('.');
		command = command.substring(0,end);
		logger.info("command:"+command);
		Controller controller = null;
		
		String url = null;
		if(req.getLocalPort()==9000) {
			url = "/WEB-INF/bobeat/client/";
		} else if(req.getLocalPort()==4444) {
			url = "/WEB-INF/bobeat/admin/";
		}
		
		try {
			controller = ControllerMapper.getController(command);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(controller instanceof MemberController) {
			logger.info("회원 컨트롤 계층 호출 성공");
			ModelAndView mav = controller.execute(req, res);
			logger.info("mav.viewName :"+mav+", "+mav.viewName);
			RequestDispatcher view = req.getRequestDispatcher(url+mav.viewName);
			view.forward(req, res);
		}
		else if(controller instanceof BuyController) {
			logger.info("구매 컨트롤 계층 호출 성공");
			ModelAndView mav = controller.execute(req, res);
			logger.info("mav.viewName :"+mav+", "+mav.viewName);
			RequestDispatcher view = req.getRequestDispatcher(url+mav.viewName);
			view.forward(req, res);
		}
		else if(controller instanceof CommunityController) {
			logger.info("게시판 컨트롤 계층 호출 성공");
			ModelAndView mav = controller.execute(req, res);
			logger.info("mav.viewName :"+mav+", "+mav.viewName);
			RequestDispatcher view = req.getRequestDispatcher(url+mav.viewName);
			view.forward(req, res);
		}
		else if(controller instanceof PointController) {
			logger.info("포인트 컨트롤 계층 호출 성공");
			ModelAndView mav = controller.execute(req, res);
			logger.info("mav.viewName :"+mav+", "+mav.viewName);
			RequestDispatcher view = req.getRequestDispatcher(url+mav.viewName);
			view.forward(req, res);
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		logger.info("doGet 호출 성공");
		doService(req,res);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		logger.info("doPost 호출 성공");
		doService(req,res);
	}
}
