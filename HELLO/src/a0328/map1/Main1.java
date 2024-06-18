package a0328.map1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        HumanDao  humanDao = new HumanDao();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. 선수 추가하기");
			System.out.println("2. 삭제 하기");
			System.out.println("3. 검색 하기");
			System.out.println("4. 수정 하기");
			System.out.println("5. 선수들 전체 조회 하기");
			System.out.println("6. 선수들 방어율 / 타율 높은 순위 조회 하기");

            int choice = scanner.nextInt();
			if(choice == 1) {
				humanDao.insert();
			} else if (choice == 2) {
				humanDao.delete();
			} else if (choice == 3) {
				humanDao.select();
			} else if (choice == 4) {
				humanDao.update();
			} else if (choice == 5) {
				humanDao.printAll();
			} else if (choice == 6) {
				humanDao.sort();
			}
        }

    }
}
