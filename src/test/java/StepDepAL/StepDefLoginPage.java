package StepDepAL;

import com.alekanda.PageAction.HomePageAction;
import com.alekanda.PageAction.LoginPageAction;
import com.alekanda.Utill.TestBase_AL;
import com.alekanda.Utill.Utillll;

import cucumber.api.java.en.Then;

public class StepDefLoginPage extends TestBase_AL {

	HomePageAction homePageAction= new HomePageAction();	
	LoginPageAction loginPageAction = new LoginPageAction();
	
	@Then("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		homePageAction.ClickonSigninbutton();   
	}

	@Then("^enter username and password and click signin$")
	public void enter_username_and_password_and_click_signin() throws Throwable {
		loginPageAction.uercard(prop.getProperty("mrxuser"), prop.getProperty("mrxpass"));   
	}

	@Then("^verify user can signin$")
	public void verify_user_can_signin() throws Throwable {
		loginPageAction.Verifyusercansignin(); 
		Utillll.takescreenshot(driver, "user profil page");
	}


}
