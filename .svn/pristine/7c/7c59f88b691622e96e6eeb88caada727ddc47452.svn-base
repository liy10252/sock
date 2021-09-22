package dataservice.esmlog;

import model.esmlog.AUTH_TODAY_LINK;
import org.apache.ibatis.session.SqlSession;
import java.util.Date;

public class AuthTodayLinkService {

	SqlSession session;
	String eid;
	String dataType;

	public AuthTodayLinkService(SqlSession session,String eid,String dataType){
		this.session = session;
		this.eid = eid;
		this.dataType = dataType;
	}

	public void clear(){
		session.delete("deleteToday_link");
	}

	public void insertDataOne(){

		AUTH_TODAY_LINK auth_today_link = new AUTH_TODAY_LINK();
		if(dataType.equals("st") || dataType.equalsIgnoreCase("pg")||
				dataType.equalsIgnoreCase("jc")){
			auth_today_link.setID(2);
		}
		auth_today_link.setEID(eid);
		auth_today_link.setSGUID("2D7631E34999196561CEBA5687972A5B");
		auth_today_link.setLINKTIME(new Date());
		auth_today_link.setLINKSTATUS(1);

		session.insert("addToday_link",auth_today_link);
	}

	public void insertDataTwo(){

		AUTH_TODAY_LINK auth_today_link = new AUTH_TODAY_LINK();
		if(dataType.equals("st")|| dataType.equalsIgnoreCase("pg")||
				dataType.equalsIgnoreCase("jc")){
			auth_today_link.setID(3);
		}
		auth_today_link.setEID(eid);
		auth_today_link.setSGUID("3D7631E34999196561CEBA5687972A5B");
		auth_today_link.setLINKTIME(new Date());
		auth_today_link.setLINKSTATUS(2);

		session.insert("addToday_link",auth_today_link);
	}
}
