package demo;

import com.google.gson.JsonArray;
import lombok.extern.log4j.Log4j;
import java.sql.*;
import java.util.*;

@Log4j
public class Demo2 {

	static String url = "jdbc:mysql://193.168.19.131:3306/RS_ESM_MANAGER";
//static String url = "jdbc:mysql://193.168.19.131:3306/RS_ESM_MANAGER";
	static String userName = "root";
	static String password = "Rising_123";
	static String driver = "com.mysql.jdbc.Driver";

	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement pt = null;
		ResultSet set = null;
		List<String> tables = new ArrayList<String>();
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		try {
			pt = connection.createStatement();
			set = pt.executeQuery("select TABLE_NAME from information_schema.tables where table_schema='RS_ESM_MANAGER';");


			while (set.next()) {

				tables.add(set.getString(1));

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		Map<String,List> map = new HashMap<String,List>();

		for (String name : tables) {
//			ResultSet rs = pt.executeQuery("select * from " + name + ";");
			boolean rs = pt.execute("delete  from " + name+";");
//			ResultSetMetaData resultMetaData = rs.getMetaData();
//			int cols = resultMetaData.getColumnCount();
//			List<Vector> tr = new ArrayList<Vector>();
//
//			while (rs.next()) {
//				Vector currentRow = new Vector();
//				for (int j = 1; j < cols+1; j++) {
//
//					if(resultMetaData.getColumnName(j).equals("EID")) {
//						currentRow.addElement("E123456");
//						continue;
//					}
//
//					switch (resultMetaData.getColumnType(j))                     //translate the column of table type to java type then write to vector
//					{
//
//
//						case Types.VARCHAR:
//							currentRow.addElement(rs.getString(resultMetaData.getColumnName(j)));
//							break;
//						case Types.INTEGER:
//							currentRow.addElement(new Integer(rs.getInt(resultMetaData.getColumnName(j))));
//							break;
//						case Types.TIMESTAMP:
//							currentRow.addElement(rs.getDate(resultMetaData.getColumnName(j)));
//							break;
//						case Types.DOUBLE:
//							currentRow.addElement(rs.getDouble(resultMetaData.getColumnName(j)));
//							break;
//						case Types.FLOAT:
//							currentRow.addElement(rs.getFloat(resultMetaData.getColumnName(j)));
//							break;
//						case Types.CLOB:
//							currentRow.addElement(rs.getBlob(resultMetaData.getColumnName(j)));
//							break;
//
//						case Types.DATE:
//							currentRow.addElement(rs.getDate(resultMetaData.getColumnName(j)));
//							break;
//
//						case Types.LONGVARCHAR:
//							currentRow.addElement(rs.getString(resultMetaData.getColumnName(j)));
//							break;
//
//						case Types.BIGINT:
//							currentRow.addElement(new Integer(rs.getInt(resultMetaData.getColumnName(j))));
//							break;
//
//						case Types.SMALLINT:
//							currentRow.addElement(new Integer(rs.getInt(resultMetaData.getColumnName(j))));
//							break;
//
//						case Types.BIT:
//							currentRow.addElement(new Integer(rs.getInt(resultMetaData.getColumnName(j))));
//							break;
//
//						case Types.TINYINT:
//							currentRow.addElement(new Integer(rs.getInt(resultMetaData.getColumnName(j))));
//							break;
//
//						case Types.NULL:
//							currentRow.addElement(null);
//							break;
//
//						case Types.TIME:
//							currentRow.addElement(rs.getTime(resultMetaData.getColumnName(j)));
//							break;
//
//						case Types.LONGVARBINARY:
//							currentRow.addElement(rs.getBlob(resultMetaData.getColumnName(j)));
//							break;
//
//						case Types.CHAR:
//							currentRow.addElement(rs.getString(resultMetaData.getColumnName(j)));
//							break;
//
//						default:
//							currentRow.add("error");
//					}
//
//				}
//				tr.add(currentRow);
//
//			}

//			map.put(name,tr);

		}


//		for(String key : map.keySet()){
//
//			System.out.println("@@@@:"+key);
//
//			List<Vector> list = map.get(key);
//			StringBuffer buffer = new StringBuffer("");
//			int loopCount = 0;
//			buffer.append("InSERT table VALUSES(")
//			for(Vector tr : list){
//			    System.out.println(tr);
//			    if (type = 1) {
//			    	buffer.append((int)tr.get(i));
//				}
//				buffer.append("'");
//				buffer.append((int)tr.get(i)
//				buffer.append("'");
//			    buffer.append("")
//				log.info(tr);
//			}
//			buffer.append(")");
//		}
	}

//	private static class ColumnData {
//		private int columnType;
//		private Vector data;
//
//	}
}