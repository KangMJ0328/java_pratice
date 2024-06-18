package a0325.object;


import java.util.Iterator;
import java.util.TreeSet;

public class DescendingOrder2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>((o1,o2) -> o2.compareTo(o1));    

        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}