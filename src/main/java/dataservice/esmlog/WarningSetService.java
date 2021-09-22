package dataservice.esmlog;

import model.esmlog.WARNINGSETTING;
import org.apache.ibatis.session.SqlSession;

public class WarningSetService {

	SqlSession session;

	public WarningSetService(SqlSession session){
		this.session = session;
	}

	public void updateSet(){

		WARNINGSETTING warningsetting = new WARNINGSETTING();
		warningsetting.setWSNAME("病毒传染预警");
		warningsetting.setENABLE(1);
		session.update("updateWarningSet",warningsetting);
	}
}
