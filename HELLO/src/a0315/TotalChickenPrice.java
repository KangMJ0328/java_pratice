package a0315;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<OrderItem> order = new ArrayList<OrderItem> ();
        order.add(new OrderItem("후라이드 치킨",9900,3));
        order.add(new OrderItem("양념 치킨",10900,2));
        order.add(new OrderItem("간장 치킨",11900,2));
        int sum = 0;
        for(int i=0;i<order.size();i++){
            OrderItem item = order.get(i);
            System.out.println(item.toStr());
            sum +=item.totalPrice(); //아이템을 순회하며 총합을 계산
        }
        System.out.println("====================");
        System.out.println("총합: "+sum+"원");
    }
}
class OrderItem{
    private String name;
    private int price;
    private int count;

    OrderItem(String n,int p, int c){
        name = n;
        price = p;
        count = c;
    }

    public String toStr(){
        return name+"("+price+")"+" x " +count+"마리";
    }
    public int totalPrice(){
        return price*count;
    }
}
