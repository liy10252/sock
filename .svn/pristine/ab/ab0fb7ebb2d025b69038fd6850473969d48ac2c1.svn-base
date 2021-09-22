package cases.firewall.log.malice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.malice.MalicePage;
import util.SeleniumTestCase;

public class TypeTest extends SeleniumTestCase {

	MalicePage malicePage;

	@Test(description = "木马网址")
	public void trojan(){

		malicePage = new MalicePage(driver);
		malicePage.getCustomSearch().click();
		malicePage.singleClick(malicePage.getTypeAll(),malicePage.getTrojan());
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("trojan"),"木马网址验证失败");
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("trojanState"),"木马网址验证失败");
	}

	@Test(dependsOnMethods = "trojan",description = "钓鱼网址")
	public void fish(){

		malicePage.singleClick(malicePage.getTypeAll(),malicePage.getFish());
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("fish"),"钓鱼网址验证失败");
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("fishState"),"钓鱼网址验证失败");
	}

	@Test(dependsOnMethods = "trojan",description = "恶意下载")
	public void malice(){

		malicePage.singleClick(malicePage.getTypeAll(),malicePage.getMalice());
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("malice"),"恶意下载验证失败");
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("maliceState"),"恶意下载验证失败");
	}

	@Test(dependsOnMethods = "trojan",description = "跨站攻击")
	public void attack(){

		malicePage.singleClick(malicePage.getTypeAll(),malicePage.getAttack());
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("attack"),"跨站攻击验证失败");
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("attackState"),"跨站攻击验证失败");
	}

	@Test(dependsOnMethods = "trojan",description = "搜索引擎")
	public void search(){

		malicePage.singleClick(malicePage.getTypeAll(),malicePage.getSearch());
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("search"),"搜索引擎验证失败");
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),expect.getString("searchState"),"搜索引擎验证失败");
	}
}
