import java.util.*;

public class P7 {
    public  void find_frequent_and_max_word( String str ) {
        
        String arr[] = str.split(" ");

        // Finding Most Frequent Word
        int mx_cnt= 0;
        int frq_ind = 0;
        for(int i=0; i<arr.length; i++) {
            int cnt =0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    cnt++;
                }
            }
            if(cnt>= mx_cnt) {
                mx_cnt = cnt;
                frq_ind = i;
            }
        }
        System.out.println("Most Frequent Word is : " + arr[frq_ind]);


        // Finding Max Length
        int mx_ind=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].length() >= arr[mx_ind].length()) {
                mx_ind = i;
            }
        }
        System.out.println("Word With Maximum Lenght: " + arr[mx_ind]);
    }
}