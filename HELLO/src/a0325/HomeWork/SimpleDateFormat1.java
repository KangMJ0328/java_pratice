package a0325.HomeWork;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormat1 {
    // SimpleDateFormat
    // SimpleDateFormat은 Java에서 날짜와 시간을 형식화(formatting)하고 파싱(parsing)하는 데 사용되는 클래스

    // 날짜 및 시간 형식화: Date 객체나 Calendar 객체를 원하는 형식으로 문자열로 변환할 수 있습니다.
    // 문자열을 날짜로 변환: 문자열을 지정된 형식에 따라 파싱하여 Date 객체로 변환할 수 있습니다.

}
class SimpleDateFormatExample {
    public static void main(String[] args) {
        // 현재 날짜와 시간을 가져옴
        Date now = new Date();

        // SimpleDateFormat 객체 생성
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 날짜를 문자열로 형식화
        String formattedDate = sdf.format(now);
        System.out.println("Formatted Date: " + formattedDate);
    }
}


class SimpleDateFormatExample2 {
    public static void main(String[] args) {
        String dateString = "2024-03-28 15:30:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            // 문자열을 Date 객체로 파싱
            Date date = sdf.parse(dateString);
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}