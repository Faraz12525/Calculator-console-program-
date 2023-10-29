package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		 while(true) {
			 // ask to choose operator
			 System.out.println("Select:- + , - , * , /");
			String operator=scanner.next();
			
			 if (!operator.matches("[+\\-*/]")){
				 System.out.println("invalid operator**");
				continue;
			 }
			 
			 double num1;
			 while(true) {
			 System.out.println("enter val1");
			 if (scanner.hasNextDouble()) {
				 num1=scanner.nextDouble();
			    break;
			}else {
				System.out.println("Enter a valid num1");
				scanner.next();
			}
			 
			 }
			 
			 double num2;
			 while(true) {
				 System.out.println("Enter val2");
				 if (scanner.hasNextDouble()) {
					num2=scanner.nextDouble();
					break;
				} else {
					System.out.println("Enter a valid num2");
					scanner.next();

				}
			 }
				double result=0;
				switch (operator) {
				case "+":
					result=num1+num2;
					break;
				case "-":
					result=num1-num2;
					break;
				case "*":
					result=num1*num2;
					break;
				case "/":
					if (num2 !=0) {
						result=num1/num2;
					} else {
						System.out.println("Error: Division bt zero "+num2);
						continue;
					}
					break; 
					default:
						System.out.println("invalid Operator.");
						break;
				}
				
					System.out.println(" Result= "+num1+operator+num2+" = "+result);
					System.out.println("Do you want to perform another calculation? (Yes/No)");
                    String response=scanner.next();
                    
                    if (response.equalsIgnoreCase("yes")) {
						continue;
					}else if (!response.equalsIgnoreCase("yes")) {
						break;
					}
                    
		 }
		 scanner.close();
	}
}
		 
		
		

			  
			
			




