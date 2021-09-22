package cases.terminal.setup.tersetup;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.tersetup.TerSetUpPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class InputTest extends SeleniumTestCase {

	TerSetUpPage terSetUpPage;

	@Test(description = "输入框设置")
	public void input(){

		terSetUpPage = new TerSetUpPage(driver);
		String pwd = param.getString("pwd");
//		String mainText = param.getString("mainText");
//		String subText = param.getString("subText");
		terSetUpPage.inputUtil(pwd);

		TestUtil.seleniumWait();
		Assert.assertEquals(terSetUpPage.getPwd().getAttribute("value"),pwd,"管理员密码验证失败");
//		Assert.assertEquals(terSetUpPage.getMainTitle().getAttribute("value"),mainText,"主标题验证失败");
//		Assert.assertEquals(terSetUpPage.getSubHead().getAttribute("value"),subText,"副标题验证失败");

	}
}
