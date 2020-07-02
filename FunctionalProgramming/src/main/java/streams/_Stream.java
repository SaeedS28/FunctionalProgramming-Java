package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class _Stream {
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Saad", Gender.MALE));
		people.add(new Person("Sam", Gender.MALE));
		people.add(new Person("Anna", Gender.FEMALE));
		people.add(new Person("Sandy", Gender.FEMALE));
		people.add(new Person("Emma", Gender.FEMALE));
		people.add(new Person("Alex", Gender.MALE));
		
		people.stream()
				.map(person -> person.getGender())	// converts one stream to another
				.collect(Collectors.toSet()).forEach(gender -> System.out.println(gender));
		
		System.out.println(people.stream().allMatch(person -> Gender.FEMALE.equals(person.getGender())));		// checks to see if all the elements satisfy a predicate
	}
}

class Person {
	private String name;
	private Gender gender;

	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
}

enum Gender {
	MALE, FEMALE
}
