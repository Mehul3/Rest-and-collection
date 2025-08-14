package com.example.collections;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private double salary;

	public Student(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID:" + id + ", Name: " + name + ", Salary: " + salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Student))
			return false;

		Student s = (Student) o;
		return id == s.id && Double.compare(s.salary, salary) == 0 && name.equals(s.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

}
