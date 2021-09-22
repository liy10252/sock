//package dataservice.esmmongo;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.client.MongoCollection;
//import org.bson.Document;
//import org.bson.types.ObjectId;
//import util.MongoBase;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MsgcustomizableService {
//
//	MongoBase mongoBase;
//    String colName = "msgcustomizable";
//    String eid;
//
//	public MsgcustomizableService(MongoBase mongoBase,String eid){
//		this.mongoBase = mongoBase;
//		this.eid = eid;
//	}
//
//	public void clear(){
//		MongoCollection<Document> collection = mongoBase.getCollection(colName);
//		collection.deleteMany(new BasicDBObject());
//	}
//
//	public List<ObjectId> insert(){
//
//		MongoCollection<Document> collection = mongoBase.getCollection(colName);
//		List<Document> documents = new ArrayList<Document>();
//		List type = new ArrayList();
//		List<ObjectId> ids = new ArrayList<ObjectId>();
//		type.add("b:"+eid+":rp");
//		for(int i=0;i<3;i++){
//			Document document = new Document();
//			ObjectId id = new ObjectId();
//			document.put("_id",id);
//			document.put("noeid",true);
//			document.put("isdel",0);
//			document.put("candel",0);
//			document.put("outtime",1589529327);
//			document.put("types",type);
//			document.put("msgtitle","报表生成");
//			document.put("msgcontext","基本报告测试的报表已生成成功!");
//			documents.add(document);
//			ids.add(id);
//		}
//		collection.insertMany(documents);
//		return ids;
//	}
//}
