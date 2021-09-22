package cases.leakscan.setup.routine;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.routine.RoutinePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	RoutinePage routinePage;

	@Test(description = "恢复默认")
	public void renew(){

		routinePage = new RoutinePage(driver);
		routinePage.renew();

		Assert.assertTrue(routinePage.getLeakAll().isSelected(),"恢复漏洞级别错误");
		Assert.assertTrue(routinePage.getSystem().isSelected(),"恢复产品范围错误");
		Assert.assertTrue(routinePage.getStart().isSelected(),"恢复类型错误");
		Assert.assertTrue(routinePage.getNoAutoFix().isSelected(),"恢复修复方式错误");
		Assert.assertTrue(routinePage.getPop().isSelected(),"恢复提示方式错误");
		Assert.assertTrue(routinePage.getOn().isSelected(),"恢复修复方式错误");
	}
}
