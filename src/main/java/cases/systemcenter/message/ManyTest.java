package cases.systemcenter.message;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.message.MessagePage;
import util.SeleniumTestCase;

public class ManyTest extends SeleniumTestCase {

	MessagePage messagePage;

	@Test(description = "标记已读")
	public void read(){

		messagePage = new MessagePage(driver);
		messagePage.allRead();

		Assert.assertTrue(messagePage.checkItems(messagePage.getAllStatus(),expect.getString("read"))
				,"标记已读验证错误");
	}

	@Test(dependsOnMethods = "read",description = "删除选中")
	public void del(){

		messagePage.allDel();
		Assert.assertEquals(messagePage.getAlert().getText(),expect.getString("del"),
				"删除选中验证错误");
	}
}
