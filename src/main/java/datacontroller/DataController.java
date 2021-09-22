package datacontroller;

import dataservice.esmlog.*;
import dataservice.esmmanager.EsmOrganService;
import dataservice.esmmanager.EsmUserService;
import dataservice.testcase.CasesService;
import model.testcase.Cases;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import util.DatabaseUtil;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class DataController {

	public static SqlSession logSession = DatabaseUtil.getSqlSession("log");
	public static SqlSession managerSession = DatabaseUtil.getSqlSession("manager");
	public static SqlSession caseSession = DatabaseUtil.getSqlSession("testcase");
//	public static MongoBase mongoBase = new MongoBase();
	protected static ResourceBundle bundle = ResourceBundle.getBundle("test-config", Locale.CHINA);
	public static String eid = bundle.getString("eid").toUpperCase();
	public static String dataType = bundle.getString("DatabaseType");
	public static List<Cases> caseList;
//	public static List<ObjectId> ids;


	static {

		CasesService casesService = new CasesService(caseSession);
		caseList = casesService.getCaseList();
		caseSession.close();
	}

	@Test
	public void clearGroup() {

		GroupInfoService groupInfoService = new GroupInfoService(logSession);
		groupInfoService.clearGroup("testgroup");
		groupInfoService.clearGroup("modifytestgroup");
	}

	@Test
	public void updateEpinfoGroup() {

		EpInfoService epInfoService = new EpInfoService(logSession);
		epInfoService.updateEpinfoGroup();

	}

	@Test
	public void updateEpinfoMemo() {

		EpInfoService epInfoService = new EpInfoService(logSession);
		epInfoService.updateEpinfoMemo();
	}

	@Test
	public void updateRuaTime() {

		RuaLogService ruaLogService = new RuaLogService(logSession);
		ruaLogService.updateThisWeek();
		ruaLogService.updateLastMonth();
	}

	@Test
	public void updateXav_Virus() {

		XavVirusService xavvirusService = new XavVirusService(logSession);
		xavvirusService.updateThisWeek();
		xavvirusService.updateLastMonth();
	}

	@Test
	public void updateXav_Scan() {

		XavScanService xavScanService = new XavScanService(logSession);
		xavScanService.updateThisWeek();
		xavScanService.updateLastMonth();
	}

	@Test
	public void updateXav_SysDef() {

		XavSysDefService xavSysDefService = new XavSysDefService(logSession);
		xavSysDefService.updateThisWeek();
		xavSysDefService.updateLastMonth();
	}

	@Test
	public void updateXav_Bota() {

		XavBotaService xavBotaService = new XavBotaService(logSession);
		xavBotaService.updateThisWeek();
		xavBotaService.updateLastMonth();
	}

	@Test
	public void updateCmdState() {

		CmdStateService cmdStateService = new CmdStateService(logSession);
		cmdStateService.updateThisWeek();
		cmdStateService.updateLastMonth();
		cmdStateService.updateState();
		cmdStateService.updateSatePopup();
		cmdStateService.updateThisWeekForCommand();
		cmdStateService.updateLastMonthForCommand();
		cmdStateService.updateSateForCommand();
		cmdStateService.updateSatePopupForCommand();
	}

	@Test
	public void updateRfw_Url() {

		RfwUrlService rfwUrlService = new RfwUrlService(logSession);
		rfwUrlService.updateThisWeek();
		rfwUrlService.updateLastMonth();
	}

	@Test
	public void updateRfw_Ip() {

		RfwIpService rfwIpService = new RfwIpService(logSession);
		rfwIpService.updateThisWeek();
		rfwIpService.updateLastMonth();
	}

	@Test
	public void updateRfw_Brow() {

		RfwBrowService rfwBrowService = new RfwBrowService(logSession);
		rfwBrowService.updateThisWeek();
		rfwBrowService.updateLastMonth();
	}

	@Test
	public void updateRfw_Net() {

		RfwNetService rfwNetService = new RfwNetService(logSession);
		rfwNetService.updateThisWeek();
		rfwNetService.updateLastMonth();
	}

	@Test
	public void updateRfw_Share() {

		RfwShareService rfwShareService = new RfwShareService(logSession);
		rfwShareService.updateThisWeek();
		rfwShareService.updateLastMonth();
	}

	@Test
	public void updateRfw_Terminal() {

		RfwFlowService rfwFlowService = new RfwFlowService(logSession);
		rfwFlowService.updateThisWeek();
		rfwFlowService.updateLastMonth();
	}

	@Test
	public void clearReportWhere() {

		ReportWhereService reportWhereService = new ReportWhereService(logSession);
		reportWhereService.clearWhere("基本报告测试");
		reportWhereService.clearWhere("定时报告测试");
		reportWhereService.clearWhere("综合报告测试");
	}

	@Test
	public void clearReportList() {

		ReportListService reportListService = new ReportListService(logSession);
		reportListService.clearList("基本报告测试");
		reportListService.clearList("定时报告测试");
		reportListService.clearList("综合报告测试");
	}

	@Test
	public void clearHistoryReport() {

		HistoryReportService historyReportService = new HistoryReportService(logSession);
		historyReportService.clearHistory();
	}

	@Test
	public void addAuthToday() {

		AuthTodayLinkService authTodayLinkService = new AuthTodayLinkService(logSession, eid,dataType);
		authTodayLinkService.clear();
		authTodayLinkService.insertDataOne();
		authTodayLinkService.insertDataTwo();
	}

	@Test
	public void addAuthHistory() {

		AuthHistoryService authHistoryService = new AuthHistoryService(logSession, eid,dataType);
		authHistoryService.clear();
		authHistoryService.insertThisWeek();
		authHistoryService.insertLastMonth();
	}

	@Test
	public void updateAndDeleteUser() throws IOException {

		EsmUserService esmUserService = new EsmUserService(managerSession);
		String id = esmUserService.selectUserID();
		esmUserService.updateUser();
		esmUserService.delete();
//		new TestUtil().writeProperties("test-config","adminid",id);
	}

	@Test
	public void updateOrgan() {

		EsmOrganService esmOrganService = new EsmOrganService(managerSession);
		esmOrganService.updateOrgan();
	}

	@Test
	public void updateMail() {

		SendEmailService sendEmailService = new SendEmailService(logSession);
		sendEmailService.clearMail();
		sendEmailService.updateMail();
	}

//	@Test
//	public void insertMongoCustom() {
//
//		MsgcustomizableService msgcustomizableService = new MsgcustomizableService(mongoBase, eid);
//		msgcustomizableService.clear();
//		ids = msgcustomizableService.insert();
//	}

//	@Test
//	public void insertMongoDis() {
//
//		MsgdistributionService msgdistributionService = new MsgdistributionService(mongoBase, eid);
//		msgdistributionService.clear();
//		msgdistributionService.insert(ids);
//	}

	@Test
	public void insertMessage(){

		MessageCenterService messageCenterService = new MessageCenterService(logSession);
		messageCenterService.clearMessage();
		messageCenterService.insertMessage(dataType,eid);
	}

	@Test
	public void updateClient() {

		ClientSetService clientSetService = new ClientSetService(logSession);
		clientSetService.updateSet();
	}

	@Test
	public void updateLogClean() {

		LogCleanService logCleanService = new LogCleanService(logSession);
		logCleanService.updateSet();
	}

//	@Test
//	public void updateAutoGroup() {
//
//		AutoGroupService autoGroupService = new AutoGroupService(logSession);
//		autoGroupService.updateSet();
//	}


	@Test
	public void updateUserSet() {

		UsersSetService usersSetService = new UsersSetService(logSession);
		usersSetService.updateSet();
	}

	@Test
	public void updateWarningSet(){

		WarningSetService warningSetService = new WarningSetService(logSession);
		warningSetService.updateSet();
	}

	@Test
	public void updateWarningLog() {

		WarningLogService warningLogService = new WarningLogService(logSession);
		warningLogService.clear();
		warningLogService.insertOne(dataType);
		warningLogService.insertTwo(dataType);
		warningLogService.insertThree(dataType);
	}

	@Test
	public void upateLeak(){

		LeakScanLogService leakScanLogService = new LeakScanLogService(logSession);
		leakScanLogService.updateThisWeek();
		leakScanLogService.updateLastMonth();
	}


	@AfterClass
	public void tearDown() {

		logSession.commit();
		managerSession.commit();
		logSession.close();
		managerSession.close();
//		mongoBase.destory();
	}

}

