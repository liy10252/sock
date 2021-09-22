package model.esmlog;

import lombok.Data;

import java.util.Date;

@Data
public class RFW_IPACCESSAUDITLOG {

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
	private String SRCADDR;
	private Integer SRCPORT;
	private String DSTADDR;
	private Integer DSTPORT;
	private Integer RESULT;
	private Integer REASON;
	private Integer ISOFFLINE;
	private Integer COUNTS;
	private String RULENAME;
}
