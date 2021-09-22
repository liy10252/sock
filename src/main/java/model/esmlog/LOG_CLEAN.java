package model.esmlog;

import lombok.Data;

@Data
public class LOG_CLEAN {

	private String TABLENAME;
	private String CATEGORY;
	private Integer CLEANTYPE;
	private Integer DAYS;
	private Integer NUMS;
}
