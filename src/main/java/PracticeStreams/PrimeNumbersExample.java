/**
 * 
 */
package PracticeStreams;

import java.util.stream.IntStream;

/**
 * 
 */
public class PrimeNumbersExample {

	public static void main(String[] args) {

		String s="Java";
		String j= new String("Java");
		System.out.println(s==j);
		System.out.println(s.equals(j));
		
		int limit = 50; // Change the limit as needed

        System.out.println("Prime numbers up to " + limit + ":");
        IntStream.rangeClosed(0, limit)
                 .filter(PrimeNumbersExample::isPrime)
                 .forEach(System.out::println);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
