package dataservice.esmmanager;

import model.esmmanager.ESM_ORGANIZATION;
import org.apache.ibatis.session.SqlSession;

public class EsmOrganService {

	SqlSession session;

	public EsmOrganService(SqlSession session){
		this.session = session;
	}

	public void updateOrgan(){

		ESM_ORGANIZATION esm_organization = new ESM_ORGANIZATION();
		esm_organization.setTITLE("瑞星ESM下一代网络版");
		esm_organization.setSUBTITLE("test");
		session.update("updateCompany",esm_organization);
	}
}
