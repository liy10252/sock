package page.firewall.setup.attack;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class AttackPage extends BasePage {

	@FindBy(id = "floodCheckTgl")
	private WebElement open;

	@FindBy(id = "flood_pop")
	private WebElement promptUser;

	@FindBy(id = "SYNEnable")
	private WebElement syn;

	@FindBy(id = "SYNdwSynFrq")
	private WebElement synInput;

	@FindBy(id = "ICMPEnable")
	private WebElement icmp;

	@FindBy(id = "ICMPdwSynFrq")
	private WebElement icmpInput;

	@FindBy(id = "UDPEnable")
	private WebElement udp;

	@FindBy(id = "UDPdwSynFrq")
	private WebElement udpInput;

	public AttackPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void setAttack(String synStr,String icmpStr,String udpStr){

		click(open);
		click(promptUser);
		click(syn);
		synInput.clear();
		synInput.sendKeys(synStr);
		click(icmp);
		icmpInput.clear();
		icmpInput.sendKeys(icmpStr);
		click(udp);
		udpInput.clear();
		udpInput.sendKeys(udpStr);
		click(apply);
	}
}
