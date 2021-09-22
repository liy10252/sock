package model.esmlog;

import lombok.Data;

import java.util.Date;

@Data
public class XAV_SYSDEF {

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
	private String MACHINENAME;
	private String DESCRIPTION;
	private Integer RESULT;
	private Integer DEFTYPE;
	private String SOURCE;
	private String TARGET;
	private String ACTION;
	private String OLDVALUE;
	private String NEWVALUE;
	private Integer RULEID;
	private Integer RULECLASS;
}
