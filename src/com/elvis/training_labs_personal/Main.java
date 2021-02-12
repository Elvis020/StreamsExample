package com.elvis.training_labs_personal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stream.of("a1","a2","a3")
                .findFirst()
                .map(n -> n + "-added")
                .ifPresent(System.out::println);
        IntStream.range(1,5)
                .forEach(System.out::println);
        DoubleStream.generate(() -> Math.random() * 1000)
                .limit(3).forEach(System.out::println);
        List<String> names = Arrays.asList("Reflection","Collection", "Stream");
        List<String> result = names.stream().map(String::toLowerCase).filter(c->c.startsWith("s")).collect(Collectors.toList());
        System.out.println(result);

    }

}
