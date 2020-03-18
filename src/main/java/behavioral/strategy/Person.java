package behavioral.strategy;

import lombok.Data;

@Data
public class Person {

	private int age;
	private String name;
	private String phoneNumber;

	public Person(String name, String phoneNumber, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
}
