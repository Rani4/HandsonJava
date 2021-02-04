import java.util.*;

public class Add {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // create object to read the user input
        int a = sc.nextInt();  // reading the user input in integer
        int b = sc.nextInt();
        int c;
        if ((a>=1 && a<=100) && (b>=1 && b<=100)) {
            c = a + b;
            System.out.println(c);
        }
        else{
            System.out.println("Give the integer in range 1 to 100");
        }
    }
}

