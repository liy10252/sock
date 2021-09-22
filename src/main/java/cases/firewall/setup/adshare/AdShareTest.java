package cases.firewall.setup.adshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.adshare.AdSharePage;
import util.SeleniumTestCase;

public class AdShareTest extends SeleniumTestCase {

	AdSharePage adSharePage;

	@Test(description = "共享设置")
	public void share(){

		adSharePage = new AdSharePage(driver);
		String width = param.getString("width");
		adSharePage.shareUtil(width);

		Assert.assertTrue(adSharePage.getOpenAd().isSelected(),"开启ADSL共享验证错误");
		Assert.assertEquals(adSharePage.getBandWidth().getAttribute("value"),
				width,"总带宽验证错误");
	}
}
