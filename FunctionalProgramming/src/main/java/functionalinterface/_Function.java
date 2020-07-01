package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		System.out.println(increment(1));
		System.out.println(incrementor.apply(4));
		System.out.println(incrementor.andThen(doubler).apply(4)); // composite functions, just like in math
		System.out.println(incrementorAndMultiplier(2, 5));
		System.out.println(incrementorAndMultiplierBiFunction.apply(2, 5));
	}

	// imperative single-valued method
	public static int increment(int number) {
		return number + 1;
	}

	static Function<Integer, Integer> incrementor = number -> number + 1; // implementing the apply method
	static Function<Integer, Integer> doubler = number -> number * 2;

	// imperative 2-arg method
	public static int incrementorAndMultiplier(int number, int factor) {
		return (number + 1) * factor;
	}
	
	// Bi-function: 2 inputs
	static BiFunction<Integer, Integer, Integer> incrementorAndMultiplierBiFunction = (number, factor) -> (number + 1) * factor; 
}
