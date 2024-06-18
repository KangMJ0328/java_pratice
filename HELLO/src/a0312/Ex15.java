package a0312;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 
//저장하고 문자의 개수와 함께 출력하세요.

// ex.
// 문자열 : application
// 문자열에 있는 문자 : a, p, l, i, c, t, o, n
// 문자 개수 : 8
    Scanner sc = new Scanner(System.in);

    System.out.print("문자열 : ");
    String str = sc.nextLine();
    char[] arr = new char[str.length()]; //문자 배열생성
    int count = 0; //문자 개수 출력
    System.out.println("문자열에 있는 문자 : ");

    for(int i = 0; i <arr.length;i++){//char 배열 값대입
        arr[i] = str.charAt(i);
        //중복제거 ?? 출력.. apple => a p l e
        boolean flag = true;
        for(int j = 0; j < i; j++){
            if(arr[j] == arr[i]){
                flag = false;
            }
        }
        if(flag){
            count++;
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print(" ,"+arr[i]);
            }
        }
        //1회전 flag=true count=1  a
        //2회전 flag=true count=2  ,p
        //3회전 flag=false
        //4회전 flag=true count=3 ,l
        //5회전 flag=true count=4 ,e
        
    }

        System.out.println();
        System.out.println(count);
        sc.close();



    }
}
