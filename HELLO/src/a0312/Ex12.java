package a0312;

public class Ex12 {
    public static void main(String[] args) {
//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 
// 배열 전체값과 최대값 최소값을  출력하세요.
// ex.
// 9 7 6 2 5 10 7 2 9 6
// 최대값 :10
//최소값 :2
     int[] arr = new int[10];
     for(int i = 0; i<arr.length;i++){
        int random = (int)(Math.random()*10 + 1);
        arr[i] = random;
     } 
    //  int max = 0;
    //  int min = 10;
     int max = arr[0];
     int min = arr[0];
     for(int i = 0; i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
     }
    
     for(int i=0; i < arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
     System.out.println();
     System.out.println("최대값은 : " + max);
     System.out.println("최소값은 : " + min);

    }
}
