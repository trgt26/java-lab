// package exception_handling.problem_3;

import java.util.Scanner;

public class Test {

    public static void validate (int vl) throws NegativeNumberException {
        if(vl<0) {
            throw new NegativeNumberException("Negative not allowed.");
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in)
;        try {
            int x;
            x = sc.nextInt();
            validate(x);


        } catch (NegativeNumberException ne) {
            String str =ne.getMessage();
            System.out.println(str);
        }
    }
}
