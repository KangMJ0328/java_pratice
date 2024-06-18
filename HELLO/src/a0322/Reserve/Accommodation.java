package a0322.Reserve;

import java.util.ArrayList;

public class Accommodation {
    private String name;
    private String location;
    private double pricePerNight;
    private boolean available;

    public Accommodation(String name, String location, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public double getPricePerNight() {
        return pricePerNight;
    }


    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }


    public boolean isAvailable() {
        return available;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void book(){
        this.available = false;
    }
    @Override
    public String toString(){
        return "숙소 이름=" + name + ", 위치=" + location + ", 박당 가격=" + pricePerNight + ", 예약 가능 여부=" + (available ? "예약 가능" : "예약 불가능");
    }

}
// 숙소 관리 클래스
class AccManager{
    private ArrayList<Accommodation> accommodations;
    private ArrayList<Accommodation> bookedAccommodations;

    public AccManager(){
        accommodations = new ArrayList<>();
        bookedAccommodations = new ArrayList<>();

        //초기 숙소 추가
        accommodations.add(new Accommodation("호텔 A", "서울", 100.0));
        accommodations.add(new Accommodation("호텔 B", "부산", 80.0));
        accommodations.add(new Accommodation("호텔 C", "제주", 120.0));
    }

    public void disAvailAccommodations() {
       System.out.println("예약 가능한 숙소");
       for(Accommodation accommodation : accommodations){
            if(accommodation.isAvailable()){
                System.out.println(accommodation);
            }
       }
    }

    public boolean bookedAccommodation(String name) {
        for(Accommodation accommodation : accommodations){
            if(accommodation.getName().equals(name) && accommodation.isAvailable()){
                accommodation.book();
                bookedAccommodations.add(accommodation); // 예약 숙소 arraylist 추가
                return true;
            }
        }
        return false;
    }

    public void disBookedAccommodations() {
        System.out.println("예약한 숙소 :");
        for(Accommodation accommodation : bookedAccommodations){
            System.out.println(accommodation);
        }
    }
    
}
