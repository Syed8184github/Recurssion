import java.util.Scanner;

public class SumArray {
    public class Solution {

        public static int sum(int input[]) {

            if (input.length == 1) {
                return input[0];
            }

            int[] smallOutput = new int[input.length - 1];
            for (int i = 0; i < input.length - 1; i++) {
                smallOutput[i] = input[i];
            }

            int output = input[input.length - 1] + sum(smallOutput);
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
        System.out.println(Solution.sum(input));
    }
}