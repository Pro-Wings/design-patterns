package com.pro.wings.creational.builder;

public class TestBuilder {
	
	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Ram", "ABC")
				.setPhone("12345")
				.setAddress("Pune")
				.setAge(23)
				.build();
		
		System.out.println(user);
				
		
		
	}

}
