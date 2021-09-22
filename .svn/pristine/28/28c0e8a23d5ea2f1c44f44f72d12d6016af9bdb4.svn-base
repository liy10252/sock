package dataservice.esmlog;

import org.apache.ibatis.session.SqlSession;

public class SendEmailService {

	SqlSession session;

	public SendEmailService(SqlSession session){
		this.session = session;
	}

	public void updateMail(){

		session.update("updateMail");
	}

	public void clearMail(){

		session.delete("deleteMail");
	}
}
