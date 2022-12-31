import java.util.Scanner;

public class CheckNumberInArray {
    public class Solution {

        public static boolean checkNumber(int input[], int x) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
             * Taking input and printing output is handled automatically.
             */
            if(input.length==1){
                if(input[0]==x){
                    return true;
                }else{
                    return false;
                }

            }
            else if(input[input.length-1]==x){
                return true;
            }
            int [] small = new int[input.length-1];
            for(int i=0;i<input.length-1;i++){
                small[i]= input[i];
            }
            boolean output = checkNumber(small,x);
            return output;

        }
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(Solution.checkNumber(input, x));
    }
}
