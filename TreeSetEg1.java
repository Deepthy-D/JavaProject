package com.p9_demo;

import java.util.*;

class Country{
	String name;
	double gdp;

	//constructor
	public Country(String name, double gdp) {
		super();
		this.name = name;
		this.gdp = gdp;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGdp() {
		return gdp;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}

	
	@Override
	public String toString() {
		return "Country [name=" + name + ", gdp=" + gdp + "]";
	}
		
}

public class TreeSetEg1 {
public static void main(String[] args) {
	TreeSet <Country> tss = new TreeSet<Country>(new MyComparator1());

	tss.add(new Country("France" , 1345.7));
	tss.add(new Country("Germany" , 7654.098));
	tss.add(new Country("France" , 1345.7));
	tss.add(new Country("India" , 666));
	tss.add(new Country("US" , 900.09));
	
	Iterator<Country> itrs = tss.iterator();
	
	for (;itrs.hasNext();) {
		System.out.println(itrs.next());
	}
}
}

class MyComparator1 implements Comparator<Country>{

	@Override
	public int compare(Country c1, Country c2) {
		return (int)(c2.getGdp() - c1.getGdp());
	}	
	}
	
