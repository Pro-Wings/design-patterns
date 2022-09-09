package com.pro.wings.creational;

public class Singlton {
	
//	private static Singlton obj = new Singlton();
	
	private static Singlton obj;
	
	private Singlton()
	{
		
	}
	
	public static Singlton getSingltonObject()
	{
		if(null == obj)
		{
			obj = new Singlton();
			return obj;
		}
		else
			return obj;

	}

}
