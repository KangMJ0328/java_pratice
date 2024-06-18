package a0325;

public class String1 {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("원본 문자열 : " + str);

        for(int i = 0; i <str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\ncharAt() 메소드를 호출 후 원본 문자열 : " + str);
    }
}
// charAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를반환