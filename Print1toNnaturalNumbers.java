import java.util.*;
public class Print1toNnaturalNumbers {
    public static void print1ton(int n){
        if(n==0){
            return;
        }
        print1ton(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        print1ton(n);

    }
}
