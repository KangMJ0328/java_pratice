package a0314;

public class ex16 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
    
}
class Printer {
    public void  println(String n){
        System.out.println(n);
    }
    public void println(int n){
        System.out.println(n);
    }
    public void println(double n){
        System.out.println(n);
    }
    public void println(boolean n){
        System.out.println(n);
    }
}
