package dataservice.esmlog;

import model.esmlog.AUDITLOG;
import org.apache.ibatis.session.SqlSession;
import util.DatabaseUtil;
import util.TimeUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditLogService {

	public static SqlSession logSession = DatabaseUtil.getSqlSession("log");
	String eid;

	public AuditLogService(String eid){
		this.eid = eid;
	}

	public void clear(){

		logSession.delete("deleteAuditLog");
	}

	public void insert(String dataType){

		List<AUDITLOG> auditlogList = new ArrayList<AUDITLOG>();

		for(int i=0;i<6;i++){

			AUDITLOG auditlog = new AUDITLOG();
			int action = 1;
			int result = 0;
			String funcs = "";
			String des = "登录成功!";
			Date time = new Date();

		    if(i==0){
				funcs = "2001";
				time = TimeUtil.getLastMonthDate();
			}else if(i==1){
				action = 2;
				funcs = "8001";
				time = TimeUtil.getSpecial("2019-03-08 13:11:11");
			}else if(i==2){
				action = 3;
				funcs = "9001";
				result = 1;
			}else if(i==3){
		    	action = 4;
				funcs = "7001";
			}else if(i==4){
				funcs = "3001";
			}else if(i==5){
				funcs = "4001";
			}
			if(dataType.equalsIgnoreCase("st")||dataType.equalsIgnoreCase("pg")){
				auditlog.setID(i+1);
			}
			auditlog.setEID(eid);
			auditlog.setUSERNAME("admin");
			auditlog.setIP("193.168.19.111");
			auditlog.setOBJECTS("admin");
			auditlog.setDESCRIPTION(des);
			auditlog.setMEMO("0");
			auditlog.setACTION(action);
			auditlog.setFUNCS(funcs);
			auditlog.setRESULT(result);
			auditlog.setTIME(time);

			auditlogList.add(auditlog);
		}
		if(dataType.equalsIgnoreCase("st")){
			logSession.insert("insertAuditLogST",auditlogList);
		}else{
			logSession.insert("insertAuditLog",auditlogList);
		}

	}

	public void insertTy(){

		for(int i=0;i<6;i++){

			AUDITLOG auditlog = new AUDITLOG();
			int action = 1;
			int result = 0;
			String funcs = "";
			String des = "登录成功!";
			Date time = new Date();

			if(i==0){
				funcs = "2001";
				time = TimeUtil.getLastMonthDate();
			}else if(i==1){
				action = 2;
				funcs = "8001";
				time = TimeUtil.getSpecial("2019-03-08 13:11:11");
			}else if(i==2){
				action = 3;
				funcs = "9001";
				result = 1;
			}else if(i==3){
				action = 4;
				funcs = "7001";
			}else if(i==4){
				funcs = "3001";
			}else if(i==5){
				funcs = "4001";
			}

			auditlog.setEID(eid);
			auditlog.setUSERNAME("admin");
			auditlog.setIP("193.168.19.111");
			auditlog.setOBJECTS("admin");
			auditlog.setDESCRIPTION(des);
			auditlog.setMEMO("0");
			auditlog.setACTION(action);
			auditlog.setFUNCS(funcs);
			auditlog.setRESULT(result);
			auditlog.setTIME(time);
			logSession.insert("insertAuditLog",auditlog);
		}

	}

	public void insertAuditLog(String dataType){

	    clear();
	    if(dataType.equalsIgnoreCase("ty")){
	    	insertTy();
		}else{
			insert(dataType);
		}
		logSession.commit();
		logSession.close();
	}

}
