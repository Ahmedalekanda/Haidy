package com.alekanda.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.alekanda.Utill.TestBase_AL;

public class HomePageLocator extends TestBase_AL {

	{

		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.XPATH, using = "//input[@class='gh-tb ui-autocomplete-input']")
	public WebElement Productsearchbyname;
	@FindBy(how = How.ID, using = "gh-btn")
	public WebElement Clicksearchbutton;
	@FindBy(how = How.XPATH, using = "//body/div[4]/div[4]/ul[1]/li[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/span[1]")
	public WebElement Resultdisplay;
	@FindBy(how = How.XPATH, using = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/span[@id='gh-ug']/a[1]")
	public WebElement Signinbutton;

}


