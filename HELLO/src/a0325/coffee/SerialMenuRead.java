package a0325.coffee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        getMenuList();
    }

    private static void getMenuList() throws IOException,ClassNotFoundException{
        FileInputStream fls = new FileInputStream("c:/abc/coffeeMenu.bin");
        ObjectInputStream ois = new ObjectInputStream(fls);
        Map<String,CoffeeMenuInfo> map = (Map<String,CoffeeMenuInfo>)ois.readObject();
        for(String e : map.keySet()){
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("---------------------------------------");
        }
        fls.close();
        ois.close();
    }
    
}
