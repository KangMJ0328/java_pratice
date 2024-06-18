package a0308;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        //week 열거 타입 변수 선언
        Week today =null;

        //Calender 객체 얻기
        Calendar cal = Calendar.getInstance();
        // int year = cal.get(Calendar.YEAR);//연
        // int month = cal.get(Calendar.MONTH)+1;//연
        // int day = cal.get(Calendar.DAY_OF_MONTH);//일
        int week = cal.get(Calendar.DAY_OF_WEEK); // 요일(1~7)
        //숫자를 열거 상수로 변환해서 변수에 대입
        switch(week) {
            case 1: today = Week.SUNDAY ; break;
            case 2: today = Week.MONDAY ; break;
            case 3: today = Week.TUSEDAY ; break;
            case 4: today = Week.WENDESDAY ; break;
            case 5: today = Week.THURSDAY ; break;
            case 6: today = Week.FRIDAY ; break;
            case 7: today = Week.SATURDAY ; break;
        }
        System.out.println("오늘의 요일은" + today);
        System.out.println("오늘의 요일은" + Week.FRIDAY);

        //열거 타입 변수를 사용
        if(today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        }else{
            System.out.println("열심히 자바를 공부합니다.");
        }





    }
    
}
