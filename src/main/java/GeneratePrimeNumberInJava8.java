	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.IntStream;

	public class GeneratePrimeNumberInJava8 {
	    public static void main(String[] args) {
	        System.out.println("Prime numbers until 50:\n" + primeNumbersUnTil(50));
	        System.out.println("\nPrime numbers within 10 and 31:\n" + primeNumbersInRange(10, 31));
	    }

	    // Generating prime numbers till the specified number.
	    public static List<Integer> primeNumbersUnTil(int n) {
	        return IntStream.rangeClosed(2, n)
	                .filter(x -> isPrime(x))
	                .boxed()
	                .collect(Collectors.toList());
	    }

	    // Generating prime numbers within the specified range.
	    public static List<Integer> primeNumbersInRange(int startingNumber, int endingNumber) {
	        return IntStream.rangeClosed(startingNumber, endingNumber)
	                .filter(x -> isPrime(x))
	                .boxed()
	                .collect(Collectors.toList());
	    }

	    // Java 8 way to check if a number is prime or not.
	    private static boolean isPrime(int number) {
	        return number > 1 && IntStream.range(2, number)
	                .noneMatch(i -> number % i == 0);
	    }

}
