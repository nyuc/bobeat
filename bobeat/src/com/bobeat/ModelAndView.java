package com.bobeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ModelAndView {
	Logger logger = Logger.getLogger(ModelAndView.class);
	public ModelAndView() {}//생성자 무조건 필요
	HttpServletRequest request = null;
	HttpServletResponse response = null;
	public ModelAndView(HttpServletRequest request) {
		this.request = request;
	}
	public ModelAndView(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	/************************************
	 * ModelAndView mav = new ModelAndView();
	 * mav.setViewName(login/login);
	 * @param viewName
	 * **********************************/
	String viewName = null;
	public void setViewName(String viewName) {//응답페이지로 나갈 페이지 이름 결정하기
		//String commands[] = viewName.split("/");
		this.viewName = viewName;
		logger.info("viewName : "+viewName);
	}
	List<Map<String, Object>> reqList = new ArrayList<>();
	public void addObject(String name, Object obj) {//스코프가 request일 때 값을 유지해줌
		//여러개의 값을 추가하는 코드
		Map<String, Object> rMap = new HashMap<>();
		rMap.put(name, obj);
		reqList.add(rMap);
		//아래 코드는 오직 한개만 처리 가능
		request.setAttribute(name, obj);
		request.setAttribute("reqList", reqList);
	}
}
