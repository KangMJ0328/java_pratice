package a0328.test;

public class Sample7 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());  // 10에서 3을 뺀 7을 출력
    }
    
}
class Calculator {
    int value;

    Calculator(){
        this.value = 0;
    }

    void add(int val){
        this.value +=val;
    }
    int getValue(){
        return this.value;
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}
