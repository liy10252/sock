package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class AUDITLOG {

	private Integer ID;
	private String EID;
	private String USERNAME;
	private String IP;
	private Integer ACTION;
	private String FUNCS;
	private String OBJECTS;
	private String SOURCE;
	private String TARGET;
	private Integer RESULT;
	private String DESCRIPTION;
	private String MEMO;
	private Date TIME;
}
