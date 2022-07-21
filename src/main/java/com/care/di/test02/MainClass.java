package com.care.di.test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
			String path = "classpath:application_test02.xml";
			GenericXmlApplicationContext ctx = 
					new GenericXmlApplicationContext(path);
			SaveClass sc = ctx.getBean("sc",SaveClass.class);
			Scanner input = new Scanner(System.in);
			
			System.out.println("수 입력");
			sc.setNum1(input.nextInt());
			
			System.out.println("연산자 입력");
			sc.setOp(input.next());
			
			System.out.println("수입력");
			sc.setNum2(input.nextInt());
			
			sc.operationClass();
			sc.printClass();
	}
}
