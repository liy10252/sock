package cases.viruskill.setup.privatecloud;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.privatecloud.PrivateCloudPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	PrivateCloudPage privateCloudPage;

	@Test(description = "恢复默认")
	public void renew(){

		privateCloudPage = new PrivateCloudPage(driver);
		privateCloudPage.renew();

		Assert.assertFalse(privateCloudPage.getStart().isSelected(),"恢复启动私有云验证错误");
		Assert.assertTrue(privateCloudPage.getIp().getAttribute("value").isEmpty(),
				"恢复服务器IP验证错误");
		Assert.assertEquals(privateCloudPage.getPort().getAttribute("value"),expect.getString("port"),
				"恢复服务器端口验证错误");
		Assert.assertTrue(privateCloudPage.getName().getAttribute("value").isEmpty(),
				"恢复服务器友好名称验证错误");
	}
}
