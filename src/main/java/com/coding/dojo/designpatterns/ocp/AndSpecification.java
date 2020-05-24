package com.coding.dojo.designpatterns.ocp;

public class AndSpecification<T> implements Specification<T> {
    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    private Specification<T> first, second;

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item)
            && second.isSatisfied(item);
    }
}
