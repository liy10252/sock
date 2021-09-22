package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class RLS_LEAKSCANLOG {

	private Integer ID;
	private Date INSERTTIME;
	private Integer EVENTTYPE;
	private Integer EVENTLEVEL;
	private String EVENTSOURCE;
	private Integer CATEGORY;
	private String USERNAME;
	private String SGUID;
	private String DESCRIPTION;
	private Integer UNIQUEVALUE;
	private Date GETTIME;
	private Date ISSUETIME;
	private String ADDR;
	private String ADDRMD5;
	private String INTRODUCTION;
	private Integer LANGUAGE;
	private String OS;
	private String PROID;
	private String PRORESID;
	private Integer SECLEVEL;
	private Integer RLSSIZE;
	private Integer RLSSTATE;
	private Integer RLSTYPE;
	private String UPDATENAME;
	private Integer LOTNUM;
	private String EID;
}
