package home.prac.execution;


import java.util.Arrays;
import java.util.Scanner;

import home.prac.coding.UsingBinary;

public class TestBinary {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter How many Elements u wanna enter-->");
	int n=sc.nextInt();
	int a[]=new int[n];
	UsingBinary.insert(a);
	System.out.println("......U Entered.....");
	UsingBinary.print(a);
	UsingBinary.sort(a);
	System.out.println("\nEnter the element u wanna search-->");
	int search=sc.nextInt();
	UsingBinary.search(search, a);
	
}
}
