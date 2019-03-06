package quiz.c04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		
		System.out.println("아이디를 입력하세요 : ");
		String id = scan.nextLine();
		if("osfu".equals(id)) {
			System.out.print("비밀번호를 입력하세요 : ");
			String pwd = scan.nextLine();
			if("12345678".equals(pwd)) {
				System.out.println("환영 합니다.");
				System.out.println("1.입력");
				System.out.println("2.조회");
				System.out.println("3.수정");
				System.out.println("4.삭제");
				System.out.println("q.종료");
				cmd = scan.nextLine();
				if("1".equals(cmd)) {
					
				}
				if("2".equals(cmd)) {
					List<OrderBoardVO> obList = new ArrayList<>();
					OrderBoardVO obvo = new OrderBoardVO();
					System.out.println("1. 구매자 검색");
					System.out.println("2. 품목 검색");
					String sel = scan.nextLine();
					if("1".equals(sel)) {
						OrderBoardSerivce obs = new OrderBoardSerivce();
						System.out.println("입력해 주세요 : ");
						String strBuyer = scan.nextLine();
						obvo.setBuyer(strBuyer);
						//obList.add(obvo);
						obList = obs.selectBoard(obvo);
						System.out.println(obList);
					}
					if("2".equals(sel)) {
						OrderBoardSerivce obs = new OrderBoardSerivce();
						System.out.println("입력해 주세요 : ");
						String reqName = scan.nextLine();
						obvo.setReqName(reqName);
						//obList.add(obvo);
						obList = obs.selectBoard(obvo);
						System.out.println(obList);
					}
				}
				if("3".equals(cmd)) {
					
				}
				if("4".equals(cmd)) {
					OrderBoardSerivce obs = new OrderBoardSerivce();
					System.out.print("삭제할 주문번호 : ");
					int orderNum = scan.nextInt();
					obs.deleteBoard(orderNum);
				}
				if("q".equals(cmd)) {
					
				}
			}
		}
	}
}
