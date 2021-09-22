package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class RFW_SHAREDRESACCESSAUDITLOG {

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
	private String NAME;
	private String PATH;
	private Integer SHAREMODE;
	private String REMOTEIP;
	private Integer ACTION;
	private String PATHEX;
}
