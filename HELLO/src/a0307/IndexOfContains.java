package a0307;

public class IndexOfContains {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        //인덱스번호 3번위치에서 프로그래밍을 찾음 
        System.out.println(location);
        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("자바");
        System.out.println(location);
        // subject.indexOf 찾는 문자열이 있으면 인덱스시작번호 없으면 -1

        if(location != -1){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련없는 책이군요");
        }

    }
    
}
