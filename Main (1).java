import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Operand 1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the Operand 2: ");
		int n2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Operation(+,-,*,/,%): ");
		String op = sc.nextLine();
		switch(op){
		    case "+": System.out.print("Sum is: "+(n1+n2));
		              break;
		    case "-": System.out.print("Difference is: "+(n1-n2));
		              break;
		    case "*": System.out.print("Product is: "+(n1*n2));
		              break;
		    case "/": System.out.print("Division is: "+(n1/n2));
		              break;
		    case "%": System.out.print("Modulo is: "+(n1%n2));
		              break;
		}
	}
}