package a0312;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
//  사용자가 입력한 값이 배열에 있는지 검색하여 있으면 
//“OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

// ex. 치킨 이름을 입력하세요 : 양념
// 양념치킨 배달 가능

// 치킨 이름을 입력하세요 : 불닭 
// 불닭치킨은 없는 메뉴입니다.
        Scanner sc = new Scanner(System.in);
        String[] arr = {"양념", "후라이드", "순살"};
        System.out.print("치킨 이름을 입력하세요 :");
        String food = sc.nextLine();
        int yesNo=0; // 치킨 종류의 유무 판별
        for(int i=0; i < arr.length; i++){
            if(arr[i].equals(food)){
                yesNo +=1;
                break;
            }
        }
        if(yesNo==0){
            System.out.println(food + "은(는) 없는 메뉴에요");
        }else{
            System.out.println(food+"치킨 배달 가능");
        }
        sc.close();
    }
}
