package com.sohan;

public class Main {
    public static void main(String args []){
        Array numbers = new Array(4);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
        numbers.insert(6);
        //numbers.removeAt();
        System.out.println(numbers.indexOf(10));

        numbers.print();


    }

}
