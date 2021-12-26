package test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        Stream<String> str = Stream.of("This is java");
        //Map<Character, List<Character>> collect = str.flatMapToInt(String::chars).mapToObj(n->(char)n).collect(Collectors.groupingBy(n->n));
        str.flatMap(n->Stream.of(n.split(" ")));
        
    }

}
