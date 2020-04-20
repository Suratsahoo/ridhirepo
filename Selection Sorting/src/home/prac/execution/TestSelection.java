package home.prac.execution;

import java.util.Scanner;

import home.prac.coding.UsingSelection;

public class TestSelection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Elements u wanna enter-->");
		int n=sc.nextInt();
		int a[]=new int[n];
		UsingSelection.insert(a);
		System.out.println("......U Entered.....");
		UsingSelection.print(a);
		UsingSelection.selectionSort(a);
		System.out.println("\n......After Sorting......");
		UsingSelection.print(a);
	}
}
