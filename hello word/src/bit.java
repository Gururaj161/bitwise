import java.util.Scanner;
public class bit {
	    public static void main(String[] args) 
	    {
	        int number = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number to check whether it is \"even\" or \"odd\"");
	        number = scanner.nextInt();
	        
	        if((number % 2)==0)
	        {
	            System.out.println("The Given Number \""+number+"\" is Even");
	        }
	        else
	        {
	            System.out.println("The Given Number \""+number+"\" is Odd");
	        }
	    }
	}