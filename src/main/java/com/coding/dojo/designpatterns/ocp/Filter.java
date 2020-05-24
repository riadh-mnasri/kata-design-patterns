package com.coding.dojo.designpatterns.ocp;

import java.util.List;
import java.util.stream.Stream;

interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
