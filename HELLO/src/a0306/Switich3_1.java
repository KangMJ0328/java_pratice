package a0306;

public class Switich3_1 {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A','a' ->{
                System.out.println("우수회원입니다.");

            }
            case 'B','b' ->{
                System.out.println("일반회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }

        }
    }
    
}
