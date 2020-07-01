package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Saad", Gender.MALE));
		people.add(new Person("Sam", Gender.MALE));
		people.add(new Person("Anna", Gender.FEMALE));
		people.add(new Person("Sandy", Gender.FEMALE));
		people.add(new Person("Emma", Gender.FEMALE));
		people.add(new Person("Alex", Gender.MALE));
		
		// Females

		System.out.println("Imperative approach");
		List<Person> females = new ArrayList<>();
		for (Person person : people) {
			if (Gender.FEMALE.equals(person.getGender())) {
				females.add(person);
			}
		}
		System.out.println(females);
		
		System.out.println("Declarative approach");
		Predicate<Person> isFemale = female -> Gender.FEMALE.equals(female.getGender());
		people.stream().filter(isFemale).collect(Collectors.toList()).forEach(fem -> System.out.println(fem));
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