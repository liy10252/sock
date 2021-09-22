package util;

import com.alibaba.fastjson.JSONObject;
import datacontroller.DataController;
import dataservice.esmlog.AuditLogService;
import driver.DriverFactory;
import listener.TestngListener;
import lombok.extern.log4j.Log4j;
import model.testcase.Cases;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import page.HomePage;
import page.LoginPage;
import page.authorize.AuthorizePage;
import page.leakscan.LeakScanPage;
import page.leakscan.setup.SetupPage;
import page.systemcenter.SystemCenterPage;
import page.firewall.FireWallPage;
import page.report.ReportPage;
import page.terminal.TerminalPage;
import page.terminal.setup.SetUpPage;
import page.viruskill.VirusKillPage;
import page.viruskill.log.LogPage;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Listeners({ TestngListener.class })
@Log4j
public class SeleniumTestCase {

	protected static ResourceBundle bundle = ResourceBundle.getBundle("test-config", Locale.CHINA);
	protected static EventFiringWebDriver driver;
	protected static List<Cases> caseList = DataController.caseList;
	protected static JSONObject param;
	protected static JSONObject expect;
	protected static String url = bundle.getString("url");
	protected static String userName = bundle.getString("userName");
	protected static String passWord = bundle.getString("passWord");
	protected static String identCode = bundle.getString("identCode");
	protected static String eid = bundle.getString("eid").toUpperCase();
	protected static String dataType = bundle.getString("DatabaseType");

	@BeforeClass
	public void setUp() {

		String caseName = this.getClass().getCanonicalName();
		driver = DriverFactory.start();
		TestUtil.driver = driver;
		ScreenShot.driver = driver;
		ScreenShot.caseName = caseName;
		log.info("开始测试case:" + this.getClass().getSimpleName()
				+ "----------");
		driver.navigate().to(url);
		moduleLogin(caseName,url);

		param = TestCaseUtil.getParam(caseList,caseName);

		expect = TestCaseUtil.getExpect(caseList,caseName);
	}

	@AfterClass
	public void tearDown() {

		log.info("结束测试case:" + this.getClass().getSimpleName()
				+ "----------");
		driver.quit();
		log.info("关闭浏览器");
	}


	public void moduleLogin(String caseName,String url){

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(userName,passWord,identCode);

		try {

				TestUtil.waitForTitle("安全中心");

		}catch(TimeoutException e){
			loginPage.clear();
			loginPage.login(userName,passWord,identCode);
		}

		HomePage homePage = new HomePage(driver);

		if(caseName.contains("terminal")){

			homePage.gotoTerminal();
			try{
				TestUtil.waitForTitle("全网终端-概览");
			}catch (TimeoutException e){
				homePage.gotoTerminal();
			}

			TerminalPage terminalPage = new TerminalPage(driver);
			if(caseName.contains("log")){
				terminalPage.gotoLog();
			}else if(caseName.contains("remark")){
				terminalPage.gotoRemark();
			}else if(caseName.contains("history")){
				terminalPage.gotoHistory();
			}else if(caseName.contains("command")){
				terminalPage.gotoCommand();
			}

			if(caseName.contains("setup")){
				terminalPage.gotoSetup();
				SetUpPage setUpPage = new SetUpPage(driver);
				if(caseName.contains("softwareup")){
					setUpPage.gotoSoftwareUp();
				}else if(caseName.contains("centerser")){
					setUpPage.gotoCenterser();
				}else if(caseName.contains("keeplog")){
					setUpPage.gotoKeepLog();
				}
			}
		}

		if(caseName.contains("viruskill")){

			homePage.gotoVirusKill();
			try{
				TestUtil.waitForTitle("病毒查杀-概览");
			}catch (TimeoutException e){
				homePage.gotoVirusKill();
			}

			VirusKillPage virusKillPage = new VirusKillPage(driver);
			if(caseName.contains("log")){
				virusKillPage.gotoLog();
				LogPage logPage = new LogPage(driver);
				if(caseName.contains("virusdetail")){
					logPage.gotoXav_virus();
				}else if(caseName.contains("scanevent")){
					logPage.gotoXav_scanevent();
				}else if(caseName.contains("sysdef")){
					logPage.gotoXav_sysdef();
				}else if(caseName.contains("appdef")){
					logPage.gotoXav_botauditlog();
				}
			}

			if(caseName.contains("setup")){
				virusKillPage.gotoSetup();
				page.viruskill.setup.SetUpPage setUpPage
						= new page.viruskill.setup.SetUpPage(driver);
				if(caseName.contains("whitelist")){
					setUpPage.gotoWhiteList();
			    }else if(caseName.contains("blacklist")){
					setUpPage.gotoBlackList();
				}else if(caseName.contains("virusbackup")){
					setUpPage.gotoVirusBackup();
				}else if(caseName.contains("virusscan")){
					setUpPage.gotoVirusScan();
				}else if(caseName.contains("timingscan")){
					setUpPage.gotoTimingScan();
				}else if(caseName.contains("filemonitor")){
					setUpPage.gotoFileMonitor();
				}else if(caseName.contains("ruleofcon")){
					setUpPage.gotoRuleOfCon();
				}else if(caseName.contains("usbmonitor")){
					setUpPage.gotoUsbMonitor();
				}else if(caseName.contains("sysstreng")){
					setUpPage.gotoSysStreng();
				}else if(caseName.contains("blackmail")){
					setUpPage.gotoBlackMail();
				}else if(caseName.contains("appstreng")){
					setUpPage.gotoAppStreng();
				}else if(caseName.contains("privatecloud")){
					setUpPage.gotoPrivateCloud();
				}else if(caseName.contains("linuxvirus")){
					setUpPage.gotoLinuxVirus();
				}else if(caseName.contains("mailmonitor")){
					setUpPage.gotoMailMonitor();
				}else if(caseName.contains("sharemonitor")){
					setUpPage.gotoShareMonitor();
				}else if(caseName.contains("ftpmonitor")){
					setUpPage.gotoFtpMonitor();
				}else if(caseName.contains("sword")){
					setUpPage.gotoSword();
				}
			}
		}



		if(caseName.contains("firewall")){

			homePage.gotoFireWall();
			try{
				TestUtil.waitForTitle("防火墙-概览");
			}catch (TimeoutException e){
				homePage.gotoFireWall();
			}

			FireWallPage fireWallPage = new FireWallPage(driver);
			if(caseName.contains("log")){
				fireWallPage.gotoLog();
				page.firewall.log.LogPage logPage = new page.firewall.log.LogPage(driver);
				if(caseName.contains("malice")){
					logPage.gotoMalice();
				}else if(caseName.contains("hacker")){
					logPage.gotoHacker();
				}else if(caseName.contains("advert")){
					logPage.gotoAdvert();
				}else if(caseName.contains("url")){
					logPage.gotoUrl();
				}else if(caseName.contains("network")){
					logPage.gotoNetWork();
				}else if(caseName.contains("share")){
					logPage.gotoShare();
				}else if(caseName.contains("flow")){
					logPage.gotoFlow();
				}
			}
			if(caseName.contains("safeshare")){
				fireWallPage.gotoSafeShare();
			}

			if(caseName.contains("setup")){
				fireWallPage.gotoSetup();
				page.firewall.setup.SetUpPage
						setUpPage	= new 	page.firewall.setup.SetUpPage(driver);
				if(caseName.contains("netprotect")){
					setUpPage.gotoNetProtect();
				}else if(caseName.contains("whitelist")){
					setUpPage.gotoWhiteList();
				}else if(caseName.contains("hack")){
					setUpPage.gotoHack();
				}else if(caseName.contains("limitweb")){
					setUpPage.gotoLimitWeb();
				}else if(caseName.contains("limitapp")){
					setUpPage.gotoLimitApp();
				}else if(caseName.contains("flowmanage")){
					setUpPage.gotoFlowManage();
				}else if(caseName.contains("secureshare")){
					setUpPage.gotoSecureShare();
				}else if(caseName.contains("adshare")){
					setUpPage.gotoAdShare();
				}else if(caseName.contains("attack")){
					setUpPage.gotoAttack();
				}else if(caseName.contains("manage")){
					setUpPage.gotoManage();
				}else if(caseName.contains("tamper")){
					setUpPage.gotoTamper();
				}else if(caseName.contains("rule")){
					setUpPage.gotoRule();
				}
			}

		}

		if(caseName.contains("leakscan")){

			homePage.gotoLeakScan();
			try{
				TestUtil.waitForTitle("漏洞扫描-概览");
			}catch (TimeoutException e){
				homePage.gotoLeakScan();
			}

			LeakScanPage leakScanPage = new LeakScanPage(driver);

			if(caseName.contains("log")){
				leakScanPage.gotoLog();
				page.leakscan.log.LogPage logPage = new page.leakscan.log.LogPage(driver);
				if(caseName.contains("notice")){
					logPage.gotoNotice();
				}
			}else if(caseName.contains("setup")){
				leakScanPage.gotoSetup();
				SetupPage setupPage = new SetupPage(driver);
				if(caseName.contains("white")){
					setupPage.gotoWhite();
				}else if(caseName.contains("black")){
					setupPage.gotoBlack();
				}
			}
		}

		if(caseName.contains("report")) {

			homePage.gotoReport();
			try {
				TestUtil.waitForTitle("报告预警-定制报告");
			} catch (TimeoutException e) {
				homePage.gotoReport();
			}

			ReportPage reportPage = new ReportPage(driver);

			if(caseName.contains("history")){
				reportPage.gotoHistory();
			}else if(caseName.contains("warningrule")){
				reportPage.gotoWarningRule();
			}else if(caseName.contains("warningrecord")){
				reportPage.gotoWarningRecord();
			}
		}

		if(caseName.contains("authorize")) {

			homePage.gotoAuthorize();
			try {
				TestUtil.waitForTitle("授权管理-今日授权终端");
			} catch (TimeoutException e) {
				homePage.gotoAuthorize();
			}

			AuthorizePage authorizePage = new AuthorizePage(driver);

			if(caseName.contains("historyauth")){
				authorizePage.gotoHistoryAuth();
			}
		}

		if(caseName.contains("systemcenter")) {

			homePage.gotoSystemCenter();
			try {
				TestUtil.waitForTitle("系统中心-账户信息");
			} catch (TimeoutException e) {
				homePage.gotoSystemCenter();
			}

			SystemCenterPage systemCenterPage = new SystemCenterPage(driver);

			if(caseName.contains("company")){
				systemCenterPage.gotoCompany();
			}else if(caseName.contains("message")){
				systemCenterPage.gotoMessage();
			}else if(caseName.contains("setupcenter")){
				systemCenterPage.gotoSetupCenter();
			}else if(caseName.contains("auditlog")){

				if(caseName.contains("TimeFrameTest")){
					new AuditLogService(eid).insertAuditLog(dataType);
				}
				systemCenterPage.gotoAuditLog();
			}else if(caseName.contains("usermanage")){
				systemCenterPage.gotoUserManage();
			}

		}

	}
}
