// package exception-handling.lab-test;

import java.util.Scanner;

public class a {
    public static void validate(Long x) throws OutofRange {
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            throw new OutofRange("Out of range exception");
        }
    }
    public static void main(String args[]) {
        
        try {
            // int [] arr = new arr[5];
            Integer [] arr = new Integer[5];
            arr[6] = 32;
            
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound");
        }
        
        
        Long p, q;
        Scanner sc = new Scanner(System.in);
        p = sc.nextLong();

        boolean valid = true;

        try {
            validate(p);
        } catch(OutofRange e) {
            valid = false;
            System.out.println(e.getMessage());
        }
        q = sc.nextLong();
        try {
            validate(q);
        } catch( OutofRange e) {
            valid = false;
            System.out.println(e.getMessage());
        }
        Long res = 1L;
        try {
            res = p/q;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            valid = false;
        }
        if(valid != false) {
            System.out.println("Addition result = " + (p+q));
            System.out.println("Subtraction result = " + (p-q));
            System.out.println("Multiplication result = " + (p*q));


            System.out.println("Division result = " + res);
        }
    }
}
