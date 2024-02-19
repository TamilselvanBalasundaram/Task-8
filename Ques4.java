package task8;

import java.util.Scanner;

public class Ques4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
	
		System.out.println("Before Swapping a & b is " + a + " & " + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping a & b is " + a + " & " + b);
	}

}

Output:
10
20
Before Swapping a & b is 10 & 20
After swapping a & b is 20 & 10

