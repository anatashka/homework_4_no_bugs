package practice_8_functional_interfaces_and_lambda.part3;

import java.util.List;
import java.util.Optional;

//Напишите программу, которая принимает список строк и находит первую строку,
// начинающуюся на букву "Б", используя Stream API.
public class D_findB {
    public static void main(String[] args) {
        List<String> list = List.of("Anna","Chloe","Betty","Boris");
        System.out.println(list);
        Optional str = list.stream()
                .filter((s -> s.startsWith("B")))
                .findFirst();
        System.out.println(str.get());
    }
}

