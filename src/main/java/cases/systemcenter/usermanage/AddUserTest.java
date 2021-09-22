package cases.systemcenter.usermanage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.usermanage.UserManagePage;
import util.SeleniumTestCase;
import java.util.Map;

public class AddUserTest extends SeleniumTestCase {

	UserManagePage userManagePage;

	@Test(description = "添加管理员")
	public void addUser() {

		userManagePage = new UserManagePage(driver);
		Map<String, Object> params = param.getInnerMap();
		userManagePage.addUser(params);

		Assert.assertEquals(userManagePage.getWebTrTwo().findElement(By.xpath("./td[1]/a")).getText(),
				params.get("account").toString(),"添加管理员验证错误");
		Assert.assertEquals(userManagePage.getWebTrTwo().findElement(By.xpath("./td[2]/div")).getText(),
				params.get("alias").toString(),"添加管理员验证错误");
		Assert.assertEquals(userManagePage.getWebTrTwo().findElement(By.xpath("./td[3]/div")).getText(),
				expect.getString("type"),"添加管理员验证错误");

	}

}