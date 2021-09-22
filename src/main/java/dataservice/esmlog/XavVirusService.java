package dataservice.esmlog;

import model.esmlog.XAV_VIRUS;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class XavVirusService {

	SqlSession session;

	public XavVirusService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		XAV_VIRUS xav_virus = new XAV_VIRUS();
		xav_virus.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		xav_virus.setFINDTIME(new Date());
		session.update("updateXav_Virus",xav_virus);
	}


	//更新时间
	public void updateLastMonth(){

		XAV_VIRUS xav_virus = new XAV_VIRUS();
		xav_virus.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		xav_virus.setFINDTIME(TimeUtil.getLastMonthDate());
		session.update("updateXav_Virus",xav_virus);
	}
}
