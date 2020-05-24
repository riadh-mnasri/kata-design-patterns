package com.coding.dojo.designpatterns.ocp;

interface Specification<T> {
    boolean isSatisfied(T item);
}
