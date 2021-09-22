package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class HistoryReportService {

	SqlSession session;

	public HistoryReportService(SqlSession session){
		this.session = session;
	}

	public void clearHistory(){
		session.delete("deleteHistory_report");
	}
}
