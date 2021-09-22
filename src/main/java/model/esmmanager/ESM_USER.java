package model.esmmanager;

import lombok.Data;
import java.util.Date;

@Data
public class ESM_USER {

	private Integer USERID;
	private String EID;
	private String USERNAME;
	private String EMAIL;
	private String PHONENO;
	private String PWD;
	private String SALT;
	private Integer STATUS;
	private Integer LEVEL;
	private Date CREATEDTIME;
	private Date LASTLOGINTIME;
	private Date MODIFIEDTIME;
	private byte[] IMAGEINFO;
	private String LOGINIP;
	private String ACCESSIP;
	private String MANAGEGROUP;
	private String ALIASNAME;
	private Integer LOCKTIME;
	private Integer ERRORCOUNT;
}
