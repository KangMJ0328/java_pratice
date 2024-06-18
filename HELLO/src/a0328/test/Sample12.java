package a0328.test;

class Sample12 {
    public static void main(String[] args) {
        Calculator6 cal = new Calculator6();
        cal.add(3);
        System.out.println(cal.getValue());
    }    
}

class Calculator6{
    int value;

    void add(int val){
        this.value +=val;
    }
    public Integer getValue(){
        return this.value;
    }
}
