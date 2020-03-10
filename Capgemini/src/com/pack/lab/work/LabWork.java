package com.pack.lab.work;

public class LabWork {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "LabWork [name=" + name + ", age=" + age + "]";
}

}
