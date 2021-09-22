package cases.report.warningrecord;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.warningrecord.WarningRecordPage;
import util.SeleniumTestCase;

public class TypeTest extends SeleniumTestCase {

	WarningRecordPage warningRecordPage;

	@Test(description = "清理失败")
	public void cleanFail(){

		warningRecordPage = new WarningRecordPage(driver);
		warningRecordPage.getCustomSearch().click();
		warningRecordPage.singleClick(warningRecordPage.getAll(),warningRecordPage.getCleanFail());

		Assert.assertEquals(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[4]/div")).getText().trim(),
				expect.getString("cleanFail"),"清理失败验证失败");
	}

	@Test(dependsOnMethods = "cleanFail",description = "病毒爆发")
	public void virusBreak(){

		warningRecordPage.singleClick(warningRecordPage.getAll(),warningRecordPage.getVirusBreak());

		Assert.assertEquals(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[4]/div")).getText().trim(),
				expect.getString("virusBreak"),"病毒爆发验证失败");

	}

	@Test(dependsOnMethods = "cleanFail",description = "病毒传染")
	public void virusContagion(){

		warningRecordPage.singleClick(warningRecordPage.getAll(),warningRecordPage.getVirusContagion());

		Assert.assertEquals(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[4]/div")).getText().trim(),
				expect.getString("virusContagion"),"病毒传染验证失败");

	}
}
