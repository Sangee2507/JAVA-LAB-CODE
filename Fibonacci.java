import java.util.*;
class Fibonacci
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the total numbers you want in the sequence::");
		int number = sc.nextInt();
		
		int num1 = 0, num2 = 1;
		
        System.out.print("\nFibonacci Series of "+number+" number:: ");

        for (int i = 1; i <= number; ++i)
        {
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
		
		System.out.print("\n");
    }	
}
