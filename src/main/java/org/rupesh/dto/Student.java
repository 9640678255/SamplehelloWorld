package org.rupesh.dto;

import java.io.Serializable;

public class Student implements Serializable {


	private static final long serialVersionUID = 520172259171006138L;

	private String id;
	private String name;
	private int age;
	private String gender;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int setAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", setAge()=" + setAge() + ", getGender()=" + getGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
