package a0319.ab;

public class MoreKeywords {
    public static void main(String[] args) {
        Item item1 = new Item("마지막의 지팡이", 1000);
        System.out.printf("[%s] (%d 골드) 생성완료\n",item1.name,item1.price);
    }
    
}


class Item{
    String name;
    int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

}