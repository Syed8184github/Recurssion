import java.util.*;
public class SumOfNNaturalNumbers {
    public static int sumn(int n ){
        if(n==0){
            return 0;
        }
        int smallOutput = sumn(n-1);
        int result = n+smallOutput;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto where you required sum:");
        int n = sc.nextInt();
        System.out.println("The sum of "+n+" natural number is"+" "+sumn(n));
    }
}
