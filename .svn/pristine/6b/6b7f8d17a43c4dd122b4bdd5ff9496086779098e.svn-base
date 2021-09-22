package dataservice.esmlog;

import model.esmlog.XAV_SCANEVENT;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class XavScanService {

	SqlSession session;

	public XavScanService(SqlSession session){
		this.session = session;
	}
	//更新时间
	public void updateThisWeek(){

		XAV_SCANEVENT xav_scanevent = new XAV_SCANEVENT();
		xav_scanevent.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		xav_scanevent.setSTARTTIME(new Date());
		session.update("updateXav_ScanEvent",xav_scanevent);
	}


	//更新时间
	public void updateLastMonth(){

		XAV_SCANEVENT xav_scanevent = new XAV_SCANEVENT();
		xav_scanevent.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		xav_scanevent.setSTARTTIME(TimeUtil.getLastMonthDate());
		session.update("updateXav_ScanEvent",xav_scanevent);
	}
}