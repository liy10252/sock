package dataservice.esmlog;

import model.esmlog.RFW_IPACCESSAUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RfwIpService {

	SqlSession session;

	public RfwIpService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		RFW_IPACCESSAUDITLOG ip = new RFW_IPACCESSAUDITLOG();
		ip.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		ip.setTIME(new Date());
		session.update("updateRfw_Ip",ip);
	}


	//更新时间
	public void updateLastMonth(){

		RFW_IPACCESSAUDITLOG ip = new RFW_IPACCESSAUDITLOG();
		ip.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		ip.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRfw_Ip",ip);
	}
}
