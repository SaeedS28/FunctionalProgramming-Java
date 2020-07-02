package streams.tutorials;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Sorting {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pear");
		fruits.add("Orange");
		fruits.add("Mango");
		
		// ascending
		fruits.stream()
				.sorted((fruit1, fruit2) -> fruit1.compareTo(fruit2)).forEach((fruit) -> System.out.println(fruit));
		System.out.println("*****************************************************");
		  
		// descending
		fruits.stream()
		.sorted((fruit1, fruit2) -> fruit2.compareTo(fruit1)).forEach((fruit) -> System.out.println(fruit));
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Saad", 24, 100000));
		employees.add(new Employee(2, "Sam", 18, 75000));
		employees.add(new Employee(3, "James", 42, 120000));
		employees.add(new Employee(4, "Sarah", 35, 140000));
		employees.add(new Employee(5, "Claire", 30, 110000));
		
		System.out.println("*****************************************************");
		
		// ascending by salary
		employees.stream().sorted((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).forEach(System.out::println);
		
		System.out.println("*****************************************************");
		// descending by salary
		employees.stream().sorted((e1, e2) -> e1.getSalary() < e2.getSalary() ? 1 : -1).forEach(System.out::println);
	}
}

@ToString
@Getter
@Setter
@AllArgsConstructor
class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
}