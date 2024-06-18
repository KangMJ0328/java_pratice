package a0311;

import java.util.Arrays;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        //문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

        // ex.
        // 문자열 : application
        // 문자 : i
        // application에 i가 존재하는 위치(인덱스) : 4 8
        // i 개수 : 2
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 : ");
        String str = sc.nextLine();

        System.out.println("문자 : ");
        char ch = sc.nextLine().charAt(0);

        char[] arr = new char[str.length()];
        //arr은 str의 각문자를 담기위한 문자 배열
        //arr[0]='a' arr[1]='p' arr[2]='p'
        for(int i =0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        int count =0;
        System.out.print("application에 i가 존재하는 위치(인덱스): ");
        for(int i=0; i < arr.length;i++){
            if(arr[i] == ch){
                System.out.print(i+ " ");
                count++;
            }

        }
        System.out.println();
        System.out.print("i 개수 : " + count);
        sc.close();











        
        // String[] a =str.split("");
        // int sum=0 ;
        // String in =" ";
        // for(int i=0;i<a.length;i++){
        //     if(a[i].equals(ch)){
        //         sum++;
        //         in += Integer.toString(i)+" ";
        //         // System.out.print(in);
        //     }
        // }
        // System.out.println("i 개수 : "+sum);
        // System.out.print("application에 i가 존재하는위치(인덱스) :"+in);
    }
    
}
