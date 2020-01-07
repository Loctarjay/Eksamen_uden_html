package ADT_COLL;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // LinkedList add
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long end = System.nanoTime();
        long duration = end - start;
        double millis = duration/1E6;
        System.out.println("LinkedList add: " + millis);
        // ArrayList add
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        duration = end - start;
        millis = duration/1E6;
        System.out.println("ArrayList add:  " + millis);
        // LinkedList get
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        duration = end - start;
        millis = duration/1E6;
        System.out.println("LinkedList get: " + millis);
        // ArrayList get
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        duration = end - start;
        millis = duration/1E6;
        System.out.println("ArrayList get:  " + millis);
        // LinkedList remove
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = System.nanoTime();
        duration = end - start;
        millis = duration/1E6;
        System.out.println("LinkedList remove: " + millis);
        // ArrayList remove
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        end = System.nanoTime();
        duration = end - start;
        millis = duration/1E6;
        System.out.println("ArrayList remove:  " + millis);

    }
}
