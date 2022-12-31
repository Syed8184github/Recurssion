import java.util.Scanner;
public class Power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and power");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}
