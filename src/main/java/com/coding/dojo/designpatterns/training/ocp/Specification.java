package com.coding.dojo.designpatterns.training.ocp;

interface Specification<T> {
    boolean isSatisfied(T item);
}
