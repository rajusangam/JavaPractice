
import java.util.*;
import java.util.stream.Collectors;

//Collections.frequency: This method compares each item with the frequency of its occurrence in the list.

public class FindDuplicatesUsingStreams_Collections {


	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
	        Set<Integer> duplicates = findDuplicateByFrequency(numbers);
	        duplicates.forEach(System.out::println);
	    }

	    public static <T> Set<T> findDuplicateByFrequency(List<T> list) {
	        return list.stream()
	                .filter(i -> Collections.frequency(list, i) > 1)
	                .collect(Collectors.toSet());
	    }

}
