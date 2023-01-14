package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly Obj = new RWOnly();
//        Obj.name = "Vijay";
//        'name' has private access so cant set name directly
//        we can print error using printStackTrace(),getMessage(),toString() inside try-catch block
        Obj.setName("Vijay");
        System.out.println(Obj.getName());

    }
}