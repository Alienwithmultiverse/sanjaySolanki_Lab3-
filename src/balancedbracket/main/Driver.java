package balancedbracket.main;
import java.util.Scanner;
import balancedbracket.service.BalancingBrackets;

public class Driver {
	
	public static void main(String []args) 
	{
		
		BalancingBrackets balancingBrackets =  new BalancingBrackets();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Hello ");
		String bracketExpression = sc.nextLine();
		
		
		Boolean result;
		
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}
