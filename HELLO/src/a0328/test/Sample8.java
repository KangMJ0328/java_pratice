package a0328.test;

public class Sample8 {
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }


}
class Calculator2 {
    int value;

    Calculator2() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}
class MaxLimitCalculator extends Calculator2 {
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}
