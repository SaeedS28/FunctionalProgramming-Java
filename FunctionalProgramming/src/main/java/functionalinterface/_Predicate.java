package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
	
	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("0123456789"));
		System.out.println(isPhoneNumberValid("0123456789abc"));
		System.out.println(isPhoneValidPredicate.test("0123456789abc"));
		System.out.println(isPhoneValidPredicate.and(isPhoneValidPredicate).test("0123456789"));	// Conjunction...can have or and negate
	}
	
	// an 1-ary function that returns a boolean
	public static Predicate<String> isPhoneValidPredicate = phone -> phone.length() < 14 && phone.length() > 9 && phone.matches("[0-9]+");
	public static Predicate<String> endsInANine = phone -> phone.charAt(phone.length()-1) == '9';
	
	public static boolean isPhoneNumberValid(String phone) {
		return phone.length() < 14 && phone.length() > 9 && phone.matches("[0-9]+");
	}
}
