package a0325.HomeWork;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // AutoBoxing: 기본 타입을 래퍼 클래스로 자동 변환
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // AutoBoxing
        
        double primitiveDouble = 3.14;
        Double wrapperDouble = primitiveDouble; // AutoBoxing
        
        // Unboxing: 래퍼 클래스를 기본 타입으로 자동 변환
        Integer wrapperInt2 = 20;
        int primitiveInt2 = wrapperInt2; // Unboxing
        
        Double wrapperDouble2 = 6.28;
        double primitiveDouble2 = wrapperDouble2; // Unboxing
        
        // 출력
        System.out.println("AutoBoxing:");
        System.out.println("primitiveInt: " + primitiveInt + ", wrapperInt: " + wrapperInt);
        System.out.println("primitiveDouble: " + primitiveDouble + ", wrapperDouble: " + wrapperDouble);
        
        System.out.println("\nUnboxing:");
        System.out.println("wrapperInt2: " + wrapperInt2 + ", primitiveInt2: " + primitiveInt2);
        System.out.println("wrapperDouble2: " + wrapperDouble2 + ", primitiveDouble2: " + primitiveDouble2);
    }
}

