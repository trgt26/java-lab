public class StudentRecordManager 
{
    public int StudentId;
    public String name;
    public int [] marks;

    // Calculate Average Marks
    public static double calculateAverage(int[] marks) 
    {
        double sum = 0;
        int cnt = 0;
        for(int e : marks) {
            cnt++; 
            sum += e;
        } 
        double avg = sum/ cnt;
        return avg;
    }
    
    // Find Maximum Marks
    public static int findMax(int[] marks) 
    {
        int mx = marks[0];
        for(int e : marks) {
            if(mx< e) {
                mx =e;
            }
        }
        return mx;
    }

    // Find Minimum Marks
    public static int findMin(int[] marks)
    {
        int mn = marks[0];
        for(int e : marks) {
            if(mn> e) {
                mn =e;
            }
        }
        return mn;

    }

    // Display The details
    public static void displayStudentDetails(int studentId, String name, int[] marks) 
    {
        System.out.println("Student Details:");

        // Printing Id and Name
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);

        // Printing Marks
        System.out.print("Marks: [ " );
        for(int e : marks) System.out.print(e + " ");
        System.out.println("]");
        
        // Calculating Average Maximum and minimum Marks
        double avg = calculateAverage(marks);
        int mx = findMax(marks);
        int mn = findMin(marks);
        
        // Printing Average Maximum and Minimum
        System.out.println("Average Marks: " + avg);
        System.out.println("Maximum Mark: " + mx);
        System.out.println("Minimum Mark: " + mn);
    }

}