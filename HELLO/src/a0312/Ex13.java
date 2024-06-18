package a0312;

public class Ex13 {
    public static void main(String[] args) {
//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 
// 배열 전체값 출력하세요.(단 중복값이 없어야 한다.)
// ex.
// 9 7 6 2 5 10 7 2 9 6

     int[] arr = new int[10];
     for(int i = 0; i<arr.length;i++){
        arr[i]  = (int)(Math.random()*10 + 1);
        
        for(int j = 0; j < i;j++){
            if(arr[i] == arr[j]){
                i--;
            }
        }

     }  
    
     for(int i=0; i < arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
 

    }
}
