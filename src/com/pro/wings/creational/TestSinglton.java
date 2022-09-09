package com.pro.wings.creational;

public class TestSinglton {
	
	public static void main(String[] args) {
		
		Singlton s1 = Singlton.getSingltonObject();
		
		Singlton s2 = Singlton.getSingltonObject();
		
		System.out.println(s1 == s2);
		
	}

}
