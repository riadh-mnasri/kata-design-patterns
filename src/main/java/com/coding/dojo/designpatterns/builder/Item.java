package com.coding.dojo.designpatterns.builder;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
