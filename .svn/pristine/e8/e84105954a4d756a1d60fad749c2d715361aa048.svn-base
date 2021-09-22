package cases.systemcenter.message;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.message.MessagePage;
import util.SeleniumTestCase;
import util.TestUtil;

public class SingleTest extends SeleniumTestCase {

	MessagePage messagePage;

	@Test(description = "标记已读")
	public void read(){

		messagePage = new MessagePage(driver);
		messagePage.singleRead();

		Assert.assertEquals(TestUtil.getValueList(messagePage.getAllStatus())
						.contains(expect.getString("read"))
				,true,"标为已读验证错误");
	}

	@Test(dependsOnMethods = "read",description = "删除")
	public void del(){

		messagePage.singleDel();

		Assert.assertTrue(messagePage.getAllStatus().size()<
				expect.getInteger("del"),"删除验证错误");
	}
}
