import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaxRepeatedValueInStringArray {
    public static void main(String[] args) {
        String[] stringArray = {"date","pomagranate","apple", "banana", "apple", "cherry", "banana", "banana", "date", "apple", "date","apple","date",};

        Map<String, Long> frequencyMap = Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        long maxCount = frequencyMap.values().stream()
                .max(Long::compareTo)
                .orElse(0L);

        long minCount = frequencyMap.values().stream()
                .min(Long::compareTo)
                .orElse(0L);
        
        frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .forEach(entry -> System.out.println("Most repeated value: " + entry.getKey()));
        
        frequencyMap.entrySet().stream()
        .filter(entry -> entry.getValue() == minCount)
        .forEach(entry -> System.out.println("Least repeated value: " + entry.getKey()));
    }
}
