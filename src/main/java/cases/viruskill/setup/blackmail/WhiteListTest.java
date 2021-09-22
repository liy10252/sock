package cases.viruskill.setup.blackmail;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.blackmail.BlackMailPage;
import util.SeleniumTestCase;

public class WhiteListTest extends SeleniumTestCase {

	BlackMailPage blackMailPage;

	@Test(description = "白名单操作")
	public void whiteList(){

		blackMailPage = new BlackMailPage(driver);
		String white = param.getString("white");
		blackMailPage.whiteList(white);

//		Assert.assertTrue(blackMailPage.getSign().isSelected(),"自动放过签名程序验证错误");
		Assert.assertEquals(blackMailPage.getWhiteListInput().getAttribute("value"),
				white,"添加白名单验证错误");
	}

	@Test(dependsOnMethods = "whiteList",description = "删除白名单")
	public void delete(){

		blackMailPage.whiteDelete();

		Assert.assertTrue(blackMailPage.getWhiteTable().getText().isEmpty(),"删除白名单验证错误");
	}
}
