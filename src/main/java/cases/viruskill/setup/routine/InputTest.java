package cases.viruskill.setup.routine;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.routine.RoutinePage;
import util.SeleniumTestCase;

public class InputTest extends SeleniumTestCase {

	RoutinePage routinePage;

	@Test(description = "输入框设置")
	public void input(){

		routinePage = new RoutinePage(driver);
		String count = param.getString("count");
		String sName = param.getString("sName");
		String addr = param.getString("addr");
		String sPort = param.getString("sPort");

		routinePage.inputUtil(driver,count,sName,addr,sPort);

		Assert.assertEquals(routinePage.getQueryCount().getAttribute("value"),
				count,"最多请求查询验证错误");
		Assert.assertEquals(routinePage.getName().getAttribute("value"),
				sName,"友好名称验证错误");
		Assert.assertEquals(routinePage.getAddress().getAttribute("value"),
				addr,"服务器地址验证错误");
		Assert.assertEquals(routinePage.getPort().getAttribute("value"),
				sPort,"服务器端口验证错误");

	}

}
