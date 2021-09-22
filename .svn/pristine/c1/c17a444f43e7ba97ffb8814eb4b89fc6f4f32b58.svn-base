package cases.viruskill.setup.usbmonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.usbmonitor.UsbMonitorPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	UsbMonitorPage usbMonitorPage;

	@Test(description = "恢复默认")
	public void renew(){

		usbMonitorPage = new UsbMonitorPage(driver);
		usbMonitorPage.renew();

		Assert.assertTrue(usbMonitorPage.getBootEnabled().isSelected(),"恢复U盘监控验证错误");
		Assert.assertTrue(usbMonitorPage.getAsk().isSelected(),"恢复出入U盘验证错误");
		Assert.assertEquals(usbMonitorPage.getKillDepth().getAttribute("value"),
				expect.getString("depth"),"恢复查杀深度验证错误");
	}
}
