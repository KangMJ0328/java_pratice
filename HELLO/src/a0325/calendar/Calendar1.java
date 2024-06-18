package a0325.calendar;

import java.util.Calendar;

public class Calendar1 {
    public static void main(String[] args) {
        //Calendar.getInstance(); = 현재시간의 Calendar 인스턴스를 라져옴
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더함
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // 날짜 및 시간 출력
        System.out.println("현재 시간: " + year + "-" + month + "-" + day + " "
         + hour + ":" + minute + ":" + second);
    }
}
