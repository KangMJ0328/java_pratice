package a0306;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 몇시 :");
        int hour = sc.nextInt();
        System.out.println(" 몇분 :");
        int miniute = sc.nextInt();
        // System.out.print(hour+" "+miniute);
        int result = 0;
        int result2 = 0;
        if(hour>=12){
            result = 24-hour;
        }else{
            result= hour;
        }
        if(miniute<30){
            // 20분일떄  50분이되야함
            result2 = miniute+30;
            result = hour-1;
        }else{
            result2 = miniute-30;
        }
        System.out.print(result+"시"+result2+"분");
    }
    
}