public class P1 {
    public void get_binary_info(int num) {
        int [] arr = new int[32]; 
        int ind = 0;
        int ones, zeros;
        ones = zeros = 0;
        while(num>0) {
            int cr = num %2;
            arr[ind] = cr;
            ind++;
            if(cr == 0) zeros++;
            else ones++;
            num /= 2;
        }
        for(int i=ind-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Number of Ones: " + ones);
        System.out.println("Number of Zeros: " + zeros);

    }
}
