package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class GroupInfoService {


	SqlSession session;

	public GroupInfoService(SqlSession session){
		this.session = session;
	}

	//清除组
	public void clearGroup(String groupName){
		session.delete("deleteGroupByName",groupName);
	}

}
