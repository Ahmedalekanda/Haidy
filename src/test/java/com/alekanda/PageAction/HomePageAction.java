package com.alekanda.PageAction;

import org.testng.Assert;

import com.alekanda.PageLocator.HomePageLocator;
import com.alekanda.Utill.TestBase_AL;
import com.alekanda.Utill.Utillll;

public class HomePageAction extends TestBase_AL {

	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void Productsearchbyname() {
		homePageLocator.Productsearchbyname.sendKeys(Utillll.Gagette);	
		
	}
	
	public void Clickonsearchbutton() {
		homePageLocator.Clicksearchbutton.click();	
	}
	
	public void Verifyuseronsearchresultdisplay() {
		boolean result=	homePageLocator.Resultdisplay.isDisplayed();
				Assert.assertTrue(result);
	}
	public void ClickonSigninbutton() {
		homePageLocator.Signinbutton.click();	
	}
	
}
