import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZeros(n));
    }
    public static int countZeros(int n){
        if(n<10){
            if(n==0)
                return 1;
            else
                return 0;
        }
        int smallAns = countZeros(n/10);
        if(n%10==0)
            smallAns = 1+smallAns;
        return smallAns;
    }
}
