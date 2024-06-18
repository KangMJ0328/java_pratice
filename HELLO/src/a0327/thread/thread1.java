package a0327.thread;

public class thread1 {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start();
    }
}
class Sample extends Thread{
    public void run(){
        System.out.println("thread run");
    }
}