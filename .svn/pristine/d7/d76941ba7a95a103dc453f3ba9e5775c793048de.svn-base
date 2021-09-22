package dataservice.esmlog;

import model.esmlog.XAV_SYSDEF;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class XavSysDefService {

	SqlSession session;

	public XavSysDefService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		XAV_SYSDEF xav_sysdef = new XAV_SYSDEF();
		xav_sysdef.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		xav_sysdef.setTIME(new Date());
		session.update("updateXav_SysDef",xav_sysdef);
	}


	//更新时间
	public void updateLastMonth(){

		XAV_SYSDEF xav_sysdef = new XAV_SYSDEF();
		xav_sysdef.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		xav_sysdef.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateXav_SysDef",xav_sysdef);
	}
}
