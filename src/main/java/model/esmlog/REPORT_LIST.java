package model.esmlog;

import lombok.Data;
import java.util.Date;

@Data
public class REPORT_LIST {

	private Integer ID;
	private String REPORTNAME;
	private Integer CYCLEID;
	private Integer REPORTCLASSIFY;
	private String CREATEUSER;
	private Date MODIFIEDTIME;
	private Date CREATETIME;
}
