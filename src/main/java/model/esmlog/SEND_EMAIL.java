package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class SEND_EMAIL {

	private Integer ID;
	private String SENDDOMAIN;
	private String SENDPORT;
	private String SENDEMAIL;
	private String USERNAME;
	private String PASSWD;
	private Date MODIFIEDTIME;
	private Date CREATETIME;
}
