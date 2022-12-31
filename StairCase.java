import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        int staircase1 = count(n-1);
        int staircase2 = count(n-2);
        int staircase3 = count(n-3);
        return staircase1+staircase2+staircase3;
    }
}
