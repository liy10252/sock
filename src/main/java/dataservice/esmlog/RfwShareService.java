package dataservice.esmlog;

import model.esmlog.RFW_SHAREDRESACCESSAUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RfwShareService {

	SqlSession session;

	public RfwShareService(SqlSession session) {
		this.session = session;
	}

	//更新时间
	public void updateThisWeek() {

		RFW_SHAREDRESACCESSAUDITLOG share = new RFW_SHAREDRESACCESSAUDITLOG();
		share.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		share.setTIME(new Date());
		session.update("updateRfw_Share", share);
	}


	//更新时间
	public void updateLastMonth() {

		RFW_SHAREDRESACCESSAUDITLOG share = new RFW_SHAREDRESACCESSAUDITLOG();
		share.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		share.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRfw_Share", share);
	}
}
