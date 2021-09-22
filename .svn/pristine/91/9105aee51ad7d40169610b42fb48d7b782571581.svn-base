package cases.report.custom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.custom.CustomPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	CustomPage customPage;

	@Test(description = "名称搜索")
	public void searchName(){

		customPage = new CustomPage(driver);
		customPage.getCustomSearch().click();
		String name = param.getString("name");
		customPage.searchUtil(name);

		Assert.assertEquals(customPage.getWebDataTr().findElement(By.xpath("./td[2]")).getText(),
				name,"名称搜索验证错误");
	}
}
