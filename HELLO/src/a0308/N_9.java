package a0308;

import java.util.Arrays;
import java.util.Scanner;

public class N_9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean run = true;
        int student =0;
        int[] scores =null;
        while (run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("------------------------------------------------------------");
            System.out.print("선택> ");
            int choice = sc.nextInt();
            int[] score = new int[student];
            
            if(choice ==1){
                System.out.print("학생수> ");
                student= sc.nextInt();
                System.out.print("학생수"+student+"\n");
            }if(choice == 2){
                
                for(int i=0;i<student;i++){
                    System.out.print("scores["+i+"]:");
                    score[i] =sc.nextInt();
                     scores = score;
                } 
                // scoretotal = score;
            }else if(choice ==3){
                for(int i =0;i<student;i++){
                    System.out.println(scores[i]);
                }
                
                
            }

        }

        // int student = sc.nextInt();
        
        // System.out.print("학생 수 : ");
        // int student = sc.nextInt();
        // System.out.print("점수 입력 : ");
    }
    
}
