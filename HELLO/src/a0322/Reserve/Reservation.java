package a0322.Reserve;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccManager manager= new AccManager();

        while (true){
            System.out.println("\n숙소 예약 시스템에 오신 것을 환영합니다.");
            System.out.println("1. 예약 가능한 숙소 보기");
            System.out.println("2. 숙소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.disAvailAccommodations();
                    break;
                case 2:
                    System.out.print("예약하려는 숙소의 이름을 입력하세요: ");
                    sc.nextLine();
                    String accommodationName = sc.nextLine();
                    
                    if(manager.bookedAccommodation(accommodationName)){
                        System.out.println("숙소가 성공적으로 예약 되었습니다.");
                    }else{
                        System.out.println("숙소가 예약 가능하지 않거나 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    manager.disBookedAccommodations();
                    break;
                case 4:
                    System.out.println("숙소 예약 시스템 종료.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}
