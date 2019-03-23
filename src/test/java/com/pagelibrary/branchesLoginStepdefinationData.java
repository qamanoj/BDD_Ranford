package com.pagelibrary;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.excelsheet.Excelconnetion;
import cucumber.api.java.en.Then;
import modules.BranchesAction;
import pageobject.BranchesPage;

public class branchesLoginStepdefinationData {
	
	public WebDriver driver;
	
	public List<HashMap<String,String>>  map;
	
	public branchesLoginStepdefinationData() {
		
		driver = Hooks.driver;
		map=Excelconnetion.data("D:\\Manoj WorkSpace\\BDD_RanfordBank\\ExcelData\\data.xls", "Sheet1");
	}
	
	@Then("^enter all the data with excel \"([^\"]*)\" dataset$")
	public void enter_all_the_data_with_excel_dataset(String arg1) throws Throwable {
	   
		int index=Integer.parseInt(arg1)-1;
		
		/*driver.findElement(By.id("txtbName")).sendKeys(map.get(index).get("BranchName"));
		driver.findElement(By.id("txtAdd1")).sendKeys(map.get(index).get("Address1"));
		driver.findElement(By.id("Txtadd2")).sendKeys(map.get(index).get("Address2"));
		driver.findElement(By.id("txtadd3")).sendKeys(map.get(index).get("Address3"));
		driver.findElement(By.id("txtArea")).sendKeys(map.get(index).get("Area"));
		driver.findElement(By.id("txtZip")).sendKeys(map.get(index).get("Zipcode"));
		
		Select sel=new Select(driver.findElement(By.id("lst_counrtyU")));
		sel.selectByVisibleText(map.get(index).get("newCountry"));
		
		Select sel1=new Select(driver.findElement(By.id("lst_stateI")));
		sel1.selectByVisibleText(map.get(index).get("newState"));
		
		Select sel2=new Select(driver.findElement(By.id("lst_cityI")));
		sel2.selectByVisibleText(map.get(index).get("newCity"));*/
		
		PageFactory.initElements(driver, BranchesPage.class);
		BranchesAction.branchExecute(driver, map, index);
	}
}