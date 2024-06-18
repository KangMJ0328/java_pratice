package a0307;

import java.util.Scanner;

public class N_48Teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int male = scan.nextInt();
        int birth_year;
        if(male ==1 || male ==2){
            birth_year = 1900+ (number/10000);
        }else{
            birth_year = 2000+ (number/10000);
        }
        int age = 2026 - birth_year;
        System.out.println(age);
    }
    
}
