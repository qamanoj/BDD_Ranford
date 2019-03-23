package modules;

import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;

public class LoginAction {

	public static void execute(WebDriver driver) {
		
		LoginPage.username.sendKeys("Admin");
		LoginPage.password.sendKeys("Admin");
		LoginPage.login.click();

	}
}
