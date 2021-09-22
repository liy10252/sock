package util;

import java.util.Locale;
import java.util.ResourceBundle;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoBase {

	public static ResourceBundle bundle = ResourceBundle.getBundle("test-config", Locale.CHINA);
	public static String ip = bundle.getString("mongo.ip");
	public static Integer port = Integer.valueOf(bundle.getString("mongo.port"));
	public static String dbname = bundle.getString("mongo.dbname");
	public static MongoClient mongoClient;
	public static MongoDatabase mongoDatabase;


	static{

		mongoClient = new MongoClient(ip,port);
		mongoDatabase = mongoClient.getDatabase(dbname);
	}

	public MongoCollection<Document> getCollection(String colName) {

		return mongoDatabase.getCollection(colName);
	}

	public void destory() {

		if (mongoClient != null) {

			mongoClient.close();
		}

		mongoDatabase = null;
		System.gc();

	}

}
