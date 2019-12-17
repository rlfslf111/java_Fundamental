package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {

	public static void main(String[] args) {
		//1.DriverLode 한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//2.Database Connect
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", 
					"acorn12", //user
					"acorn12");
			
			//3.PreparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM dept ");
			sql.append("WHERE deptno = ?");
			pstmt = con.prepareStatement(sql.toString());
			
			//4.바인딩 변수를 설정한다.
			pstmt.setInt(1, 60);
			
			//5.sql 문을 데이터 베이스에 전송한다.
			int result = pstmt.executeUpdate();
			System.out.println("삭제된 행의 수 : "+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
