package a0320.exception1;

public class Sample3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(a[3]);
    }
}
//a[3]은 a배열의 4번째 값이므로 a 배열에서 구할 수 없다.
//그래서 배열에서 아무것도 없는 곳을 가리켰다는
//ArrayIndexOutOfBoundsException 예외가 발생했다