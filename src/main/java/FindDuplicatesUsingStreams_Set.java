

	import java.util.*;
	import java.util.stream.Collectors;
//Filter & Set.add(): This method uses a Set to keep track of unique elements encountered. If an element is already in the set, it’s considered a duplicate.
	public class FindDuplicatesUsingStreams_Set {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
	        Set<Integer> duplicates = findDuplicateBySetAdd(numbers);
	        duplicates.forEach(System.out::println);
	    }

	    public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {
	        Set<T> items = new HashSet<>();
	        return list.stream()
	                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
	                .collect(Collectors.toSet());
	    }
	}

