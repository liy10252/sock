package cases.viruskill.setup.usbmonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.usbmonitor.UsbMonitorPage;
import util.SeleniumTestCase;

public class UsbMonitorTest extends SeleniumTestCase {

	UsbMonitorPage usbMonitorPage;

	@Test(description = "U盘监控设置")
	public void usbMonitor(){

		usbMonitorPage = new UsbMonitorPage(driver);
		String depth = param.getString("depth");
		usbMonitorPage.usbMonitor(depth);

		Assert.assertFalse(usbMonitorPage.getBootEnabled().isSelected(),"	U盘监控验证错误");
		Assert.assertTrue(usbMonitorPage.getFastKill().isSelected(),"插入U盘验证错误");
		Assert.assertEquals(usbMonitorPage.getKillDepth().getAttribute("value"),
				depth,"查杀深度验证错误");
	}
}
