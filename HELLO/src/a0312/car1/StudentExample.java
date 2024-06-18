package a0312.car1;

public class StudentExample {
    public static void main(String[] args) {
       //자바에서의 객체로 만들기 위해 new 라는 키워드를 통해
       //heap 영역에 생성 먼저해야됨!!(공간을 할당) 
       Student moon = new Student();

       moon.name = "문동은";
       moon.age = 20;
       moon.height = 167.2;

       System.out.println(moon); //주소값이 출력이 된다.

       System.out.println(moon.name + "님의 나이는 "+ moon.age+"살이고, 키는 " + moon.height );

        Student park = new Student();
		
		park.name = "박연진";
		park.age = 21;
		park.height = 173.4;
        System.out.println(park.name + "님의 나이는 " + park.age + "살이고, 키는 " + park.height + "cm 입니다.");
    }
}
