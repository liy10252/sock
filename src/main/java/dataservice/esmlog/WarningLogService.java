package dataservice.esmlog;

import model.esmlog.WARNINGLOG;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class WarningLogService {

	SqlSession session;

	public WarningLogService(SqlSession session) {
		this.session = session;
	}

	public void clear() {

		session.delete("deleteWarningLog");
	}

	public void insertOne(String dataType) {

		WARNINGLOG log = new WARNINGLOG();
		if(dataType.equalsIgnoreCase("st") || dataType.equalsIgnoreCase("pg") || dataType.equalsIgnoreCase("jc")){
			log.setLOGID(1);
		}
		log.setWSID(1);
		log.setCAPTION("病毒传染名称");
		log.setCONTENT("{\"msg\":\"病毒传染内容\"}");
		log.setEDATE(new Date());

		session.insert("insertWarningLog", log);
	}

	public void insertTwo(String dataType){

		WARNINGLOG log = new WARNINGLOG();
		if(dataType.equalsIgnoreCase("st") || dataType.equalsIgnoreCase("pg") || dataType.equalsIgnoreCase("jc")){
			log.setLOGID(2);
		}
		log.setWSID(2);
		log.setCAPTION("病毒爆发名称");
		log.setCONTENT("{\"msg\":\"病毒爆发内容\"}");
		log.setEDATE(TimeUtil.getLastMonthDate());
		session.insert("insertWarningLog", log);
	}

	public void insertThree(String dataType){

		WARNINGLOG log = new WARNINGLOG();
		if(dataType.equalsIgnoreCase("st") || dataType.equalsIgnoreCase("pg") || dataType.equalsIgnoreCase("jc")){
			log.setLOGID(3);
		}
		log.setWSID(3);
		log.setCAPTION("清理失败预警名称");
		log.setCONTENT("{\"msg\":\"清理失败预警内容\"}");
		log.setEDATE(TimeUtil.getSpecial("2019-05-08 12:00:00"));
		session.insert("insertWarningLog", log);
	}
}
