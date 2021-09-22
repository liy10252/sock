package util;

import lombok.extern.log4j.Log4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
import java.util.Locale;
import java.util.ResourceBundle;

@Log4j
public class DatabaseUtil {

	static ResourceBundle bundle = ResourceBundle.getBundle("test-config", Locale.CHINA);
	static String dataFile;

	static {

		String s = bundle.getString("DatabaseType");
		if ("mysql".equalsIgnoreCase(s)) {
			dataFile = "databaseConfig-mysql.xml";

		} else if ("dm".equalsIgnoreCase(s)) {
			dataFile = "databaseConfig-dm.xml";

		} else if ("st".equalsIgnoreCase(s)) {
			dataFile = "databaseConfig-st.xml";

		} else if ("ty".equalsIgnoreCase(s)){
			dataFile = "databaseConfig-ty.xml";
		}else if("jc".equalsIgnoreCase(s)){
			dataFile = "databaseConfig-jc.xml";
		}else if("pg".equalsIgnoreCase(s)){
			dataFile = "databaseConfig-pg.xml";
		}
	}


	public static SqlSession getSqlSession(String dataSource) {
		//获取配置的资源文件
		Reader reader = null;

		try {
			reader = Resources.getResourceAsReader("dbconfig/"+dataFile);
		} catch (IOException e) {
			log.info("数据库连接出错");
			e.printStackTrace();
		}

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader, dataSource);

		//sqlSession就是能够执行配置文件中的sql语句
		SqlSession sqlSession = factory.openSession();
		return sqlSession;

	}
}
