package cases.viruskill.setup.routine;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.routine.RoutinePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	RoutinePage routinePage;

	@Test(description = "恢复默认一")
	public void renewOne(){

		routinePage = new RoutinePage(driver);
		routinePage.renew();

		Assert.assertFalse(routinePage.getLock().isSelected(),"恢复禁止终端修改黑白名单验证错误");
		Assert.assertEquals(routinePage.getCustomInput().getAttribute("value"),
				"","自定义密码验证错误");
		Assert.assertTrue(routinePage.getPwd().isSelected(),"恢复管理员密码错误");
		Assert.assertFalse(routinePage.getCustomButton().isSelected(),"恢复自定义密码按钮验证错误");
		Assert.assertTrue(routinePage.getRun().isSelected(),"恢复运行环境验证错误");
		Assert.assertTrue(routinePage.getTrack().isSelected(),"恢复病毒跟踪验证错误");
		Assert.assertTrue(routinePage.getLog().isSelected(),"恢复病毒日志验证错误");
		Assert.assertFalse(routinePage.getScanCache().isSelected(),"恢复扫描缓存验证错误");
//		Assert.assertFalse(routinePage.getMonitor().isSelected(),"恢复监控缓存验证错误");
		Assert.assertFalse(routinePage.getStrongScan().isSelected(),"恢复强力扫描验证错误");
		Assert.assertFalse(routinePage.getStrongKill().isSelected(),"恢复强力查杀验证错误");
		Assert.assertTrue(routinePage.getAuto().isSelected(),"恢复设定扫描模式验证错误");
		Assert.assertFalse(routinePage.getWorm().isSelected(),"恢复蠕虫验证错误");
		Assert.assertFalse(routinePage.getRain().isSelected(),"恢复雨云病毒验证错误");
	}

	@Test(dependsOnMethods = "renewOne",description = "恢复默认二")
	public void renewTwo(){

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", routinePage.getWitkey());

		Assert.assertFalse(routinePage.getWitkey().isSelected(),"恢复威客虫验证错误");
		Assert.assertTrue(routinePage.getDll().isSelected(),"恢复DLL劫持免疫验证错误");
		Assert.assertEquals(routinePage.getWebCpu().getText(),
				expect.getString("cpu"),"恢复cpu占用率验证错误");
		Assert.assertEquals(routinePage.getWebConnect().getText(),
				expect.getString("connect"),"恢复云连接测试验证错误");
		Assert.assertTrue(routinePage.getPost().isSelected(),"恢复请求模式验证错误");

		Assert.assertEquals(routinePage.getQueryCount().getAttribute("value"),
				expect.getString("count"),"最多请求查询验证错误");
		Assert.assertEquals(routinePage.getName().getAttribute("value"),
				expect.getString("sName"),"友好名称验证错误");

	}

}
