
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Map & Collectors.groupingBy: This method groups elements by their value and counts their occurrences. If an element appears more than once, it’s considered a duplicate.
Java*/
public class FindDuplicatesUsingStreams_Map {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        Set<Integer> duplicates = findDuplicateByGrouping(numbers);
        duplicates.forEach(System.out::println);
    }

    public static <T> Set<T> findDuplicateByGrouping(List<T> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
