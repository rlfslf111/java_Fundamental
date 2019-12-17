package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driveload success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {//2.데이터 베이스 연결을 시도한다.
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", //url
					"acorn12", //user
					"acorn12"); //password
			
			System.out.println("Database connect success");
			
			StringBuffer sql = new StringBuffer();
			//바인딩 변수 ?는 VALUES에만 사용할 수 있듬
			sql.append("INSERT INTO dept(deptno,dname,loc) VALUES(?,?,?)");
			//3.SQL문을 전송할 수 있는 preparedStatement 객체를 생성한다.
			pstmt = con.prepareStatement(sql.toString());
			
			//4.바인딩 변수(?)를 설정한다.
			pstmt.setInt(1, 60);
			pstmt.setString(2, "ANALYSIS");
			pstmt.setString(3, "LA");
			
			//5. SQL문을 전송한다.
			int result = pstmt.executeUpdate(); //INSERT,UPDATE,DELETE문 일때 사용
			
			System.out.println("갱신된 행의 수 : "+result);
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
