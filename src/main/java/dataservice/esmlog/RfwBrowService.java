package dataservice.esmlog;

import model.esmlog.RFW_BROWSINGAUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RfwBrowService {

	SqlSession session;

	public RfwBrowService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		RFW_BROWSINGAUDITLOG brow = new RFW_BROWSINGAUDITLOG();
		brow.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		brow.setTIME(new Date());
		session.update("updateRfw_Brow",brow);
	}


	//更新时间
	public void updateLastMonth(){

		RFW_BROWSINGAUDITLOG brow = new RFW_BROWSINGAUDITLOG();
		brow.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		brow.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRfw_Brow",brow);
	}
}
