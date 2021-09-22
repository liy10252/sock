package cases.viruskill.setup.privatecloud;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.privatecloud.PrivateCloudPage;
import util.SeleniumTestCase;

public class PrivateCloudTest extends SeleniumTestCase {

	PrivateCloudPage privateCloudPage;

	@Test(description = "私有云操作")
	public void cloud(){

		privateCloudPage = new PrivateCloudPage(driver);
		String ip = param.getString("ip");
		String port = param.getString("port");
		String name = param.getString("name");
		privateCloudPage.cloudUtil(ip,port,name);

		Assert.assertTrue(privateCloudPage.getStart().isSelected(),"启动私有云验证错误");
		Assert.assertEquals(privateCloudPage.getIp().getAttribute("value"),
				ip,"服务器IP验证错误");
		Assert.assertEquals(privateCloudPage.getPort().getAttribute("value"),
				port,"服务器端口验证错误");
		Assert.assertEquals(privateCloudPage.getName().getAttribute("value"),
				name,"服务器友好名称验证错误");
	}
}
