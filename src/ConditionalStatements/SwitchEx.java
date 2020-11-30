package ConditionalStatements;

import java.util.Scanner;

public class SwitchEx 
{
	
	public void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eCommerce");
		String eCommerce=sc.nextLine();
		final String constant="eBay";
		String literal="AliBaba";
		switch(eCommerce.toLowerCase())
		{
		case "myntra":
			System.out.println("in myntra");
			break;
		case "flipkart":
			System.out.println("in flipkart");
		case "amazon":
			System.out.println("in amazon");
			break;
		case constant:
			System.out.println("in eBay");
			default:
				System.out.println("No such");
	}
	}
	
public static void main(String[] args) {
	
}
}
