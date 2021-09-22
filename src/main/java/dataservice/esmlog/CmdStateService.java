package dataservice.esmlog;

import model.esmlog.CMDISSUEDSTATE;
import org.apache.ibatis.session.SqlSession;
import util.TimeUtil;
import java.util.Date;

public class CmdStateService {

	SqlSession session;

	public CmdStateService(SqlSession session){
		this.session = session;
	}

	//更新时间
	public void updateThisWeek(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("78E4687250D3B445352BEE53B586BD50");
		cmdissuedstate.setEDATE(new Date());
		session.update("updatecmdState",cmdissuedstate);
	}


	//更新时间
	public void updateLastMonth(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("E057179E152D56B6E97A153131F635B2");
		cmdissuedstate.setEDATE(TimeUtil.getLastMonthDate());
		session.update("updatecmdState",cmdissuedstate);
	}

	//更新指定消息的状态
	public void updateState(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("88A469D80CCED1BBCA0918C6300BF0D8");
		cmdissuedstate.setSTATE(0);
		session.update("updatecmdState",cmdissuedstate);
	}

	//更新弹出窗消息的状态
	public void updateSatePopup(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("EC8A5F1134E0A72E7729FC269002A777");
		cmdissuedstate.setSGUID("52AD8BE841E3E32B8CED8D3CDF5DAB1D");
		cmdissuedstate.setSTATE(0);
		session.update("updatecmdStateForPopup",cmdissuedstate);
	}

	//更新命令跟踪弹出框数据的状态
	public void updateSatePopupForCommand(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("88645900316EF7C0D73F8C0B4D2F6242");
		cmdissuedstate.setSGUID("A0337400F42B8803988F6EE1E547BCCC");
		cmdissuedstate.setSTATE(0);
		session.update("updatecmdStateForPopup",cmdissuedstate);

	}

	//更新命令跟踪数据的状态为未完成
	public void updateSateForCommand(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("227A64B39C91BDD3E1B1A6BF3F9E9D7C");
		cmdissuedstate.setSTATE(0);
		session.update("updatecmdState",cmdissuedstate);

	}


	//更新时间
	public void updateThisWeekForCommand(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("7CDE5D48E34D3C523E0D2192B6CF6F86");
		cmdissuedstate.setEDATE(new Date());
		session.update("updatecmdState",cmdissuedstate);
	}


	//更新时间
	public void updateLastMonthForCommand(){

		CMDISSUEDSTATE cmdissuedstate = new CMDISSUEDSTATE();
		cmdissuedstate.setCMDID("4C5EBD3F15FDB3D5C6061099F118A90C");
		cmdissuedstate.setEDATE(TimeUtil.getLastMonthDate());
		session.update("updatecmdState",cmdissuedstate);
	}

}
