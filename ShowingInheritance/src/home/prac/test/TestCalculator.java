package home.prac.test;

import java.util.Scanner;

import home.prac.usingnew.NewCalculator;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NewCalculator ob=new NewCalculator();
		int num1=0,num2=0,ch=0,result=0;
		double num3;
		System.out.println("What do u wanna do-->");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Find Square of a number-->");
		System.out.println("Enter ur choice-->");
		ch=sc.nextInt();
		if(ch>=1 && ch<=4)
		{
			System.out.println("Enter two Numbers-->");
			num1=sc.nextInt();
			num2=sc.nextInt();
			ob.set(num1, num2);
		}
		switch(ch)
		{
		case 1: result=ob.addition();
				System.out.println("Addition Result="+result);
				break;
		case 2: result=ob.substraction();
				System.out.println("Subtraction result="+result);
				break;
		case 3: result=ob.multiplication();
				System.out.println("Multiplication result="+result);
				break;
		case 4: double result1=ob.division();
				System.out.println("Division result="+result1);
				break;
		case 5: System.out.println("Enter a Number -->");
				num3=sc.nextDouble();
			    result1=ob.power(num3);
				System.out.println("Power Result="+result1);
				break;
		default: System.out.println("Invalid...Choice");
		
				
		}

	}

}
