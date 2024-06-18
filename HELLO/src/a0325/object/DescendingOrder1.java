package a0325.object;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class DescendingOrder1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(new DescendingOrder());

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

class DescendingOrder implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        // if(o1 instanceof Comparable && o2 instanceof Comparable){
        //     Integer c1 = (Integer)o1;
        //     Integer c2 = (Integer)o2;
        //     return c2.compareTo(c1);
        // }
        // return -1;
        return o2.compareTo(o1); // 내림차순
        // return o1.compareTo(o2) // 오름차순
    }
}