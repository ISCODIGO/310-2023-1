package com.allendowney.thinkdast;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // run a few simple tests
        MyArrayList<Integer> mal = new MyArrayList<Integer>();
        mal.add(1);
        mal.add(2);
        mal.add(3);
        mal.add(2);
        System.out.println(mal + " size = " + mal.size);

        System.out.println("IndexOf(3): " + mal.indexOf(3));
        System.out.println("IndexOf(4): " + mal.indexOf(4));
        System.out.println("IndexOf(2): " + mal.indexOf(2));
        System.out.println("lastIndexOf(2): " + mal.lastIndexOf(2));
        mal.remove(2);
        System.out.println(mal + " size = " + mal.size);


        MyArrayList<String> mas = new MyArrayList<>();
        mas.add("hola");
        mas.add("mundo");
        System.out.println(mas);
        mas.set(0, "adios");
        System.out.println(mas);
    }
}
