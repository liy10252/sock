package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class WARNINGSETTING {

	private Integer WSID;
	private String WSNAME;
	private String MEMO;
	private String USERNAME;
	private Integer ENABLE;
	private Integer LEVEL;
	private String TARGET;
	private String NOTIFY;
	private String WSCLASS;
	private String FILTER;
	private String WSTEMPLATE;
	private Date EDATE;
}
