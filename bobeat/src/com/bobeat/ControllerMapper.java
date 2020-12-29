package com.bobeat;

import org.apache.log4j.Logger;

import com.bobeat.buy.BuyController;
import com.bobeat.community.CommunityController;
import com.bobeat.member.MemberController;
import com.bobeat.point.PointController;

public class ControllerMapper {
	Logger logger = Logger.getLogger(ControllerMapper.class);
	public static Controller getController(String command) {
		Controller controller = null;
		String commands[] = command.split("/");
		if(commands.length == 2) {
			String work = commands[0];//폴더이름(work)
			String requestName = commands[1];//메소드이름(처리해야할 업무 이름)
			if("member".equals(work)) {
				controller = new MemberController(requestName);
			}
			else if("buy".equals(work)) {
				controller = new BuyController(requestName);
			}
			else if("community".equals(work)) {
				controller = new CommunityController(requestName);
			}
			else if("point".equals(work)) {
				controller = new PointController(requestName);
			}
		}
		return controller;
	}
}