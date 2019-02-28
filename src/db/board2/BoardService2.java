package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class BoardService2 {

	public List<BoardInfoVO> selectBoard(){
		String sql = "select * from board_info";
		Connection con = DBCon.getCon();
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			List<BoardInfoVO> biList = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				biList.add(bi);
			}
			return biList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		System.out.println(con);
		return null;
		
	}
}
