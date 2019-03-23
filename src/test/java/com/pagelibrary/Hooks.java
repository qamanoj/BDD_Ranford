package com.pagelibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public static void callbrow() {
		System.out.println("call browser");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public static void screenshot(Scenario s)
	{
		if(s.isFailed())
		{
			TakesScreenshot screen=(TakesScreenshot)driver;

			byte[] shot=screen.getScreenshotAs(OutputType.BYTES);

			s.embed(shot, "image/png");
			s.write("test is failed");
		}
		else
		{
			s.write("test is fassed");
		}
		driver.close();
	}
}


