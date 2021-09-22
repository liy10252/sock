package cases.firewall.setup.attack;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.attack.AttackPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	AttackPage attackPage;

	@Test(description = "恢复默认")
	public void renew(){

		attackPage = new AttackPage(driver);

		attackPage.renew();

		Assert.assertTrue(attackPage.getOpen().isSelected(),"恢复启用错误");
		Assert.assertTrue(attackPage.getPromptUser().isSelected(),"恢复提示用户错误");
		Assert.assertTrue(attackPage.getSyn().isSelected(),"恢复syn攻击错误");
		Assert.assertEquals(attackPage.getSynInput().getAttribute("value"),expect.getString("value"));
		Assert.assertTrue(attackPage.getIcmp().isSelected(),"恢复icmp错误");
		Assert.assertEquals(attackPage.getIcmpInput().getAttribute("value"),expect.getString("value"));
		Assert.assertTrue(attackPage.getUdp().isSelected(),"恢复UDP错误");
		Assert.assertEquals(attackPage.getUdpInput().getAttribute("value"),expect.getString("value"));
	}
}
