package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {

        List <Integer> nums = Arrays.asList(1, 2
                , 3, 4, 5, 6, 7, 8, 9);

        nums.stream().map(n -> n.toBinaryString(n))
                .map(n -> new StringBuilder(n).reverse().toString())
                .map(n -> Integer.parseInt(n, 2))
                .forEach(System.out::println);
    }
}
