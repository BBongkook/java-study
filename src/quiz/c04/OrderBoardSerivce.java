package quiz.c04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import quiz.c04.DBCon;

public class OrderBoardSerivce {
	
	public List<OrderBoardVO> selectBoard(OrderBoardVO obvo){
		String sql = "select * from order_board where 1=1";
		if(obvo.getBuyer()!=null) {
			sql += "  and buyer=?";
		}
		if(obvo.getReqName()!=null) {
			sql += "  and reqName=?";
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if(obvo.getBuyer()!=null) {
				ps.setString(1, obvo.getBuyer());
			}
			if(obvo.getReqName()!=null) {
				ps.setString(1, obvo.getReqName());
			}
			ResultSet rs = ps.executeQuery();
			List<OrderBoardVO> obrList = new ArrayList<>();
			while(rs.next()) {
				OrderBoardVO obr = new OrderBoardVO();
				obr.setOrderNum(rs.getInt("ordernum"));
				obr.setBuyer(rs.getString("buyer"));
				obr.setBuyAdr(rs.getString("buyadr"));
				obr.setReqName(rs.getString("reqname"));
				obr.setReqCnt(rs.getInt("reqcnt"));
				obr.setReqDat(rs.getString("reqdat"));
				obr.setReqTim(rs.getString("reqtim"));
				obrList.add(obr);
			}
			return obrList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return null;
	}
}
