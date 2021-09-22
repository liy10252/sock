package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class GROUPINFO {

	private String EID;
	private Integer ID;
	private String GROUPNAME;
	private String DESCRIPTION;
	private Date EDATE;
	private Integer TYPE;
}
