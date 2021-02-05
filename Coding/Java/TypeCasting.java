import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		// Parsing the string to Integer
		int age = Integer.parseInt(sc.nextLine());  
		// reading the input as Integer1
		System.out.println("Enter other age: ");
		int age1 = sc.nextInt();
		System.out.println("Print the age: " + age + "," + age1);
	}

}
