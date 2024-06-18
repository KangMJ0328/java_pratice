package a0307;

import java.util.Scanner;

public class N_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 입력: "); //9703281622720
        String num =sc.next();
        System.out.print("현재년도 4자리 입력: ");
        String year = sc.next();
        String age ;
        // System.out.println(num.substring(6, 7));
        if(num.substring(6, 7).equals("1")|| num.substring(6, 7).equals("2")){
            age = "19"+ num.substring(0, 2);
            int result1 = Integer.parseInt(age);
            int result2 = Integer.parseInt(year);
            int result3 = result2-result1;
            System.out.println(result3);
        }else{
            System.out.println("why");
        }


    }
    
}
