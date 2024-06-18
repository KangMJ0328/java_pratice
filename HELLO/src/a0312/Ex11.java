package a0312;

public class Ex11 {
    public static void main(String[] args) {
//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
// ex.
// 9 7 6 2 5 10 7 2 9 6
     int[] arr = new int[10];
     for(int i = 0; i<arr.length;i++){
        int random = (int)(Math.random()*10 + 1);
        arr[i] = random;
     }   
     for(int i=0; i < arr.length;i++){
        System.out.print(arr[i]+ " ");
     }

    }
}
