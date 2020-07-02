package streams.tutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AuxMethods {
	public static void main(String[] args) {
		
		// a stream cannot be reused once it has been operated on
		Supplier<Stream<Integer>> newStreamsSupplier = () -> Stream.of(1,2,3,4,5,6,7,8,9);
		
		System.out.println(newStreamsSupplier.get().count());
		System.out.println(newStreamsSupplier.get().min((int1, int2) -> int1 > int2 ? 1 : -1).get());	// returns the optional with the minimum element based on a comparator
		System.out.println(newStreamsSupplier.get().max((int1, int2) -> int1 > int2 ? -1 : 1).get());
		newStreamsSupplier.get().limit(3).forEach(System.out::print);	// truncates the stream to the specified size
	}
}
