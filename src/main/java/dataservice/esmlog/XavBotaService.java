package dataservice.esmlog;

import model.esmlog.XAV_BOTAUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class XavBotaService {

	SqlSession session;

	public XavBotaService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		XAV_BOTAUDITLOG xav_botauditlog = new XAV_BOTAUDITLOG();
		xav_botauditlog.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		xav_botauditlog.setTIME(new Date());
		session.update("updateXav_Botauditlog",xav_botauditlog);
	}


	//更新时间
	public void updateLastMonth(){

		XAV_BOTAUDITLOG xav_botauditlog = new XAV_BOTAUDITLOG();
		xav_botauditlog.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		xav_botauditlog.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateXav_Botauditlog",xav_botauditlog);
	}
}
