package dataservice.esmlog;

import model.esmlog.RUA_LOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class RuaLogService {

	SqlSession session;

	public RuaLogService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		RUA_LOG rua = new RUA_LOG();
		rua.setSGUID("AEDBC67794C8FAE1BD1AF02133961CED");
		rua.setTIME(new Date());
		session.update("updateRuaLog",rua);
	}


	//更新时间
	public void updateLastMonth(){

		RUA_LOG rua = new RUA_LOG();
		rua.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		rua.setTIME(TimeUtil.getLastMonthDate());
		session.update("updateRuaLog",rua);
	}

}
