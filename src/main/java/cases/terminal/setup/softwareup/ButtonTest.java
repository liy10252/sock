package cases.terminal.setup.softwareup;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.softwareup.SoftwareUpPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ButtonTest extends SeleniumTestCase {

	SoftwareUpPage softwareUpPage;

	@Test(description = "按钮设置一")
	public void buttonOne(){

		softwareUpPage = new SoftwareUpPage(driver);
		softwareUpPage.buttonUtilOne();
		TestUtil.seleniumWait();

		Assert.assertTrue(softwareUpPage.getStartCreate().isSelected(),"开始菜单验证错误");
		Assert.assertTrue(softwareUpPage.getDesktopCreate().isSelected(),"添加到桌面验证错误");
		Assert.assertTrue(softwareUpPage.getManual().isSelected(),"升级模式验证错误");

	}

	@Test(dependsOnMethods = "buttonOne",description = "按钮设置二")
	public void buttonTwo(){

		softwareUpPage.buttonUtilTwo();
		TestUtil.seleniumWait();

		Assert.assertTrue(softwareUpPage.getStartNoCreate().isSelected(),"开始菜单验证失败");
		Assert.assertTrue(softwareUpPage.getDesktopNoCreate().isSelected(),"添加到桌面验证失败");
		Assert.assertTrue(softwareUpPage.getMon().findElement(By.xpath("./input")).isSelected(),"周一验证失败");
		Assert.assertTrue(softwareUpPage.getTues().findElement(By.xpath("./input")).isSelected(),"周二验证失败");
		Assert.assertTrue(softwareUpPage.getWed().findElement(By.xpath("./input")).isSelected(),"周三验证失败");
		Assert.assertTrue(softwareUpPage.getThur().findElement(By.xpath("./input")).isSelected(),"周四验证失败");
		Assert.assertTrue(softwareUpPage.getFri().findElement(By.xpath("./input")).isSelected(),"周五验证失败");
		Assert.assertTrue(softwareUpPage.getSat().findElement(By.xpath("./input")).isSelected(),"周六验证失败");
		Assert.assertTrue(softwareUpPage.getSun().findElement(By.xpath("./input")).isSelected(),"周日验证失败");

	}

	@Test(dependsOnMethods = "buttonOne",description = "按钮设置三")
	public void buttonThree(){

		softwareUpPage.buttonUtilThree(driver);
		Assert.assertTrue(softwareUpPage.getMalice().isSelected(),"恶意网址库验证错误");
		Assert.assertTrue(softwareUpPage.getForceUpdate().isSelected(),"强制更新验证错误");
		Assert.assertTrue(softwareUpPage.getConnect().isSelected(),"代理设置验证错误");
	}
}
