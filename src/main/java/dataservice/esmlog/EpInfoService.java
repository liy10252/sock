package dataservice.esmlog;

import model.esmlog.EPINFO;
import org.apache.ibatis.session.SqlSession;

public class EpInfoService {

	SqlSession session;

	public EpInfoService(SqlSession session){
		this.session = session;
	}


	//更新epinfo的组信息
	public void updateEpinfoGroup(){

		EPINFO client = new EPINFO();
		client.setSGUID("4AEFCBB17C93339AE44D7E624C59FA96");
		client.setGROUPID(79);
		client.setGROUPNAME("默认分组");
		session.update("updateEpinfo",client);
	}

	//更新epinfo的备注
	public void updateEpinfoMemo(){

		EPINFO client = new EPINFO();
		client.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		client.setMEMO(null);
		session.update("updateEpinfo",client);
	}

}
