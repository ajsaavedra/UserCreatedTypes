package com.tonyjs.usertypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCases
{
	public static Fraction f = new Fraction(1, 2);
	public static Fraction f1 = new Fraction(3, 8);
	public static Fraction f2 = new Fraction(3, 8);
	public static Fraction f3 = new Fraction(3, 2);

	public static MixedNumber mx = new MixedNumber(1, 2, 3);
	public static MixedNumber exp = new MixedNumber(9, 3, 4);
	public static MixedNumber mx1 = new MixedNumber(1, 1, 2);

	public static void testFractions()
	{
		System.out.println("Printing fractions");
		System.out.println(f.toString());
		System.out.println(f1.toString());
		
		System.out.println("Comparing fractions: " + f1.toString() + " and " + f.toString() + ": " + f1.compareTo(f));
		System.out.println("Comparing fractions: " + f1.toString() + " and " + f1.toString() + ": " + f1.compareTo(f1));
		System.out.println("Comparing fractions: " + f.toString() + " and " + f1.toString() + ": " + f.compareTo(f1));
		
		System.out.println("Calling equals with fractions: " + f1.toString() +
				" and " + f3.toString() + ": " + f1.equals(f3));
		System.out.println("Calling equals with fractions: " + f1.toString() +
			" and " + f2.toString() + ": " + f1.equals(f2));
		
		System.out.println("Calling equals on a fraction and mixed number " +
				f1.toString() + " and " + exp.toString() + ": "+ f1.equals(exp));
		System.out.println("Calling equals on a mixed number and fraction of equal value " +
				mx1.toString() + " and " + f3.toString() + ": " + mx1.equals(f3));
	}

	public static void testMixedNumbers()
	{
		System.out.println("\nPrinting mixed numbers");
		System.out.println(mx.toString());
		System.out.println(exp.toString());
		System.out.println("Comparing mixed numbers " + mx.toString() +
				" and " + exp.toString() + ": " + mx.compareTo(exp));
		System.out.println("Comparing mixed numbers " + exp.toString() +
				" and " + exp.toString() + ": " + exp.compareTo(exp));
		System.out.println(exp.compareTo(mx));
		System.out.println("Calling equals on mixed numbers " + exp.toString() +
				" and " + mx.toString() + ": " + exp.equals(mx));
	}

	public static void testCollections()
	{
		System.out.println("\nTesting sort on collections");
		List<Num> myList  = new ArrayList<Num>();
		myList.add(new Fraction(3, 2));
		myList.add(new Fraction(4, 9));
		myList.add(new MixedNumber(7, 3, 8));
		myList.add(new Fraction(1, 9));
		myList.add(new MixedNumber(2, 9, 10));
		System.out.println("Unsorted list: " + myList);

		Collections.sort(myList);
		System.out.println("Sorted list: " + myList);
	}

	public static void main(String[] args)
	{
		testFractions();
		testMixedNumbers();
		testCollections();
	}
}
