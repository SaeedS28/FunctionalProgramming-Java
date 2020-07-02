package optiomals;

import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		
		// Experimentation code
		Optional<Object> empty = Optional.empty();	// returns an empty optional with no value inside
		System.out.println(empty);
		System.out.println(empty.isPresent());		// checks if a value is present
		System.out.println(empty);
		
		String orElse = Optional.ofNullable("not null").orElse("defalt value").toString();		// Return the value if present, otherwise return other
		System.out.println(orElse);
		
		Object value = Optional.ofNullable(null).orElseGet(() -> "null Value");		// ofNullable checks if an object is null and returns a supplier value if it is
		System.out.println(value);
		Optional.ofNullable("Hello").ifPresent(val -> System.out.println(val));
		
		String stuff = Optional.ofNullable("Hello")
								.map(string -> string.toUpperCase())
							.orElse("no value present");		// orElseGet takes a supplier and you can run any logic...orElse just returns a value without running any logic
		System.out.println(stuff);
		
		
		// make the value of the email lower-case with optionals
		
		Person person = new Person("Saad");
		Person personWithEmail = new Person("Saad", "SAAD@gmail.com");
		
		String emailLowerCase = person.getEmail()
									.map(email -> email.toLowerCase())
								.orElse("No email specified");
		
		String emailNotNull = personWithEmail.getEmail()
									.map(email -> email.toLowerCase())
								.orElse("No email specified");
		System.out.println(emailLowerCase);
		System.out.println(emailNotNull);
	}

	
	static class Person {
		private String name;
		private String email;

		public Person(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
		public Person(String name) {
			this(name, null);
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Optional<String> getEmail() {
			return Optional.ofNullable(this.email);
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}
}
