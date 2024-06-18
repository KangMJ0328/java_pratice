package a0304;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // Alt + shift + o
        // 파일 전체에서 import할 클래스를 모두 찾아서, 자동으로 import 해준다.
        // Ctrl + .
        // 이 단축키는 Quick Fix 단축키입니다.
        // ( 따라서 이 단축키는 자동 import 뿐만 아니라,)
        // 컨텍스트에 따라서 다양한 수정 방법을 제공해 줍니다.)
        System.out.println("X 값입력 : ");
        String strX = scanner.nextLine(); //줄단위로 입력
        int x = Integer.parseInt(strX);

        System.out.println("Y 값입력 : ");
        String strY = scanner.nextLine(); //줄단위로 입력
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: = "+result);
        System.out.println(); //한줄대행

        while(true) {
            System.out.print("입력 문자열");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
        
    }
}
