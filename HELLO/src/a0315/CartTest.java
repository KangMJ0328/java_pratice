package a0315;

import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
        //Item 객체 생성
        Item shirt = new Item("스트라이프 셔츠",40000);
        Item pants = new Item("슬림 면바지", 58900);
        Item sneakers = new Item("스니커즈", 46900);

        //ArrayList 객체생성 및 Item 담기
        ArrayList<Item> cart = new ArrayList<Item>();
        // item 객체를 저장할 수 있는 ArrayList를 선언 
        cart.add(shirt);
        cart.add(pants);
        cart.add(sneakers);
        int sum = 0;
        for(int i=0;i<cart.size();i++){
            Item item = cart.get(i);
            //cart리스트에서 'i'번째 위치하는 요소 가져옵니다.
            //Item 클래스에 객체일것으로 가정합니다.
            System.out.println(item.toStr());
            sum +=item.getPrice(); //아이템을 순회하며 총합을 계산
        }
        System.out.println("====================");
        System.out.printf("총합: %d원",sum);
    }
    
}
class Item{
    private String name;
    private int price;

    //생성자
    public Item(String _name, int _price){
        name = _name;
        price = _price;
    }
    //메서드 만들기
    public String toStr(){
        return String.format("Item { name: %s,price: %d}",name,price);
    }

    //getter
    public int getPrice(){
        return price;
    }
}   