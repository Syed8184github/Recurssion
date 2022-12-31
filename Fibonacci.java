import java.util.*;
public class Fibonacci {
    public static int fibonaccii(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int fib_n_1 = fibonaccii(n-1);
        int fib_n_2 = fibonaccii(n-2);
        int output = fib_n_1+fib_n_2;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The fibonacci number of "+n+"th number is "+fibonaccii(n));
    }
}
