package dataservice.esmmanager;

import org.apache.ibatis.session.SqlSession;

public class EsmUserService {

	SqlSession session;

	public EsmUserService(SqlSession session){
		this.session = session;
	}

	//更新账户
	public void updateUser(){

		session.update("updateUser");
	}

	//删除用户
	public void delete(){

		session.delete("deleteUser");
	}

	//查询admin的id
	public String selectUserID(){

		Object id =  session.selectOne("selectUserID");
		return String.valueOf(id);
	}

}
