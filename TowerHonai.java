public class TowerHonai {
    public static void towerHonai(int n,char s,char h,char d){
        if(n==1){
            System.out.println("move 1st disk from"+s+" to "+d);
            return;
        }
        towerHonai(n-1,s,d,h);
        System.out.println("move "+n+"th disk from"+s+" to "+d);
        towerHonai(n-1,h,s,d);

    }

    public static void main(String[] args) {
        towerHonai(2,'a','b','h');
    }
}
