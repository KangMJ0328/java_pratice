package a0328.test;

public class Sample {
    public static void main(String[] args) {
        String pin = "881120-10668234";
        String yyyyMMdd = pin.substring(0,6);
        String num = pin.substring(7);
        System.out.println(yyyyMMdd);
        System.out.println(num);

        System.out.println(pin.charAt(7));
    }
}
