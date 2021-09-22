package cases.viruskill.setup.blacklist;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.blacklist.BlackListPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class BlackListTest extends SeleniumTestCase {

	BlackListPage blackListPage;

	@Test(description = "添加黑名单")
	public void add(){

		blackListPage = new BlackListPage(driver);
		blackListPage.addBlack(TestUtil.JsonToList(param.getJSONArray("addName"),"name"));

		Assert.assertTrue(blackListPage.getWebTr().size() ==
				expect.getIntValue("count"),"添加黑名单验证错误");

		Assert.assertTrue(TestUtil.getValueList(blackListPage.getWebTr()).
				containsAll(TestUtil.JsonToList(expect.getJSONArray("addValue"),"name")),"添加黑名单验证错误");

	}

	@Test(dependsOnMethods = "add",description = "删除黑名单")
	public void delete(){

		blackListPage.deleteUtil();

		Assert.assertTrue(blackListPage.getWebTr().size()
				==expect.getIntValue("delete"),"删除黑名单验证错误");

	}
}
