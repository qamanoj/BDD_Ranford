package com.pagelibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.LoginAction;
import pageobject.LoginPage;

public class LoginStepdefination {

	public branchesLoginStepdefinationData data = new branchesLoginStepdefinationData();


	public LoginStepdefination() {
		data.driver = Hooks.driver;
	}

	
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable {

		data.driver.get("http://srssprojects.in/home.aspx");
	}

	
	@When("^check the title with \"([^\"]*)\" data$")
	public void check_the_title_with_data(String exp) throws Throwable {
		String title = data.driver.getTitle();
		if (title.contains(exp)) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failled");
		}
	}

	
	@Then("^homepage should be displayed with login fields$")
	public void homepage_should_be_displayed_with_login_fields() throws Throwable {

		System.out.println("homepage should be display");
	}

	
	
	@Then("^close site$")
	public void close_site() throws Throwable {

		data.driver.close();
	}

	
	
	@When("^enter the userid and password fields$")
	public void enter_the_userid_and_password_fields() throws Throwable {
		
		PageFactory.initElements(data.driver, LoginPage.class);
		LoginAction.execute(data.driver);
	}

	
	
	@Then("^branches button should be display$")
	public void branches_button_should_be_display() throws Throwable {
		System.out.println("branches button should be displayed");
	}
	
	
	@When("^click on bramnches button$")
	public void click_on_bramnches_button(){
	    
		data.driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
	}

	
	
	@Then("^click on newBranch button$")
	public void click_on_newBranch_button() {
	    
		data.driver.findElement(By.id("BtnNewBR")).click();
	}

	
	@Then("^enter the BranchName \"([^\"]*)\"$")
	public void enter_the_BranchName(String branchname) throws Throwable {
	    
		data.driver.findElement(By.id("txtbName")).sendKeys(branchname);
	}

	
	@Then("^enter the AddressOne \"([^\"]*)\"$")
	public void enter_the_AddressOne(String address1) throws Throwable {
	  
		data.driver.findElement(By.id("txtAdd1")).sendKeys(address1);
	}

	@Then("^enter the AddressTwo \"([^\"]*)\"$")
	public void enter_the_AddressTwo(String address2) throws Throwable {
	   
		data.driver.findElement(By.id("Txtadd2")).sendKeys(address2);
	}

	@Then("^enter the AddressThree \"([^\"]*)\"$")
	public void enter_the_AddressThree(String address3) throws Throwable {
	   
		data.driver.findElement(By.id("txtadd3")).sendKeys(address3);
	}
	

	@Then("^enter the Area \"([^\"]*)\"$")
	public void enter_the_Area(String area) throws Throwable {
	 
		data.driver.findElement(By.id("txtArea")).sendKeys(area);
	}

	@Then("^enter the Zipcode \"([^\"]*)\"$")
	public void enter_the_Zipcode(String zipcode) throws Throwable {
	 
		data.driver.findElement(By.id("txtZip")).sendKeys(zipcode);
	}

	@Then("^enter the Country \"([^\"]*)\"$")
	public void enter_the_Country(String country) throws Throwable {
	  
		Select sel=new Select(data.driver.findElement(By.id("lst_counrtyU")));
		sel.selectByVisibleText(country);
	}

	@Then("^enter the State \"([^\"]*)\"$")
	public void enter_the_State(String state) throws Throwable {
		
		Select sel=new Select(data.driver.findElement(By.id("lst_stateI")));
		sel.selectByVisibleText(state);
	}

	@Then("^enter the City \"([^\"]*)\"$")
	public void enter_the_City(String city) throws Throwable {
		
		Select sel=new Select(data.driver.findElement(By.id("lst_cityI")));
		sel.selectByVisibleText(city);
	}

	
	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	 
		data.driver.findElement(By.id("btn_insert")).click();
	}

	@Then("^handel the branch creation popUp$")
	public void handel_the_branch_creation_popUp() throws Throwable {
	   
		Alert alt=data.driver.switchTo().alert();
		alt.accept();
	}

}
