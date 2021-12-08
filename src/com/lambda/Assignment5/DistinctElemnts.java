package com.lambda.Assignment5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface test{
   String show(List<String> str);

}
public class DistinctElemnts {
    public static void main(String...args){

        test obj= (str) -> {
            str=new ArrayList<>();
str.add("java");
str.add("scala");
str.add("java");
str.add("clojure");
str.add("clojure");
str.add("scala");
         List<String> list=str.stream().distinct().collect(Collectors.toList());

             return String.valueOf(list);
        };
        System.out.println(obj.show(Arrays.asList()));

    }
    }
