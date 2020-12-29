package com.util;
/* 공통코드 체험하기
 * 사용자로부터 입력받는 값을 효과적으로 처리해준다.
 * API보는 방법과 활용능력을 키워본다.
 */
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class HashMapBinder {//반복되는 request.getParameter();코드를 줄이자.
	public HttpServletRequest request = null;//서블릿이 아닌 일반 자바
	public HashMapBinder() {//디폴트 생성자
		
	}
	public HashMapBinder(HttpServletRequest request) {//파라미터를 갖는 생성자
		this.request = request;//초기화(원본을 사용)
	}
	public void bind(Map<String,Object> target) {//몇개인지 모르므로 map 사용, vo는 갯수 변동이 불가
		target.clear();//쓰레기값 생기지 않게 비워주기
		//Enumeration은 넣어주는 역할은 하지 못하고 담겨있는 것을 꺼내올 때 사용한다.(담겨 있는지 없는지를 체크)
		Enumeration<String> en = request.getParameterNames();//<input name="">의 name을 한번에 담아준다.
		//size를 알 때는 for를 사용하고 size를 모를 때는 while을 사용한다.
		while(en.hasMoreElements()) {//hasMoreElements은 boolean
			//<input name =""
			String key = en.nextElement();
			target.put(key,HangulConversion.toUTF(request.getParameter(key)));
		}
	}
}
