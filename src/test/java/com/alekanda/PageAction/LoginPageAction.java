package com.alekanda.PageAction;

import com.alekanda.PageLocator.LoginPageLocator;
import com.alekanda.Utill.TestBase_AL;

import junit.framework.Assert;

public class LoginPageAction extends TestBase_AL {
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	public void uercard(String u, String p) {
		loginPageLocator.Email.sendKeys(u);
		loginPageLocator.Clickcontinue.click();
		loginPageLocator.Pass.sendKeys(p);
		loginPageLocator.Signinn.click();
	}

	public void Verifyusercansignin() {
	boolean result=	loginPageLocator.Verifysignin.isDisplayed();
	Assert.assertTrue(result);	
	}

}



