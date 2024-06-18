package a0328.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// import java.util.TreeMap;



public class main1 {
    public static void main(String[] args) {
        HashMap<Integer,MyData> dataMap =  new HashMap<Integer, MyData>();
        MyData myData1 = new MyData(0, "온유");
		MyData myData2 = new MyData(3, "진형");
		MyData myData3 = new MyData(2, "규성");
		MyData myData4 = new MyData(1, "건욱");
		MyData myData5 = new MyData(4, "제균");

        dataMap.put(myData1.getNumber(),myData1);
        dataMap.put(myData2.getNumber(),myData2);
        dataMap.put(myData3.getNumber(),myData3);
        dataMap.put(myData4.getNumber(),myData4);
        dataMap.put(myData5.getNumber(),myData5);
        //dataMap(0,myData1(0,온유));

        dataMap.remove(2);


        //검색
       Iterator<Integer> iterator = dataMap.keySet().iterator();
       boolean b = dataMap.containsKey(1); 
       System.out.println("b = " + b);
        //수정
        MyData myData6 = new MyData(6, "제구");

        dataMap.replace(1, myData6);


        //keySet()을 사용하여 키에 접근
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println("key : " + key);
			System.out.println("value : " + dataMap.get(key).toString());
            //dataMap.get(key)를 이용해서 해당 키에 대응하는 값을 불러온다.
        }
       //Iterator<Map.Entry<Integer, MyData>> iterator = dataMap.entrySet().iterator();  
        //entrySet() 을 사용하여   entry(키-값 쌍) - 키와 값에 모두접근이 가능
       // while (iterator.hasNext()){
        //   Map.Entry<Integer, MyData> entry= iterator.next();
       //    System.out.println("key : " + entry.getKey() +" , value:" +  entry.getValue());
       // }
        
       //정렬
    //    TreeMap<Integer, MyData> tree = new TreeMap<Integer, MyData>(dataMap);
       
    //    Iterator<Integer> tkey = tree.keySet().iterator();
    //    while(tkey.hasNext()) {
    //    int key = tkey.next();
        
    //    System.out.println("key : " + key + " value : " + tree.get(key));
    // }

    }
}
