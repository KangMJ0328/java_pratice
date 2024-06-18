package a0325;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0,"hello ");
        System.out.println(sb.toString());
    }
}
// substring(시작 위치, 끝 위치)와 같이 사용하면 StringBuffer
// 객체의 시작 위치에서 끝 위치까지의 문자를 뽑아낸다.

// StringBuffer은 가변 클래스
// StringBuilder 사용방법 비슷

    