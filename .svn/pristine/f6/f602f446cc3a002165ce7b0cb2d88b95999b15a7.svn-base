package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class ClientSetService {

	SqlSession session;

	public ClientSetService(SqlSession session){
		this.session = session;
	}

	public void updateSet(){
		session.update("updateClient_set");
	}

}
