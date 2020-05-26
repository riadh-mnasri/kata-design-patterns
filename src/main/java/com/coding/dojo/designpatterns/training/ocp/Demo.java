package com.coding.dojo.designpatterns.training.ocp;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product pc = new Product("PC", Color.BLUE, Size.MEDIUM);
        Product shoes = new Product("Shoes", Color.GREEN, Size.MEDIUM);
        Product bag = new Product("Bag", Color.GREEN, Size.SMALL);

        List<Product> products = List.of(pc, shoes, bag);

        System.out.println("Green products (old implem): ");
        ProductFilter filter = new ProductFilter();
        filter.filterByColor(products, Color.GREEN)
            .forEach(
                p -> System.out.println(" - " + p.name + " is green")
            );


        System.out.println("Green products (new implem): ");

        BetterFilter bf = new BetterFilter();
        bf.filter(products, new ColorSpecification((Color.GREEN)))
            .forEach(
                p -> System.out.println(" - " + p.name + " is green")
            );

        System.out.println("Large blue items: ");
        bf.filter(products,
            new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.MEDIUM)
            ))
            .forEach(
                p -> System.out.println(" - " + p.name + " is medium and blue")
            );
    }
}
