package Principles.Calculator;


import java.util.*;
public class AppTest
{
    public static double add(double num1, double num2)
    {
        return (num1 + num2);    
    }
    
    public static double sub(double num1, double num2)
    {
        return (num1 - num2);    
    }
    
    public static double mul(double num1, double num2)
    {
        return (num1 * num2);    
    }
    
    public static double div(double num1, double num2)
    {
        return (num1/num2);                
            
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("Enter operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4.Division");
		int ch = sc.nextInt();
		double ans = 0;
		switch(ch)
		{
		case 1:
			ans = add(a, b);
			break;
			
		case 2:
			ans = sub(a, b);
			break;
			
		case 3:
			ans = mul(a, b);
			break;
			
		case 4:
			ans = div(a, b);
			break;
			
		default:
			System.out.println("Wrong choice");
		}
		
		System.out.println(ans);
	}
}

