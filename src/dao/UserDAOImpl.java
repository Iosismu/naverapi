package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DB;

import dto.UserDTO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO{

	@Override
	public void insert(UserDTO dto) {
	
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	 try{	            
		 	conn = DB.conn();
			String sql = "INSERT INTO user (id, pw, email, pnum, date) VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 4. 데이터 binding
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getPnum());
			pstmt.setString(5, dto.getDate());
			
			
            int count = pstmt.executeUpdate();
            if( count == 0 ){
                System.out.println("데이터 입력 실패");
            }
            else{
                System.out.println("데이터 입력 성공");
            }
            
            if( conn != null && !conn.isClosed()){
                conn.close();
            }
            if( pstmt != null && !pstmt.isClosed()){
                pstmt.close();
            }   
         
	 }	        
    catch(Exception e){
         System.out.println("에러: " + e);
        }
    finally{
          try{
              if( conn != null && !conn.isClosed()){
                  conn.close();
              }
          }
          catch(Exception e){
              e.printStackTrace();
          }
    	}           
	}
}
