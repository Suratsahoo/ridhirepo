package home.prac.coding;

import java.util.Scanner;

public class UsingBubble {
	
	public static void insert(int arr[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" values-->");
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		
	}
	public static void sort(int rid[]) {
		int c=0;
		for(int i=0;i<rid.length;i++)
		{
			for(int j=i+1;j<rid.length;j++) {
				if(rid[i]>rid[j]) {
					c=rid[i];
					rid[i]=rid[j];
					rid[j]=c;
				}
			}
		}
		
	}
	public static void print(int sur[]) {
		System.out.print("Array elements are-->");
		for(int i=0;i<sur.length;i++)
			System.out.print(" "+sur[i]);
	}

}
