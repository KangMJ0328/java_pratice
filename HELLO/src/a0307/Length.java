package a0307;

public class Length {
    public static void main(String[] args) {
        String ssn = "9703281622720";
        int length = ssn.length();
        if(length ==13){
            System.out.println("주민등록번호 자릿수가맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가틀립니다.");
        }    


    }
    
}
