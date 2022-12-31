public class CheckArraySortedorNot {
    public static boolean isSortedBetter(int a[],int si){
        if(si==a.length-1){
            return true;
        }
        if(a[si]>a[si+1]){
            return false;
        }
        boolean isSmallArraySorted=isSortedBetter(a,si+1);
        return true;
    }
    public static void main(String[] args) {
        int si = 3;
        int[] arr = {1,3,6,8,5,6};
        isSortedBetter(arr,si);
    }
}
