package cases.terminal.setup.softwareup;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.softwareup.SoftwareUpPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class InputTest extends SeleniumTestCase {

	SoftwareUpPage softwareUpPage;

	@Test(description = "输入框设置一")
	public void inputOne(){

		softwareUpPage = new SoftwareUpPage(driver);
		String weekTime = param.getString("weekTime");

		softwareUpPage.inputUtilOne(weekTime);

		TestUtil.seleniumWait();
		Assert.assertEquals(softwareUpPage.getEveryWeekInput().getAttribute("value"),weekTime,"每周输入框验证失败");

	}

	@Test(dependsOnMethods = "inputOne",description = "输入框设置二")
	public void inputTwo(){

		String forceStr = param.getString("force");
		String ipStr = param.getString("ipStr");
		String portStr = param.getString("portStr");
		String name = param.getString("name");
		String pwd = param.getString("pwd");
		softwareUpPage.inputUtilTwo(driver,forceStr,ipStr,portStr,name,pwd);

		Assert.assertEquals(softwareUpPage.getIp().getAttribute("value"),ipStr,"地址验证失败");
		Assert.assertEquals(softwareUpPage.getPort().getAttribute("value"),portStr,"端口验证失败");
		Assert.assertEquals(softwareUpPage.getUsername().getAttribute("value"),name,"账号验证失败");
		Assert.assertEquals(softwareUpPage.getPassword().getAttribute("value"),pwd,"密码验证失败");

	}
}
