package cases.terminal.setup.centerser;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.centerser.CenterSerPage;
import util.SeleniumTestCase;

public class InputTest extends SeleniumTestCase {

	CenterSerPage centerSerPage;

	@Test(description = "输入框设置")
	public void input(){

		centerSerPage = new CenterSerPage(driver);
		 String ip = param.getString("ip");
		 String start = param.getString("start");
		 String end = param.getString("end");
		centerSerPage.inputUtil(ip,start,end);

		Assert.assertEquals(centerSerPage.getWebServer().getText(),ip,"服务器列表验证错误");
		Assert.assertEquals(centerSerPage.getLimitStart().getAttribute("value")
				,start,"生效时间开始验证错误");
		Assert.assertEquals(centerSerPage.getLimitEnd().getAttribute("value")
				,end,"生效时间结束验证错误");
	}
}
