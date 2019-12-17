package java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.DeptDto;

public class DeptDao {
	static{
		try {
			// 1.org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//1.singleton pattern
	//single 변수는 static method에서 사용해야 하기때문에 static 변수로
	//설정해야 한다.
	private static DeptDao single;
	//외부에서 객체를 생성할 수 없다.
	private DeptDao() {

	}
	//외부에서 DeptDao 객체를 생성하기 위해서는 getInstance() method를
	//이용해야 한다. 따라서 이 method에서는 DeptDao 객체를 하나만 생성할 수 있게
	//코딩해야 한다. (singleton)
	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}
	
	
	public boolean insert(DeptDto dto){
		boolean isSuccess = false;	
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true",
					"acorn12", 
					"acorn12"); 
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("INSERT INTO dept(deptno,dname,loc) VALUES(?,?,?)");

			pstmt = con.prepareStatement(sql.toString());
			
			
			int index = 0;
			pstmt.setInt(++index, dto.getNo());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());
			
			
			pstmt.executeUpdate(); //INSERT,UPDATE,DELETE문 일때 사용
			isSuccess = true;
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSuccess;
		
	}
	
	
	
	
	public boolean update(DeptDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept SET dname=?, loc=? WHERE deptno=?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());
			pstmt.setInt(++index, dto.getNo());

			pstmt.executeUpdate();
			
			isSuccess = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	public boolean delete(int deptNo){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", 
					"acorn12", //user
					"acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM dept ");
			sql.append("WHERE deptno = ?");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index,deptNo);
			
			pstmt.executeUpdate();
			isSuccess = true;
			
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
		return isSuccess;
	}
	
	
	
	public ArrayList<DeptDto> select(){
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno ");
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery(); 
			
			while(rs.next()){
				int index =0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				list.add(new DeptDto(deptno,dname,loc));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	
	
	public DeptDto select(int deptNo){
		DeptDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("WHERE deptno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, deptNo);
			rs = pstmt.executeQuery(); 
			
			if(rs.next()){
				index =0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				dto = (new DeptDto(deptno,dname,loc));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dto;
	}
	
}
