package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driverload Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", //url
					"acorn12", //user
					"acorn12");
			System.out.println("Database connection Success");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept SET dname=?, loc=? WHERE deptno=?");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, "MINING");
			pstmt.setString(2, "SILICON");
			pstmt.setInt(3,60);
			
			int result = pstmt.executeUpdate();
			System.out.println(" 변경된 행의 수 : "+result);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
