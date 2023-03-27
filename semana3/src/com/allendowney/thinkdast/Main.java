package com.allendowney.thinkdast;

public class Main {
    public static void main(String[] args) {
        // run a few simple tests
        MyArrayList<String> mal = new MyArrayList<String>();
        mal.add("h");
        mal.add(1, "o");
        mal.add(2, "l");
        mal.add(3, "a");
        System.out.println(mal);
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