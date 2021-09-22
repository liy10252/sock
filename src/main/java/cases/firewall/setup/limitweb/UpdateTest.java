package cases.firewall.setup.limitweb;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitweb.LimitWebPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class UpdateTest extends SeleniumTestCase {

	LimitWebPage limitWebPage;

	@Test(description = "修改")
	public void update(){

		limitWebPage = new LimitWebPage(driver);
		String start = param.getString("start");
		String end = param.getString("end");
		String web = param.getString("web");
		String redStr = param.getString("redStr");
		limitWebPage.updateDay(start,end,web,redStr);

		Assert.assertTrue(TestUtil.getValueList(limitWebPage.getTds())
				.contains(expect.getString("updateWeb").trim()),"修改每天受限验证错误");
	}

}
