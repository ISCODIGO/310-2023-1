package com.allendowney.thinkdast;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // run a few simple tests
        MyArrayList<Integer> mal = new MyArrayList<Integer>();
        mal.add(10);
        mal.add(20);
        mal.add(30);
        mal.add(40);
        Integer entero = 40;
        mal.remove(entero);
        System.out.println(mal);
        System.out.println(Arrays.toString(mal.array));
        //System.out.println(mal + " size = " + mal.size);

        /*System.out.println("IndexOf(3): " + mal.indexOf(3));
        System.out.println("IndexOf(4): " + mal.indexOf(4));
        System.out.println("IndexOf(2): " + mal.indexOf(2));
        System.out.println("lastIndexOf(2): " + mal.lastIndexOf(2));
        mal.remove(2);
        System.out.println(mal + " size = " + mal.size);*/


        /*MyArrayList<String> mas = new MyArrayList<>();
        mas.add("hola");
        mas.add("mundo");
        System.out.println(mas);
        mas.set(0, "adios");
        System.out.println(mas);*/
    }
}


/*

lista.add(10)
lista.add(20)
lista.add(30)
lista.add(40)
lista.remove(40)
lista -> [10, 20, 30]
array -> [10, 20, 30, 40]





 */