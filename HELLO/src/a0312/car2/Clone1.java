package a0312.car2;

public class Clone1 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5}; //원본
        int[] y = x;  //얕은복사
        int[] xClone = x.clone();//깊은복사
        System.out.println(xClone == x); // 깊은복사, false
        System.out.println(y == x); // 얕은복사, true
       // System.out.println(xClone.getClass() == x.getClass()); // true
       // System.out.println(xClone.equals(x)); // false
    }
}
