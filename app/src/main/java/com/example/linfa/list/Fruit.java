package com.example.linfa.list;

/**
 * Created by LinFa on 2018/1/3.
 */

public class Fruit {
    private String name;
    private int imagId;

    public Fruit(String name, int imagId) {
        this.name = name;
        this.imagId = imagId;
    }

    public String getName() {
        return name;
    }

    public int getImagId() {
        return imagId;
    }
}
