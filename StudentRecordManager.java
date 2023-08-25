public class StudentRecordManager 
{
    // int StudentId;
    // String name;
    // int [] marks;
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
    public static void displayStudentDetails(int studentId, String name, int[] marks) 
    {
        System.out.println("Student Details:");

        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);

        System.out.print("Marks: [ " );
        for(int e : marks) System.out.print(e + " ");
        System.out.println("]");
        
        double avg = calculateAverage(marks);
        int mx = findMax(marks);
        int mn = findMin(marks);
        
        System.out.println("Average Marks: " + avg);
        System.out.println("Maximum Mark: " + mx);
        System.out.println("Minimum Mark: " + mn);
    }

}