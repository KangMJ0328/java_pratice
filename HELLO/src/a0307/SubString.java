package a0307;

public class SubString {
    public static void main(String[] args) {
        String ssn = "9703281622720";
        String firstNum = ssn.substring(0,2);
        System.out.println(firstNum);

        String secondNum = ssn.substring(6,7);
        System.out.println(secondNum);
    }
    
}
