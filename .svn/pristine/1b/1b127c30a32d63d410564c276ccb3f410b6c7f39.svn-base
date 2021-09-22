package cases.systemcenter.setupcenter;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.setupcenter.SetupCenterPage;
import util.SeleniumTestCase;

public class ClientSerTest extends SeleniumTestCase {

	SetupCenterPage setupPage;

	@Test(description = "客户端和服务器端设置")
	public void setup(){

		setupPage = new SetupCenterPage(driver);
		String clearDay = param.getString("clearDay");
		String retainDay = param.getString("retainDay");
		setupPage.clientSerSet(clearDay,retainDay);

		Assert.assertEquals(setupPage.getCleanDay().getAttribute("value"),
				clearDay,"客户端清理时间验证错误");
		Assert.assertFalse(setupPage.getCleanLog().isSelected(),"同步清理日志验证错误");
		Assert.assertEquals(setupPage.getTerminal().getAttribute("value"),
				retainDay,"终端日志验证错误");
		Assert.assertEquals(setupPage.getVisit().getAttribute("value"),
				retainDay,"网址访问管理日志错误");
		Assert.assertEquals(setupPage.getAttack().getAttribute("value"),
				retainDay,"防黑客攻击日志错误");
		Assert.assertEquals(setupPage.getNetwork().getAttribute("value"),
				retainDay,"联网程序管理错误");
		Assert.assertEquals(setupPage.getShareVisit().getAttribute("value"),
				retainDay,"共享资源访问控制错误");
		Assert.assertEquals(setupPage.getShareList().getAttribute("value"),
				retainDay,"共享资源列表错误");
		Assert.assertEquals(setupPage.getFlow().getAttribute("value"),
				retainDay,"终端流量错误");
		Assert.assertEquals(setupPage.getProtect().getAttribute("value"),
				retainDay,"上网保护错误");
		Assert.assertEquals(setupPage.getReinforce().getAttribute("value"),
				retainDay,"应用加固行为审计错误");
		Assert.assertEquals(setupPage.getKill().getAttribute("value"),
				retainDay,"病毒杀毒错误");
		Assert.assertEquals(setupPage.getActive().getAttribute("value"),
				retainDay,"主动防御错误");
		Assert.assertEquals(setupPage.getScan().getAttribute("value"),
				retainDay,"病毒查杀记录错误");
		Assert.assertEquals(setupPage.getVillTrack().getAttribute("value"),
				retainDay,"病毒跟踪错误");

	}
}
