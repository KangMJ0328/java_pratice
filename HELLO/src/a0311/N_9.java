package a0311;

import java.util.Scanner;

public class N_9 {
    public static void main(String[] args) {

        // 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 
        // 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
        // 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

        // ex. 치킨 이름을 입력하세요 : 양념
        // 양념치킨 배달 가능

        // 치킨 이름을 입력하세요 : 불닭 
        // 불닭치킨은 없는 메뉴입니다.

        // 힌트 equals
        // 배열 예)  String[] arr = {"양념", "후라이드", "순살"};


        String[] arr = {"양념","후라이드","순살"};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("치킨 이름을 입력하세요 : ");
        String choice = sc.next();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(choice)){
                System.out.println(arr[i]+"치킨 배달 가능");
                break;
            }else if(!arr[i].equals(choice)){
                System.out.println(choice+"치킨은 없는 메뉴입니다.");
                break;
            }
        }


    }
    
}
