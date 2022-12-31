import java.util.*;
public class NumberOfDigits {
    public static int digit(int n){
        if(n==0){
            return 0;
        }
        int smallOutput = digit(n/10);
        int count = smallOutput+1;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        System.out.println(digit(n));
    }
}
