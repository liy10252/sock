package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class EPINFO {

	private String EID;
	private String SGUID;
	private String OS;
	private String USERNAME;
	private String TOTALMEMORY;
	private Integer ISVM;
	private String CPUARCHITECTURE;
	private String MAC;
	private String COMPUTERNAME;
	private String SYSTEMDIRECTORY;
	private String VERSION;
	private String IP;
	private String GUID;
	private String SYSTYPE;
	private Integer ONLINESTATE;
	private Integer UNSET;
	private String RIP;
	private Date EDATE;
	private String MEMO;
	private String PRODUCTINFO;
	private Integer GROUPID;
	private String GROUPNAME;
	private String JOINGROUPDATE;
	private String CSTAMP;
	private String PSTAMP;
	private Date CREATETIME;

}
