package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class LogCleanService {

	SqlSession session;

	public LogCleanService(SqlSession session){
		this.session = session;
	}

	public void updateSet(){
		session.update("updateLog_clean");
	}
}
