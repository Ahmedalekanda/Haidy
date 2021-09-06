package StepDepAL;

import org.apache.log4j.Logger;

import com.alekanda.PageAction.HomePageAction;
import com.alekanda.Utill.LogeHelper_Log;
import com.alekanda.Utill.TestBase_AL;
import com.alekanda.Utill.Utillll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomePage extends TestBase_AL {
	
	HomePageAction homePageAction= new HomePageAction();	
	Logger loggs = LogeHelper_Log.getLogss(LogeHelper_Log.class);
	
	@Given("^Open application \"([^\"]*)\"$")
	public void open_application(String URL) throws Throwable {
		lunchh(URL); 
		Utillll.takescreenshot(driver, "Home page");
		loggs.info("Openning url");
	}

	@Then("^product search by name$")
	public void product_search_by_name() throws Throwable {
		homePageAction.Productsearchbyname();
		loggs.info("Product Search Name");
	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		homePageAction.Clickonsearchbutton();
		loggs.info("Clicking Search Button");
	}

	@Then("^verify user on search result display$")
	public void verify_user_on_search_result_display() throws Throwable {
		homePageAction.Verifyuseronsearchresultdisplay();  
		Utillll.takescreenshot(driver, "Search result page");
		loggs.info("Search Result");
	}



}
