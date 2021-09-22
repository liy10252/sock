package cases.firewall.setup.adshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.adshare.AdSharePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	AdSharePage adSharePage;

	@Test(description = "恢复默认")
	public void renew(){

		adSharePage = new AdSharePage(driver);
		adSharePage.renew();

		Assert.assertFalse(adSharePage.getOpenAd().isSelected(),"恢复开启ADSL共享验证错误");
		Assert.assertEquals(adSharePage.getBandWidth().getAttribute("value"),
				expect.getString("width"),"恢复总带宽验证错误");
	}
}
