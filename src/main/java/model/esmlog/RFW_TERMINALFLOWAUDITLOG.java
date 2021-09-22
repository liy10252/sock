package model.esmlog;

import lombok.Data;

import java.util.Date;

@Data
public class RFW_TERMINALFLOWAUDITLOG {

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
	private Date STARTTIME;
	private Date ENDTIME;
	private Integer UPDATEFLOW;
	private Integer DOWNLOADFLOW;
	private Integer CURUPDATESPEED;
	private Integer CURDOWNLOADSPEED;

}
