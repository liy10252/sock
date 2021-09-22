package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class ReportListService {

	SqlSession session;

	public ReportListService(SqlSession session){
		this.session = session;
	}

	public void clearList(String name){
		session.delete("deleteReport_List",name);
	}
}
