package a0328.test;

public class Sample9 {
    public static void main(String[] args) {
        int[]data = {1,3,5,7,9};
        Calculator3 cal = new Calculator3();
        int result = cal.avg(data);
        System.out.println(result);
    }
}

class Calculator3{
    int sum= 0;

    public int avg(int[] data) {
        for (int num : data) {
            sum += num;
        }
        return sum/data.length;
    }


}