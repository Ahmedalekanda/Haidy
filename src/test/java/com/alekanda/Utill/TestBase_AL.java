package com.alekanda.Utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase_AL {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
public TestBase_AL() {
	
	try {
		FileInputStream flz = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\test\\java\\com\\alekanda\\config\\ConfigAL.properties");
		prop= new Properties();
		prop.load(flz);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

public void initzz() {
	
	String Browsername = prop.getProperty("browserC");
	if(Browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utillll.implicitlyWait_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utillll.pageLoadTimeout_wait, TimeUnit.SECONDS);
		
		
}     
	else if(Browsername.equals("FF"));
	System.out.println("Browser not found");
}

public static void lunchh(String URL) {
	driver.get(prop.getProperty("caurl_QA"));


}

}	
	
	
	
	
	
	
	
	