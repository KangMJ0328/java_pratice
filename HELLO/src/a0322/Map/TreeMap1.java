package a0322.Map;
import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
        

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
      
        // put() 메소드를 이용한 요소의 저장
        tm.put(30, "삼십");
        tm.put(10, "십");
        tm.put(40, "사십");
        tm.put(20, "이십");
  
        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
        for (Integer key : tm.keySet()) {
           System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
        }
        System.out.println();
  
        // remove() 메소드를 이용한 요소의 제거
        tm.remove(40);
  
        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> keys = tm.keySet().iterator();
        while (keys.hasNext()) {
           Integer key = keys.next();
           System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
        }
        System.out.println();
  
        // replace() 메소드를 이용한 요소의 수정
        tm.replace(20, "twenty");
  
        for (Integer key : tm.keySet()) {
           System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
        }
        System.out.println();
  
        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : " + tm.size());
      }
    
}
