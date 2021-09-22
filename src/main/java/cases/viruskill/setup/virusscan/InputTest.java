package cases.viruskill.setup.virusscan;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.virusscan.VirusScanPage;
import util.SeleniumTestCase;

public class InputTest extends SeleniumTestCase {

	VirusScanPage virusScanPage;

	@Test(description = "输入框设置")
	public void input(){

		virusScanPage = new VirusScanPage(driver);
		String fileType = param.getString("fileType");
		String fileSizes = param.getString("fileSizes");
		String filedepths = param.getString("filedepths");

		virusScanPage.inputUtil(fileType,fileSizes,filedepths);

		Assert.assertEquals(virusScanPage.getFileTypeInput().getAttribute("value"),
				fileType,"");
		Assert.assertEquals(virusScanPage.getFileSize().getAttribute("value"),
				fileSizes,"");
		Assert.assertEquals(virusScanPage.getFiledepth().getAttribute("value"),
				filedepths,"");

	}
}
