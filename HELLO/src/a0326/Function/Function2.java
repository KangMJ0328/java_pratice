package a0326.Function;

public class Function2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a + b;
        // (int a, int b)는 Calculator 인터페이스 sum 함수의 입려항목 
        // -> a + b 리턴값에 해당 
        // 이렇게 람다함수를 사용하면 MyCalculator와 같은 실제 클래스 없이도  
        // Calculator 객체를 생성할 수 있고, 간단하게 코드를 작성가능
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}


interface Calculator2{
    int sum(int a, int b); // 1개 이상의 람다함수 사용금지
    int mul(int a, int b);
}

