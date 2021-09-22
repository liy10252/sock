package cases.firewall.setup.attack;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.attack.AttackPage;
import util.SeleniumTestCase;

public class AttackTest extends SeleniumTestCase {

	AttackPage attackPage;

	@Test(description = "攻击设置")
	public void attackSet(){

		attackPage = new AttackPage(driver);
		String synStr = param.getString("syn");
		String icmpStr = param.getString("icmp");
		String udpStr = param.getString("udp");

		attackPage.setAttack(synStr,icmpStr,udpStr);

		Assert.assertFalse(attackPage.getOpen().isSelected(),"攻击拦截错误");
		Assert.assertFalse(attackPage.getPromptUser().isSelected(),"提示用户错误");
		Assert.assertFalse(attackPage.getSyn().isSelected(),"syn攻击错误");
		Assert.assertEquals(attackPage.getSynInput().getAttribute("value"),synStr,"syn错误");
		Assert.assertFalse(attackPage.getIcmp().isSelected(),"icmp攻击错误");
		Assert.assertEquals(attackPage.getIcmpInput().getAttribute("value"),icmpStr,"icmp错误");
		Assert.assertFalse(attackPage.getUdp().isSelected(),"udp攻击错误");
		Assert.assertEquals(attackPage.getUdpInput().getAttribute("value"),udpStr,"udp攻击错误");

	}
}
