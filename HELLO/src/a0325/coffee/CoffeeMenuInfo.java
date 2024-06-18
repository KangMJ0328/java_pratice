package a0325.coffee;

import java.io.Serializable;

// 직렬화
// 자바시스템 내부에서 사용하는 객체를 외부의 자바시스템에서도 사용가능하도록
// byte 형태로 변환 또는 byte형태를 객체로 변환하는 (역직렬화)

public class CoffeeMenuInfo implements Serializable{
    private String name;
    private int price;
    private String group;
    private String desc;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CoffeeMenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
    
}
