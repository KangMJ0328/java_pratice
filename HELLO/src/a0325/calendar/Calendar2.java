package a0325.calendar;

import java.util.Calendar;

public class Calendar2 {
    public static void main(String[] args) {
        //Calendar.getInstance(); = 현재시간의 Calendar 인스턴스를 라져옴
        Calendar calendar = Calendar.getInstance();
        System.out.println("현재 날짜 및 시간: " + calendar.getTime());
    }
}
