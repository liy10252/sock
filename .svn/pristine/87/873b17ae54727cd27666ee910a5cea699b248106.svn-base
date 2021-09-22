package dataservice.esmlog;

import model.esmlog.RFW_TERMINALFLOWAUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RfwFlowService {

	SqlSession session;

	public RfwFlowService(SqlSession session) {
		this.session = session;
	}

	//更新时间
	public void updateThisWeek() {

		RFW_TERMINALFLOWAUDITLOG flow = new RFW_TERMINALFLOWAUDITLOG();
		flow.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		flow.setTIME(new Date());
		session.update("updateRfw_Flow", flow);
	}


	//更新时间
	public void updateLastMonth() {

		RFW_TERMINALFLOWAUDITLOG flow = new RFW_TERMINALFLOWAUDITLOG();
		flow.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		flow.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRfw_Flow", flow);
	}
}

