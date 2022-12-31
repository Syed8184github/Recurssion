import java.text.DecimalFormat;
import java.util.Scanner;

public class GemotricSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double ans = geometric(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
    public static double geometric(int k){
        if(k==0){
            return 1;
        }
        double total = 1/Math.pow(2,k);
        total = total + geometric(--k);
        return total;
    }

}
