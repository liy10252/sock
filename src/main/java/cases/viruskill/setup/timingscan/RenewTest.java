package cases.viruskill.setup.timingscan;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.timingscan.TimingScanPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	TimingScanPage timingScanPage;

	@Test(description = "恢复默认")
	public void renew(){

		timingScanPage = new TimingScanPage(driver);
		timingScanPage.renew();

		Assert.assertFalse(timingScanPage.getFullScan().isSelected(),"恢复定时全盘扫描验证错误");
		Assert.assertTrue(timingScanPage.getBootUp().isSelected(),"恢复时间设置验证错误");
		Assert.assertEquals(timingScanPage.getEveryDayInput().getAttribute("value"),
				expect.getString("dayTime"),"恢复每天时间验证错误");
		Assert.assertEquals(timingScanPage.getEveryWeekInput().getAttribute("value"),
				expect.getString("weekTime"),"恢复每周时间验证错误");
		Assert.assertFalse(timingScanPage.getScanList().isSelected(),"恢复扫描列表验证错误");
		Assert.assertFalse(timingScanPage.getTypeFile().isSelected(),"恢复扫描类型文件验证错误");
		Assert.assertTrue(timingScanPage.getTypeFileInput().getAttribute("value").isEmpty()
				,"恢复类型文件输入框验证错误");
		Assert.assertFalse(timingScanPage.getFastScan().isSelected(),"恢复快速扫描验证错误");
		Assert.assertTrue(timingScanPage.getEveryDayFast().isSelected(),"恢复快速每天验证错误");
		Assert.assertEquals(timingScanPage.getEveryDayInputFast().getAttribute("value"),
				expect.getString("dayTimeFast"),"恢复快速每天时间验证错误");
		Assert.assertEquals(timingScanPage.getEveryWeekInputFast().getAttribute("value"),
				expect.getString("weekTimeFast"),"恢复快速每周时间验证错误");
	}

}
