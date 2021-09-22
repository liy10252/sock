package dataservice.esmlog;

import model.esmlog.AUTOGROUP;
import org.apache.ibatis.session.SqlSession;

public class AutoGroupService {

	SqlSession session;

	public AutoGroupService(SqlSession session){
		this.session = session;
	}

	public void updateSet(){

		AUTOGROUP autogroup = new AUTOGROUP();
		autogroup.setRULES_JSON("[{\"groupid\":57,\"rule\":[{\"type\":\"os\",\"symbol\":\"has\",\"value\":\"server\"}]}," +
				"{\"groupid\":57,\"rule\":[{\"type\":\"os\",\"symbol\":\"has\",\"value\":\"linux\"}]}]");

		session.update("updateGroupSet",autogroup);

	}
}
