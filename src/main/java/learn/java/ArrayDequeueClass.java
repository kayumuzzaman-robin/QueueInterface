package learn.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeueClass {
    public static void main(String[] args) {
        Deque<Integer> stringDeque = new LinkedList<>();
        stringDeque.add(10);
        stringDeque.addFirst(11);
        stringDeque.push(10);
        System.out.println(stringDeque);


        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("X");
        arrayDeque.addFirst("T");
        arrayDeque.push("Q");
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque);
    }
}
