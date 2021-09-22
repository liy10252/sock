package model.esmlog;

import lombok.Data;

import java.util.Date;

@Data
public class XAV_SCANEVENT {

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
	private Integer TASKID;
	private String TASKNAME;
	private Integer APPID;
	private Date STARTTIME;
	private Integer RUNTIME;
	private Integer STATE;
	private Integer SCANCOUNT;
	private Integer VIRUSCOUNT;
	private Integer TREATEDCOUNT;
	private Integer TOTALFILECOUNT;
	private Integer SCANFILECOUNT;
}
