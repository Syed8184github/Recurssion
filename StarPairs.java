import java.util.Scanner;

public class StarPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(addStars(s));
    }
    public static String addStars(String s){
        if(s.length()==1){
            return s;
        }
        String smallAns = addStars(s.substring(1));
        if(s.charAt(0)==smallAns.charAt(0))
            return s.charAt(0)+"*"+smallAns;
        return s.charAt(0)+smallAns;
    }
}
