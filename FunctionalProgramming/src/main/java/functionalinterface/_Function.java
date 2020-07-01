package functionalinterface;

import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		System.out.println(increment(1));
		System.out.println(incrementor.apply(4));
		System.out.println(incrementor.andThen(doubler).apply(4));	// composite functions, just like in math
	}
	
	// imperative single-valued method 
	public static int increment(int number) {
		return number + 1;
	}
	static Function<Integer, Integer> incrementor = number -> number + 1;	// implementing the apply method
	static Function<Integer, Integer> doubler = number -> number * 2;
}
