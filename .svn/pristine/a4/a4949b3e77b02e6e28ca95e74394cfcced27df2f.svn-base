package cases.report.warningrecord;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.warningrecord.WarningRecordPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class DeleteTest extends SeleniumTestCase {

	WarningRecordPage warningRecordPage;

	@Test(description = "删除记录")
	public void delete(){

		warningRecordPage = new WarningRecordPage(driver);
		warningRecordPage.delete();

		Assert.assertFalse(TestUtil.getValueList(warningRecordPage.getWebNames())
				.contains(expect.getString("name")),"删除预警记录验证错误");
	}

}
