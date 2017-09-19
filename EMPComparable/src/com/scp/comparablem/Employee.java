package com.scp.comparablem;
import java.util.Comparator;
public class Employee implements Comparable<Employee>{
 private int id;
private String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int compareTo(Employee compareEmployee){
	int compareId =((Employee) compareEmployee).getId();
	return this.id - compareId;
}



}


