package quiz.c04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String ID = "osfu";
	private static final String PWD = "12345678";
	private static Connection con=null;
	DBCon(){
		
	}
	public static Connection getCon() {
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
	public static void close() {
		if(con!=null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
		System.out.println(con);
	}
	public static void main(String[] args) {
		getCon();
		close();
	}
}
