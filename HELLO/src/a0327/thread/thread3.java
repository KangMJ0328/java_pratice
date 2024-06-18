package a0327.thread;

import java.util.ArrayList;

public class thread3 {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0; i<10; i ++){
            Thread t = new Sample2(i);
            t.start();
            threads.add(t);
        }
        for(int i=0;i<threads.size();i++){
            Thread t = threads.get(i);
            try{
                t.join(); //t 쓰레드가 종료할 때 까지 기다린다.
            }catch(Exception e){

            }
        }
        System.out.println("main end");
    }
}
class Sample3 extends Thread{
    int seq;

    public Sample3(int seq){
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " thread start."); //쓰레드 시작
        try{
            Thread.sleep(1000); //1초 대기한다.
        } catch (Exception e) {

        }
        System.out.println(this.seq + " thread end."); //쓰레드 종료
    }
}
//1. 다중 작업 처리 : 동시에 여러작업 수행 
//2. 성능향상 : 병렬성을 사용하여 프로그램의 성능향상이된다.
// 동시수행이 가능하므로 수행시간이 절약된다.
//3. 비동기 프로그래밍 - 다른 작업을 할 수 있으므로 시스템 자원을 효율적 활용
//4. 응용프로그램의 확장성 
//5. 운영체제와의 상호작용
//6. 멀티코어 프로세서 활용
