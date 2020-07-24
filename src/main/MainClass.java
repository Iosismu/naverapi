package main;

import java.util.ArrayList;

import dao.UserDAOImpl;
import dto.UserDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("네이버 API를 이용한 크롤링");
		
		Methods met = new Methods(); // 유저 정보 입력값 가져오는 메소드
		ArrayList<String> listS = new ArrayList<String>();
		String listI = null;
		UserDAOImpl userDao = new UserDAOImpl();
		UserDTO dto = new UserDTO();
		
		
		listS = met.inputdataS(); // 아이디, 패스워드
		listI = met.inputdataI(); // 전화번호
		
		
		dto.setId(met.remove(listS.get(0))); // 아이디 dto 전달
	
		dto.setEmail(listS.get(0)); // 이메일 dto 전달
	
		dto.setPw(listS.get(1)); // 패스워드 dto 전달
	
		dto.setPnum(met.plus(listI)); //전화번호 dto 전달 
	
		dto.setDate(met.datedate()); // 오늘 날짜 전달
		
		
		userDao.insert(dto); // 값 넣기
		
		System.out.println("이메일: " + listS.get(0));
		System.out.println("패스워드: " + listS.get(1));
		System.out.println("전화번호: " + listI);
		
	}

}
