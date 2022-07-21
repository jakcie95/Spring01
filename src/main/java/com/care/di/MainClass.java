package com.care.di;

public class MainClass {
	public static void main(String[] args) {
		STBean stBean = new STBean();
		stBean.setName("홍길동");
		stBean.setAge(20);
		stBean.namePrint();
		stBean.agePrint();
		
	}
}
