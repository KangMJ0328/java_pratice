package a0325.calendar;

import java.util.Calendar;

public class Calendar3 {
    public static void main(String[] args) {
        //Calendar.getInstance(); = 현재시간의 Calendar 인스턴스를 라져옴
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.MARCH, 20); 
        // 2024년 3월 20일로 설정
        calendar.set(Calendar.HOUR_OF_DAY, 15); 
        // 시간을 오후 3시로 설정
        calendar.set(Calendar.MINUTE, 30); // 분을 30분으로 설정
        calendar.set(Calendar.SECOND, 0); // 초를 0초로 설정
        System.out.println("현재 날짜 및 시간: " + calendar.getTime());
    }
}
