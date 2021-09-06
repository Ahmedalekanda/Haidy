package com.alekanda.Utill;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utillll {	
	
		public static long implicitlyWait_wait = 40;
		public static long pageLoadTimeout_wait = 40;
		
		public static String Gagette = "computers/ tablets & networking";
		public static String TV = "samsung";
		
		public static void takescreenshot(WebDriver driver, String screenshot) {

			File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String correntdir = System.getProperty("user.dir");

			try {
				FileUtils.copyFile(srcfile, new File(correntdir + "/ScreenShorts/" + screenshot + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


}
