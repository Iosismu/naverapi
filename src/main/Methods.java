package main;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Methods {
	
	// 유저 아이디, 패스워드
	public ArrayList<String> inputdataS() {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일을 입력해 주세요: ");
		String email = scan.next();
		System.out.print("패스워드 입력해 주세요: ");
		String pw = scan.next();
		
		list.add(email);
		list.add(pw);
			
		return list;
	}
	
	// 유저 전화 번호
	public String inputdataI(){
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("전화 번호 입력(숫자만, 이상한 번호면 번호 바꾸고 하세요.): ");
			String pnum = scan.next();
			
			return pnum;
	}
	
	// 유저 전화번호 사이 "-" 추가 메소드 (구글 복붙)
	public static String plus(String pnum) {
			    if (pnum == null) {
			      return "";
			    }
			    if (pnum.length() == 8) {
			      return pnum.replaceFirst("^([0-9]{4})([0-9]{4})$", "$1-$2");
			    } else if (pnum.length() == 12) {
			      return pnum.replaceFirst("(^[0-9]{4})([0-9]{4})([0-9]{4})$", "$1-$2-$3");
			    }
			    return pnum.replaceFirst("(^02|[0-9]{3})([0-9]{3,4})([0-9]{4})$", "$1-$2-$3");
	}
	
	// 이메일 @밑으로 짜르기 메소드 (구글 복붙)
	public static String remove(String email) {
		 int idx = email.indexOf("@");   
	     String mail1 = email.substring(0, idx);
	     return mail1;
	}
	
	// 오늘 날짜 메소드 (구글 복붙)
	public static String datedate() {
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
			
		Calendar time = Calendar.getInstance();
		       
		String format_time1 = format1.format(time.getTime());
		
		return format_time1;
	}
}

