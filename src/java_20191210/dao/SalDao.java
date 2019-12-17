package java_20191210.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.SalDto;

public class SalDao {
	static{
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static SalDao single;
	
	private SalDao(){
		
	}
	
	public static SalDao getInstance(){
		if(single == null){
			single = new SalDao();
		}
		return single;
	}
	
	public boolean insert(SalDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn",
					"acorn12",
					"acorn12");
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("INSERT INTO salgrade(grade,losal,hisal) ");
			sql.append("VALUES(?,?,?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index =0;
			pstmt.setInt(++index, dto.getGrade());
			pstmt.setInt(++index, dto.getLosal());
			pstmt.setInt(++index, dto.getHisal());
			
			pstmt.executeUpdate();
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	public boolean update(SalDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn",
					"acorn12", 
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE salgrade SET losal = ?, hisal = ? WHERE grade = ? ");
			
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, dto.getLosal());
			pstmt.setInt(++index, dto.getHisal());
			pstmt.setInt(++index, dto.getGrade());

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
	
	public boolean delete(int SalGrade){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn", 
					"acorn12",
					"acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM salgrade ");
			sql.append("WHERE grade = ?");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index,SalGrade);
			
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
	
	public ArrayList<SalDto> select(){
		ArrayList<SalDto> list = new ArrayList<SalDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("ORDER BY grade ");
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery(); 
			
			while(rs.next()){
				int index =0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				list.add(new SalDto(grade,losal,hisal));
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
	
	public SalDto select(int SalGrade){
		SalDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("WHERE grade = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, SalGrade);
			rs = pstmt.executeQuery(); 
			
			if(rs.next()){
				index =0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				dto = (new SalDto(grade,losal,hisal));
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
