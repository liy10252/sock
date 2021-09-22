package cases.terminal.group;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.group.GroupPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class GroupTest extends SeleniumTestCase {

	GroupPage groupPage;
	String modifyName;

	@Test(description = "添加组")
	public void add(){

		groupPage = new GroupPage(driver);
		String groupName = param.getString("name");
		groupPage.addGroup(groupName);
		Assert.assertEquals(groupPage.getGroupValue().getText(),groupName,"添加组验证错误");

	}

	@Test(dependsOnMethods = "add",description = "修改组")
	public void modify(){

		modifyName = param.getString("modifyName");
		groupPage.modifyGroup(driver,modifyName);
		Assert.assertEquals(groupPage.getModifyValue().getText(),modifyName,"修改组验证错误");
	}

	@Test(dependsOnMethods = "modify",description = "删除组")
	public void delete(){

		groupPage.deleteGroup(driver);
		TestUtil.waitForElementOut(driver.findElement(By.xpath("//span[text()='modifytestgroup']")));
		Assert.assertFalse(TestUtil.getValueList(groupPage.getGroups())
				.contains(modifyName),"删除组验证错误");
	}

}
