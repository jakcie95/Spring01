package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean stBean = new STBean();
		String path = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		STBean stBean = ctx.getBean("stb",STBean.class);
		//xml에 있는 파일 불러오기
		//stBean.setName("홍길동111");
		//stBean.setAge(20111);
		stBean.namePrint();
		stBean.agePrint();
		
	}
}
