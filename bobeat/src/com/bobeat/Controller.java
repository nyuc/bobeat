package com.bobeat;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException;//추상메소드
}
