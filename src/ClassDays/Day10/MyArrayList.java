package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        /*
        ArrayList
        default capacity --> 10
        new ArrayList<>(78) --> default initial capacity changed
        maintain array only internally
        increase array by oldsize+oldsize/2 +1
        growing won't affect arraylist will all take average 2 operation on adding so time complexity O(1)
         */
        ArrayList<Integer>  list=new ArrayList<>();
        list.add(2);
        list.add(20);
        list.add(30);
        System.out.println(list);
//        list.add(1,-9);      //index range 0 to size contiguous element
//        System.out.println(list);
//
//        System.out.println(list.get(2));
//        System.out.println(list.remove(2));
        Integer i=20;
        Long ii=20L;
        System.out.println(list.remove(i));
        System.out.println(list);
//
//        System.out.println(list.set(1,-90));
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        Collections.sort(list);
//        System.out.println(list);

        /*
        for each --> forward moving loop
        reads content until it get it
         */
//        for(int in:list) {
//            System.out.print(in+" ");
//        }
    }
}
