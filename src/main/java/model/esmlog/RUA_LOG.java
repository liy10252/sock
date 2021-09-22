package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class RUA_LOG {

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
	private Integer FLOWID;
	private Integer SOURCE;
	private Integer ACTION;
	private Integer ROLE;
	private String OLDVER;
	private String NEWVER;
	private Integer NEEDREBOOT;
	private Integer AFTERREBOOT;
	private String INFO;
}
