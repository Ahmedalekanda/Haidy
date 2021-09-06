package com.alekanda.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.alekanda.Utill.TestBase_AL;

public class LoginPageLocator extends TestBase_AL  {
	public LoginPageLocator() {
	
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "userid")
	public WebElement Email;

	@FindBy(how = How.ID, using = "signin-continue-btn")
	public WebElement Clickcontinue;

	@FindBy(how = How.ID, using = "pass")
	public WebElement Pass;

	@FindBy(how = How.NAME, using = "sgnBt")
	public WebElement Signinn;

	@FindBy(how = How.XPATH, using = "//button[@id='gh-ug']")
	public WebElement Verifysignin;

}



