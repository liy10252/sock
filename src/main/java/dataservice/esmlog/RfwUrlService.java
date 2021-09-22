package dataservice.esmlog;

import model.esmlog.RFW_URLINTERCEPTLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RfwUrlService {

	SqlSession session;

	public RfwUrlService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		RFW_URLINTERCEPTLOG url = new RFW_URLINTERCEPTLOG();
		url.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		url.setTIME(new Date());
		session.update("updateRfw_Url",url);
	}


	//更新时间
	public void updateLastMonth(){

		RFW_URLINTERCEPTLOG url = new RFW_URLINTERCEPTLOG();
		url.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		url.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRfw_Url",url);
	}

}
