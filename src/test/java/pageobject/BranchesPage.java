package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BranchesPage {
	
	/*@FindBy(how=How.XPATH,using="//img[@src='images/Branches_but.jpg']")
	public static WebElement branchesbtn;
	
	@FindBy(how=How.ID,using="BtnNewBR")
	public static WebElement newbranchesbtn;*/
	
	@FindBy(how=How.ID,using="txtbName")
	public static WebElement branchname;
	
	@FindBy(how=How.ID,using="txtAdd1")
	public static WebElement address1;
	
	@FindBy(how=How.ID,using="Txtadd2")
	public static WebElement address2;
	
	@FindBy(how=How.ID,using="txtadd3")
	public static WebElement address3;
	
	@FindBy(how=How.ID,using="txtArea")
	public static WebElement area;
	
	@FindBy(how=How.ID,using="txtZip")
	public static WebElement zipcode;
	
	@FindBy(how=How.ID,using="lst_counrtyU")
	public static Select countryname;
	
	@FindBy(how=How.ID,using="lst_stateI")
	public static Select statename;
	
	@FindBy(how=How.ID,using="lst_cityI")
	public static Select cityname;
	
}
