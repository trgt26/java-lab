import java.util.*;
public class Main {
    static void driver_code_for_p7() {
        System.out.println("Input a Text in a Line: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        P7 p_7 = new P7();
        p_7.find_frequent_and_max_word(str);
    }
    public static void main(String [] args) {
        driver_code_for_p7();

    }
}
