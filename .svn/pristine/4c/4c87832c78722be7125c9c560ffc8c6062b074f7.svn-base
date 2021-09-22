package dataservice.esmlog;

import model.esmlog.RLS_LEAKSCANLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class LeakScanLogService {

	SqlSession session;

	public LeakScanLogService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek() {

		RLS_LEAKSCANLOG leak = new RLS_LEAKSCANLOG();
		leak.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		leak.setINSERTTIME(new Date());
		session.update("updateLeakScanLog", leak);
	}


	//更新时间
	public void updateLastMonth() {

		RLS_LEAKSCANLOG leak = new RLS_LEAKSCANLOG();
		leak.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		leak.setINSERTTIME(TimeUtil.getLastMonthDate());
		session.update("updateLeakScanLog", leak);
	}

}
