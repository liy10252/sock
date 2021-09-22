package cases.leakscan.setup.routine;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.routine.RoutinePage;
import util.SeleniumTestCase;

public class OneTest extends SeleniumTestCase {

	RoutinePage routinePage;

	@Test(description = "测试一")
	public void test(){

		routinePage = new RoutinePage(driver);
		String dayTime = param.getString("dayTime");

		routinePage.testOne(dayTime);

		Assert.assertTrue(routinePage.getLeakHigh().isSelected(),"漏洞级别错误");
		Assert.assertTrue(routinePage.getMicrosoft().isSelected(),"产品范围错误");
		Assert.assertTrue(routinePage.getDayBtn().isSelected(),"类型错误");
		Assert.assertEquals(routinePage.getDayInput().getAttribute("value"),dayTime,"每天时间错误");
		Assert.assertTrue(routinePage.getAutoFix().isSelected(),"修复方式错误");
		Assert.assertTrue(routinePage.getNoPop().isSelected(),"提示方式错误");
		Assert.assertTrue(routinePage.getOff().isSelected(),"修复方式错误");
	}


}
