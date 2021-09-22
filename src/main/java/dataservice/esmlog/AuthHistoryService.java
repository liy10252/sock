package dataservice.esmlog;

import model.esmlog.AUTH_HISTORY_LINKS;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class AuthHistoryService {

	SqlSession session;
	String eid;
	String dataType;

	public AuthHistoryService(SqlSession session,String eid,String dataType){
		this.session = session;
		this.eid = eid;
		this.dataType = dataType;
	}

	public void clear(){

		session.delete("deleteAuth_history");
	}

	//插入本周
	public void insertThisWeek(){

		AUTH_HISTORY_LINKS auth_history_links = new AUTH_HISTORY_LINKS();
		if(dataType.equals("st") || dataType.equalsIgnoreCase("pg") || dataType.equalsIgnoreCase("jc")){
			auth_history_links.setID(2);
		}
		auth_history_links.setEID(eid);
		auth_history_links.setHISTORYDATE(new Date());
		auth_history_links.setAUTHNUM(2);
		auth_history_links.setNOTAUTHNUM(0);
		auth_history_links.setADDTIME(new Date());
		session.insert("addAuth_history",auth_history_links);
	}


	//插入上月
	public void insertLastMonth(){

		AUTH_HISTORY_LINKS auth_history_links = new AUTH_HISTORY_LINKS();
		if(dataType.equals("st") || dataType.equalsIgnoreCase("pg")|| dataType.equalsIgnoreCase("jc")){
			auth_history_links.setID(3);
		}
		auth_history_links.setEID(eid);
		auth_history_links.setHISTORYDATE(TimeUtil.getLastMonthDate());
		auth_history_links.setAUTHNUM(3);
		auth_history_links.setNOTAUTHNUM(0);
		auth_history_links.setADDTIME(TimeUtil.getLastMonthDate());
		session.insert("addAuth_history",auth_history_links);
	}

}
