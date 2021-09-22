package util;

import org.apache.ibatis.session.SqlSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class DatabaseGCUtil {

	public static SqlSession logSession = DatabaseUtil.getSqlSession("log");
	public static SqlSession managerSession = DatabaseUtil.getSqlSession("manager");
	protected static ResourceBundle bundle = ResourceBundle.getBundle("test-config", Locale.CHINA);
	static String dataType = bundle.getString("DatabaseType");
	static String eid = bundle.getString("eid").toUpperCase();

	public static List getLogTables(){

		List tables;

		tables = logSession.selectList("logtables");

		return tables;
	}

	public static List getManagerTables(){

		List tables;

		tables = managerSession.selectList("managertables");

		return tables;
	}

	public static void deleteLogTable() throws SQLException {

		List tables = getLogTables();
		for(int i=0;i<tables.size();i++){

			if(dataType.equals("ty")){
				logSession.getConnection().createStatement().execute("delete from RS_ESM_LOG:"+tables.get(i).toString()+";");
			}else if(dataType.equalsIgnoreCase("jc")){
				logSession.getConnection().createStatement().execute("delete from "+tables.get(i).toString()+";");
			}else{
				logSession.getConnection().createStatement().execute("delete from RS_ESM_LOG."+tables.get(i).toString()+";");

			}

		}
	}

	public static void changeTableName() throws SQLException {

		List tables = getLogTables();
		for(int i=0; i<tables.size(); i++){
			String name = tables.get(i).toString();
			String eName = name.split("B0E501F871146298")[0];

			if(!name.equalsIgnoreCase("history_store")){
				logSession.getConnection().createStatement().execute("ALTER TABLE "+name+" RENAME TO "+eName+""+eid+";");
			}
		}
	}


	public static void deleteManagerTable() throws SQLException {

		List tables = getManagerTables();
		for(int i=0;i<tables.size();i++){

			if(dataType.equals("ty")){
				managerSession.getConnection().createStatement().execute("delete from RS_ESM_MANAGER:"+tables.get(i).toString()+";");
			}else if (dataType.equalsIgnoreCase("jc")){
				managerSession.getConnection().createStatement().execute("delete from "+tables.get(i).toString()+";");
			}else{
				managerSession.getConnection().createStatement().execute("delete from RS_ESM_MANAGER."+tables.get(i).toString()+";");
			}

		}
	}

	public static void updateLog() throws SQLException {

		List tables = getLogTables();
		ResultSet columns = null;
		for(int i=0;i<tables.size();i++){
			if(dataType.equals("ty")){
				columns = logSession.getConnection().createStatement().executeQuery("select colname from syscolumns c, (select tabid from rs_esm_log:systables where tabid>99 and tabtype='T' and upper(tabname)=upper('"+tables.get(i).toString()+"')) d where c.tabid = d.tabid ;");
			}else if(dataType.equalsIgnoreCase("jc") || dataType.equalsIgnoreCase("pg")){
				columns = logSession.getConnection().createStatement().executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE table_name='"+tables.get(i).toString()+"';");
			}else{
				 columns = logSession.getConnection().createStatement().executeQuery("select COLUMN_NAME from all_tab_columns where Table_Name='"+tables.get(i).toString()+"' AND OWNER='RS_ESM_LOG';");
			}

			while (columns.next()){
					if(columns.getString(1).equalsIgnoreCase("EID")) {
						if (dataType.equals("ty")) {

							logSession.getConnection().createStatement().executeUpdate("update RS_ESM_LOG:" + tables.get(i).toString() + " set EID = '" + eid + "';");
						} else if (dataType.equalsIgnoreCase("jc")) {
							logSession.getConnection().createStatement().executeUpdate("update " + tables.get(i).toString() + " set EID = '" + eid + "';");
						}else if(dataType.equalsIgnoreCase("pg")){
							logSession.getConnection().createStatement().executeUpdate("update " + tables.get(i).toString() + " set eid = '" + eid + "';");
						}else{
							logSession.getConnection().createStatement().executeUpdate("update RS_ESM_LOG."+tables.get(i).toString()+" set EID = '"+eid+"';");
						}
						break;
					}

			}

		}
	}

	public static void updateManager() throws SQLException {

		List tables = getManagerTables();
		ResultSet columns = null;
		for(int i=0;i<tables.size();i++){
			if(dataType.equals("ty")){
				columns = managerSession.getConnection().createStatement().executeQuery("select colname from syscolumns c, (select tabid from rs_esm_manager:systables where tabid>99 and tabtype='T' and upper(tabname)=upper('"+tables.get(i).toString()+"')) d where c.tabid = d.tabid ;");
			}else if(dataType.equalsIgnoreCase("jc")|| dataType.equalsIgnoreCase("pg")){
				columns = managerSession.getConnection().createStatement().executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE table_name='"+tables.get(i).toString()+"';");
			}else{
				columns = managerSession.getConnection().createStatement().executeQuery("select COLUMN_NAME from all_tab_columns where Table_Name='"+tables.get(i).toString()+"' AND OWNER='RS_ESM_MANAGER';");
			}

			while (columns.next()){
				if(columns.getString(1).equalsIgnoreCase("EID")){
					if(dataType.equals("ty")){
						managerSession.getConnection().createStatement().executeUpdate("update RS_ESM_MANAGER:"+tables.get(i).toString()+" set EID = '"+eid+"';");
					}else if(dataType.equalsIgnoreCase("jc")) {
						managerSession.getConnection().createStatement().executeUpdate("update " + tables.get(i).toString() + " set EID = '" + eid + "';");

					}else if(dataType.equalsIgnoreCase("pg")){

						managerSession.getConnection().createStatement().executeUpdate("update " + tables.get(i).toString() + " set eid = '" + eid + "';");
					}else{
						managerSession.getConnection().createStatement().executeUpdate("update RS_ESM_MANAGER."+tables.get(i).toString()+" set EID = '"+eid+"';");
					}

					break;
				}
			}
		}
	}

	public static void main(String[] args) throws SQLException {

//			deleteLogTable();
//			deleteManagerTable();

		    updateLog();
		    updateManager();

//		    changeTableName();


		    logSession.getConnection().commit();
		    managerSession.getConnection().commit();
		    logSession.close();
		    managerSession.close();
	}
}
