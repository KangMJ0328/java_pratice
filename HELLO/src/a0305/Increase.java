package a0305;

public class Increase {
    public static void main(String[] args) {
         int x = 10 ;
         int y = 10;
         int z ;
         x++;
         ++x;
         System.out.println("x=" + x);

         System.out.println("-----------------");
         y--;
         --y;
         System.out.println("y=" + y);

         System.out.println("-----------------");

         z = x++;
         // 증감연산자가 뒤에있으면 모든연산이 끝난후 x가 증가된다.
         System.out.println("z=" + z);
         System.out.println("x=" + x);

         System.out.println("-----------------");
         z = ++x;
         // 증감연산자가 뒤에있으면 모든연산이 끝난후 x가 증가된다.
         System.out.println("z=" + z);
         System.out.println("x=" + x);

    }
    
}
