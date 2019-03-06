package com.stupica.demo01.ui;


import java.util.ArrayList;
import java.util.Collection;


class TestFoo {
    final Collection<? extends Number> foos = new ArrayList<Number>();
    static volatile Integer y = new Integer(0);
    public void update(Integer a) {
        try {
            a = new Integer(20);
        } finally {
            a = new Integer(30);
        }
    }
    public void foo() {
        Integer x = new Integer(10);
        update(y);
        System.out.println(y);
    }
}