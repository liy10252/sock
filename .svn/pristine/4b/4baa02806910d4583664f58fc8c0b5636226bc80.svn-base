package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class UsersSetService {

	SqlSession session;

	public UsersSetService(SqlSession session){
		this.session = session;
	}

	public void updateSet(){

		session.update("updateUser_set");
	}
}
