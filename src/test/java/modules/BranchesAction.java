package modules;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import pageobject.BranchesPage;

public class BranchesAction {

	public static void branchExecute(WebDriver driver,List<HashMap<String,String>>  map,int index)
	{
		/*BranchesPage.branchesbtn.click();
		BranchesPage.newbranchesbtn.click();*/
		BranchesPage.branchname.sendKeys(map.get(index).get("BranchName"));
		BranchesPage.address1.sendKeys(map.get(index).get("Address1"));
		BranchesPage.address2.sendKeys(map.get(index).get("Address2"));
		BranchesPage.address3.sendKeys(map.get(index).get("Address3"));
		BranchesPage.area.sendKeys(map.get(index).get("Area"));
		BranchesPage.zipcode.sendKeys(map.get(index).get("Zipcode"));
		BranchesPage.countryname.selectByVisibleText(map.get(index).get("newCountry"));
		BranchesPage.statename.selectByVisibleText(map.get(index).get("newState"));
		BranchesPage.cityname.selectByVisibleText(map.get(index).get("newCity"));
	}

}
