package com.coding.dojo.designpatterns.training.lsp;

public class Demo {
    static void userIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expect area of "+ (width * 10) + " got area  "+ r.getArea());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        userIt(r);

        Rectangle sq = new Square();
        sq.setWidth(5);
        userIt(sq);
    }
}
