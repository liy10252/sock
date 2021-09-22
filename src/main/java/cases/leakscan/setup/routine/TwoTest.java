package cases.leakscan.setup.routine;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.routine.RoutinePage;
import util.SeleniumTestCase;

public class TwoTest extends SeleniumTestCase {

	RoutinePage routinePage;

	@Test(description = "测试二")
	public void test(){

		    routinePage = new RoutinePage(driver);
			String weekTime = param.getString("weekTime");

			routinePage.testTwo(weekTime);

			Assert.assertTrue(routinePage.getLeakMiddle().isSelected(),"漏洞级别错误");
			Assert.assertTrue(routinePage.getThird().isSelected(),"产品范围错误");
			Assert.assertTrue(routinePage.getWeekBtn().isSelected(),"每周错误");
			Assert.assertTrue(routinePage.getMon().findElement(By.xpath("./input")).isSelected(),"周一错误");
			Assert.assertTrue(routinePage.getTues().findElement(By.xpath("./input")).isSelected(),"周二错误");
			Assert.assertTrue(routinePage.getWed().findElement(By.xpath("./input")).isSelected(),"周三错误");
			Assert.assertTrue(routinePage.getThur().findElement(By.xpath("./input")).isSelected(),"周四错误");
			Assert.assertTrue(routinePage.getFri().findElement(By.xpath("./input")).isSelected(),"周五错误");
			Assert.assertTrue(routinePage.getSat().findElement(By.xpath("./input")).isSelected(),"周六错误");
			Assert.assertTrue(routinePage.getSun().findElement(By.xpath("./input")).isSelected(),"周日错误");

	}
}
