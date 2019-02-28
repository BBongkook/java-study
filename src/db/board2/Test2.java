package db.board2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		BoardService2 bs2 = new BoardService2();
		List<BoardInfoVO> biList = bs2.selectBoard();
//		for(BoardInfoVO bl:biList) {
			System.out.println(biList);
//		}
		
	}
}
