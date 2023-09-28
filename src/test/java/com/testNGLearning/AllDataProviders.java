package com.testNGLearning;

import org.testng.annotations.DataProvider;

public class AllDataProviders {
	
	@DataProvider(name = "data")
	public static Object[][] data1(){
		
		Object[][] data2 = {{"seleniumpanda1@gmail.com", "Selenium@123"},
							{"seleniumpanda2@gmail.com", "Selenium@123"},
							{"seleniumpanda845@gmail.com", "Selenium@123"}};
		
	return data2;
		
		
		
		
		
		
		
	}

}
