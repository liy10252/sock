package cases.viruskill.setup.ruleofcon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.ruleofcon.RuleOfConPage;
import util.SeleniumTestCase;

public class FileMonitorTest extends SeleniumTestCase {

	RuleOfConPage ruleOfConPage;
	String describe;

	@Test(description = "文件监控设置")
	public void fileMonitor(){

		ruleOfConPage = new RuleOfConPage(driver);
		describe = param.getString("describe");
		String action = param.getString("action");
		String handle = param.getString("handle");
		String process = param.getString("process");
		ruleOfConPage.fileUtil(describe,action,handle,process);

		Assert.assertTrue(ruleOfConPage.getOpenRule().isSelected(),"启用规则验证错误");
		Assert.assertFalse(ruleOfConPage.getNotifyUser().isSelected(),"通知用户验证错误");
		Assert.assertFalse(ruleOfConPage.getInterceptLog().isSelected(),"记录拦截日志验证错误");
		Assert.assertTrue(ruleOfConPage.getWebFileTr().findElement(By.xpath("./td[1]/input"))
				.isSelected(),"添加的规则应用验证错误");

		Assert.assertTrue(ruleOfConPage.getWebFileTr().findElement(
				By.xpath("./td[2]/input")).getAttribute("value").equals(describe),
				"添加的规则描述验证错误");
		Assert.assertTrue(ruleOfConPage.getWebFileTr().findElement(
				By.xpath("./td[3]/input")).getAttribute("value").equals(action),
				"添加的规则动作验证错误");
		Assert.assertTrue(ruleOfConPage.getWebFileTr().findElement(
				By.xpath("./td[4]/input")).getAttribute("value").equals(handle),
				"添加的规则处理验证错误");
		Assert.assertTrue(ruleOfConPage.getWebFileTr().findElement(
				By.xpath("./td[7]/input")).getAttribute("value").equals(process),
				"添加的规则进程验证错误");
	}

	@Test(dependsOnMethods = "fileMonitor",description = "删除规则")
	public void delete(){

		ruleOfConPage.fileDelete();
		Assert.assertEquals(ruleOfConPage.getWebFileRules().size(),expect.getIntValue("count"),
				"列表的条目数验证错误");
		Assert.assertFalse(ruleOfConPage.listUtil(ruleOfConPage.getWebFileRules())
						.contains(describe), "列表删除数据验证错误");

	}
}
