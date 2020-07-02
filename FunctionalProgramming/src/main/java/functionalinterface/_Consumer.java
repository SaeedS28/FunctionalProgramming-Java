package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	public static void main(String[] args) {
		Customer customer = new Customer("Saad", "123-456-7890");
		greet(customer);
		greetConsumer.accept(customer);
		greetConsumerBiConsumer.accept(customer, true);
		greetConsumerBiConsumer.accept(customer, false);
	}
	
	public static void greet(Customer customer) {
		System.out.println("Hi there: " + customer.getName() + ", with phone number: " + customer.getPhoneNumber());
	}
	
	static Consumer<Customer> greetConsumer = customer ->  System.out.println("Hi there: " + customer.getName() + ", with phone number: " + customer.getPhoneNumber());
	static BiConsumer<Customer, Boolean> greetConsumerBiConsumer = (customer, showPhone) ->  
											System.out.println("Hi there: " + customer.getName() + ", with phone number: " + (showPhone ? customer.getPhoneNumber(): "**********"));
	// can be instantiated without the outer class
	static class Customer {
		private String name;
		private String phoneNumber;
		
		public Customer(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
	}
	
	// consumer: 1 input, no output
}
