package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {


	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		// 오라클 기본접속 문자열 // 오라클 thin 사용해서 // 포트번호 // SID
		String id = "osfu";
		String pwd ="12345678";
		
		//DriverManager.getConnection(url,id,pwd); 먼저 치고난 후
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement(); // 쿼리화면 띄우기
			String sql = "select * from board";		// 쿼리 작성
			ResultSet rs = stmt.executeQuery(sql);	// 쿼리 실행해줄 애만 받아오기
			while(rs.next()) {			// next 했을때 다음 데이터가 있으면 true
				System.out.println(rs.getString("TITLE")); // 없으면 return false
			}											   // while 문 종료
			System.out.println("연결성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // 시도했을때 어떤 오류인지 출력 해준다.
		}
	}
}
