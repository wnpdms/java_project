package co.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	static Connection conn;

	static Connection conn() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "proj", "proj");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
