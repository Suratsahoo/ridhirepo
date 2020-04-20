package home.prac.execution;

import java.util.Scanner;

import home.prac.coding.UsingBubble;

public class TestBubble {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Elements u wanna enter-->");
		int n=sc.nextInt();
		int a[]=new int[n];
		UsingBubble.insert(a);
		System.out.println("......U Entered.....");
		UsingBubble.print(a);
		UsingBubble.sort(a);
		System.out.println("\n......After Sorting......");
		UsingBubble.print(a);
	}

}
