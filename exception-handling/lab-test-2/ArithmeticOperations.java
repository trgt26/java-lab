
import java.util.Scanner;

public class ArithmeticOperations {

    public static void performOperation( ) {

        Scanner sc = new Scanner(System.in);
        String a_s, b_s;
        System.out.print("Enter the first Integer: ");
        a_s = sc.nextLine();
        System.out.print("Enter the second Integer: ");
        b_s = sc.nextLine();
        System.out.print("Enter the Operator: ");
        char c= sc.nextLine().charAt(0);

        try {
            Integer a, b;
            a = Integer.parseInt(a_s);
            b = Integer.parseInt(b_s);            
            int rs;
            if(c=='+') {
                rs = a+b;
            } else if(c== '-') {
                rs = a-b;
            } else if(c== '/') {
                rs = a/b;
            } else if(c=='*') {
                rs = a*b;
            } else {
                throw new IllegalArgumentException("Error: Invalid Operator");
            }

            System.out.println(a + " "+ c +" = "+rs);

        } catch(NumberFormatException e) {
            System.out.println("Error: Invalid Input.");
        } catch(IllegalArgumentException e) {
            System.out.println("Error: Illegal Argument Exception");
        } catch( ArithmeticException e ) {
            System.out.println("Error: Divide by zero.");
        }
        
    }
    public static void main(String [] args) {
        performOperation();
    }
}
