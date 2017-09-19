package com.scp.comparablem;
import java.io.*;
import java.util.*;
public class EmpComparable{
	public static void main(String a[]){
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,  "Priya"));
		al.add(new Employee(99,  "Tiya"));
		al.add(new Employee(105,  "riya"));
		Collections.sort(al);
		for(Employee emp:al){
			System.out.print(emp.getName());
			System.out.println(emp.getId());
		}
	}
}

