
import java.util.*;
public class App
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
		
		switch(ch)
		{
		case 1:
			add(a, b);
			break;
			
		case 2:
			sub(a, b);
			break;
			
		case 3:
			mul(a, b);
			break;
			
		case 4:
			div(a, b);
			break;
			
		default:
			System.out.println("Wrong choice");
		}
	}
}

