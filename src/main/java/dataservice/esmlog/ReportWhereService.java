package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class ReportWhereService {

	SqlSession session;

	public ReportWhereService(SqlSession session){
		this.session = session;
	}

	public void clearWhere(String name){
		session.delete("deleteReport_where",name);
	}
}
