package model.esmlog;

import lombok.Data;

import java.util.Date;

@Data
public class RFW_NETPROCAUDITLOG {

	private Integer ID;
	private Date INSERTTIME;
	private String EID;
	private String SGUID;
	private String SYSTYPE;
	private Date TIME;
	private Integer EVENTTYPE;
	private Integer EVENTLEVEL;
	private String EVENTSOURCE;
	private Integer CATEGORY;
	private String USERNAME;
	private String DESCRIPTION;
	private String SOFTNAME;
	private Integer SOFTID;
	private String PROCPATH;
	private String COMMANDLINE;
	private Integer ISSYSPROC;
	private String SRCADDR;
	private Integer SRCPORT;
	private String DSTADDR;
	private Integer DSTPORT;
	private Integer ACTION;
	private Integer RESULT;
	private Integer ISOFFLINE;
	private Integer MACHTYPE;
	private Integer COUNTS;
	private String PROCNAME;
}
