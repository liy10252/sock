package dataservice.esmlog;

import model.esmlog.RFW_NETPROCAUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RfwNetService {

	SqlSession session;

	public RfwNetService(SqlSession session) {
		this.session = session;
	}

	//更新时间
	public void updateThisWeek() {

		RFW_NETPROCAUDITLOG net = new RFW_NETPROCAUDITLOG();
		net.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		net.setTIME(new Date());
		session.update("updateRfw_Net", net);
	}


	//更新时间
	public void updateLastMonth() {

		RFW_NETPROCAUDITLOG net = new RFW_NETPROCAUDITLOG();
		net.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		net.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRfw_Net", net);
	}
}