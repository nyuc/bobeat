package com.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//공통팀에서 하는 작업임
public class MyBatisCommonFactory {
	//선언부
	//xml문서로 부터 객체를 주입받아야 하니까 절대로 단독으로 인스턴스화 하면 안됨.
	public SqlSessionFactory 	sqlSessionFactory = null;
	//오라클서버에 요청할때(DML)
	//SqlSessionFactory와 의존관계 있다.
	public SqlSession 			sqlSession = null; 
	//생성자
	
	//초기화
	public void init() {
		try {
//MapperConfig.xml문서에서 오라클 서버에 대한 정보를 스캔	
//물리적으로 떨어져 있는 오라클과 연결통로를 확보하는데 필요한 클래스는 무엇일까요? - SqlSessionFactory	
//SqlSessionFactory와 SqlSession중 어느 클래스를 먼저 인스턴스화 해야 할까요?- 전자
//의존관계에 의미를 잘 모르겠어요?
//SqlSessionFactory가 인스턴스화 되어야 SqlSession 을 인스턴스화 할 수 있다고 할때 이 둘은 의존관계(스프링 핵심 키워드 중 하나) 있다 말할 수 있다.			
			//String resource = "oracle/mybatis/MapperConfig.xml";
			String resource = "com/util/configuration.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,"development3");//development2->아이디, 해당 아이디로 mysql에 접근한다.
			System.out.println("SqlSessionFactory(SqlSessionFactoryBean)"+sqlSessionFactory);
		} catch (FileNotFoundException fe) {
			System.out.println("Exception:"+fe.getMessage());
			
		} catch(IOException ie) {
			System.out.println("Exception:"+ie.getMessage());
		}catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
	//싱글톤 패턴으로 개발을 전개해야 할 때는 메소드로 객체 주입 받도록 한다.
	//한번 생성한 후 서버가 유지되는 동안에는 계속 사용할 수 있도록 함.
	//scope: application scope를 갖도록 한다.
	public SqlSessionFactory getSqlSessionFactory() {
		init();//객체 생성이 일어남.
		return sqlSessionFactory;//null
	}
}