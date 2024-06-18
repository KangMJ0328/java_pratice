package a0322.ex09;

public class Instanceof {
    public static void main(String[] args){
        //구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        ride(taxi);
        System.out.println();
        ride(bus);
    }
    //인터페이스 매개변수를 갖는 메소드

    public static void ride(Vehicle vehicle){
    //     if(vehicle instanceof Bus) {
    //       Bus bus = (Bus) vehicle;
    //       bus.checkFare();
    //    }
    //객체타입확인
        if(vehicle instanceof Bus bus){
            bus.checkFare();
            //vehicle에 대입된 객체가 Bus 타입일 경우 실행
        }

        vehicle.run();
    }
}
