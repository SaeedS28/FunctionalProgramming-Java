package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
	
	public static void main(String[] args) {
		System.out.println(getAValue());
		System.out.println(getASuppliedValue.get());
	}
	
	public static String getAValue() {
		return "this is a supplier method tha just returns a particular thing";
	}
	
	static Supplier<String> getASuppliedValue = () -> "this is a supplier function tha just returns a particular thing";
}
