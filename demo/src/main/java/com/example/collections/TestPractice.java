package com.example.collections;

        import java.sql.SQLOutput;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;
        import java.util.function.Function;
        import java.util.stream.Collectors;

        public class TestPractice {

            public static void main(String[] args) {
                System.out.println("This is a test practice class.");

                List<String> fruits = new ArrayList<>();
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Cherry");

                Collections.sort(fruits);

                System.out.println("Sorted fruits: " + fruits);

                String[] arr = {"abc", "def", "abc", "ghi", "def", "abc"};

                Arrays.stream(arr)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .forEach((k, v) -> System.out.println(k + "=" + v));


            }
        }