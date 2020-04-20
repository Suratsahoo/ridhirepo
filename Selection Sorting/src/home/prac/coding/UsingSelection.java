package home.prac.coding;

import java.util.Scanner;

public class UsingSelection {
	
	public static void insert(int arr[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" calues-->");
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
	}
	public static void print(int sur[]) {
		System.out.print("Array elements are-->");
		for(int i=0;i<sur.length;i++)
			System.out.print(" "+sur[i]);
	}
	
	public static void selectionSort(int arr[])
	{
		int minIndex=0,tmp;
		for(int i=0;i<arr.length;i++) {
			minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			if(minIndex!=i)
			{
				tmp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=tmp;
			}
		}
	}

}
