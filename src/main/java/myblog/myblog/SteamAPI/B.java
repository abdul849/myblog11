package myblog.myblog.SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers); // Output: Even Numbers: [2, 4, 6, 8, 10]


        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        Predicate<String> isLongerThanFive = str -> str.length() > 5;
        List<String> longWords = words.stream().filter(isLongerThanFive).collect(Collectors.toList());
        System.out.println("Long Words: " + longWords);


        Predicate<Integer> isEven2 = num -> num % 2 == 0;
        Predicate<Integer> isGreaterThanFive = num -> num > 5;

        List<Integer> filteredList = numbers.stream().filter(isEven2.and(isGreaterThanFive)).collect(Collectors.toList());

        System.out.println("Filtered Numbers: " + filteredList); // Output: Filtered Numbers: [6, 8, 10]
    }
}
