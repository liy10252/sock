package cases.terminal.remark;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.remark.RemarkPage;
import util.SeleniumTestCase;

public class RemarkTest extends SeleniumTestCase {

	RemarkPage remarkPage;

	@Test(description = "新增备注")
	public void insert(){

		remarkPage = new RemarkPage(driver);
		String text = param.getString("insert");
		remarkPage.insert(text);
		Assert.assertEquals(remarkPage.getReMark().getAttribute("value"),text,"新增备注验证失败");

	}

	@Test(dependsOnMethods = "insert",description = "修改备注")
	public void update(){

		String updateText = param.getString("update");
		remarkPage.update(updateText);
		Assert.assertEquals(remarkPage.getReMark().getAttribute("value"),updateText,"修改备注验证失败");
	}

	@Test(dependsOnMethods = "insert",description = "删除备注")
	public void delete(){

		remarkPage.delete();
		Assert.assertTrue(remarkPage.getReMark().getAttribute("value").isEmpty(),"删除备注验证失败");
	}

}
