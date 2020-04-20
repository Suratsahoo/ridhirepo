package home.prac.coding;

import java.util.Scanner;

public class UsingBinary {
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
	
	public static void search(int a,int arr[]) {
		
		int mid=0,first=0,last=arr.length-1;
		boolean flag=false;
		
		
		while(first<=last)
		{
			mid=(first+last)/2;
			if(arr[mid]==a) {
				System.out.println("Found at position-->"+(mid+1));
				flag=!flag;
				break;
			}
			else if(a>arr[mid]) 
				first=mid+1;
			else
				last=mid-1;
			}
		if(!flag==true)
			System.out.println("not found");
		
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
		
	}
	
	
	


