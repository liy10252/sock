package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class USERS_SET {

	private Integer ID;
	private Integer TIMEOUT;
	private Integer FAILNUM;
	private Integer TIME;
	private Integer ISMANUAL;
	private Date CREATETIME;
	private Date UPDATETIME;
}
