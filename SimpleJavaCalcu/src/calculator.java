import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		int op; //operation variable
		double num1;
		double num2;
		System.out.println("Welcome to my Calculator");
		
		System.out.print("Please enter the number 1: ");
		num1 = val.nextDouble();
		System.out.print("Please enter the number 2: ");
		num2 = val.nextDouble();
		
		System.out.println("Enter 1 if Addition");
		System.out.println("Enter 2 if Subtraction");
		System.out.println("Enter 3 if Multiplication");
		System.out.println("Enter 4 if Division");
		System.out.println();
		System.out.print("Please choose operation below: ");
		op = val.nextInt();
		
		if(op == 1) {
			System.out.print("Answer: ");
			System.out.println(num1 + num2);
		}else if(op == 2) {
			System.out.print("Answer: ");
			System.out.println(num1 - num2);
		}else if(op == 3) {
			System.out.print("Answer: ");
			System.out.println(num1 * num2);
		}else if(op == 4) {
			System.out.print("Answer: ");
			System.out.println(num1 / num2);
		}else {
			System.out.println("Please enter a valid numbers!");
		}
	}

}
