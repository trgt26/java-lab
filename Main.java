

public class Main {

    public static void main( String [] args) {
        int[] marks1 = {80, 85, 90, 75, 95}; 
        int[] marks2 = {70, 65, 80, 75, 60}; 
        
        StudentRecordManager.displayStudentDetails(101, "Alice", marks1); 
        System.out.println();
        StudentRecordManager.displayStudentDetails(102, "Bob", marks2); 
 
    }
}