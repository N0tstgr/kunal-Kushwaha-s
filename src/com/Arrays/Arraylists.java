package com.Arrays;
import java.util.ArrayList;
public class Arraylists {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(45);


        list.add(45);
        list.add(34);
        list.add(12);
        list.add(89);
        list.add(65);
        list.add(87);
        list.add(77);
        list.add(55);
        list.set(3,823);

        System.out.println(list.contains(100));
    System.out.println(list);


    }
}
