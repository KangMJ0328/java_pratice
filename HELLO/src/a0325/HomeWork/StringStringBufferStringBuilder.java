package a0325.HomeWork;

public class StringStringBufferStringBuilder {
    public static void main(String[] args) {
        // String
        String str1 = "Hello";
        String str2 = "World";
        
        // 문자열 연결 연산
        String result = str1 + ", " + str2;
        
        System.out.println("결과: " + result);
        // 스트링타입은 선언과동시에 불변하는 특징을 가짐 그래서 매번 객체를 생성해서 써줌


        // StringBuffer 
        StringBuffer sb = new StringBuffer();
        
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        
        // StringBuffer에 저장된 문자열 출력
        System.out.println("결과: " + sb.toString());
        // 스트링버퍼는 스트링타입과 다르게 문자열의 가변이 가능 append(), insert(), delete()


        // StringBuilder
        StringBuilder sb1 = new StringBuilder();
        
        sb1.append("Hello");
        sb1.append(", ");
        sb1.append("World");
        
        // StringBuilder에 저장된 문자열 출력
        System.out.println("결과: " + sb1.toString());

        // 스트링빌더는 스트링버퍼와 매우 흡사하지만 멀티스레드환경에선 오류를 보일 가능성이 높음
    }
}
