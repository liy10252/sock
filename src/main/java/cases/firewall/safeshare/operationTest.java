package cases.firewall.safeshare;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.firewall.safeshare.SafeSharePage;
import util.Assertion;
import util.SeleniumTestCase;

public class operationTest extends SeleniumTestCase {

	SafeSharePage safeSharePage;

	@Test(description = "只读")
	public void readOnly(){

		safeSharePage = new SafeSharePage(driver);
		safeSharePage.getCustomSearch().click();
		safeSharePage.singleClick(safeSharePage.getOperationAll(),safeSharePage.getReadOnly());
		Assertion.verifyEquals(safeSharePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().contains(expect.getString("readOnly")),true,"只读验证失败");

		safeSharePage.getDetailButton().click();
		Assertion.verifyEquals(safeSharePage.getWebDetailTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("readOnlyState"),"只读验证失败");

	}

	@Test(dependsOnMethods = "readOnly",description = "读写")
	public void readWrite(){

		safeSharePage.singleClick(safeSharePage.getOperationAll(),safeSharePage.getReadWrite());
		Assertion.verifyEquals(safeSharePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().contains(expect.getString("readWrite")),true,"读写验证失败");

		safeSharePage.getDetailButton().click();
		Assertion.verifyEquals(safeSharePage.getWebDetailTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("readWriteState"),"读写验证失败");

	}
}
