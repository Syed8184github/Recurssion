public class MergeSort {
    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }else{
                 c[k]=b[j];
                 j++;
            }
            k++;
        }
        while (i< a.length){
            c[k]=a[i];
            i++;
        }
        while(j< b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int[] a = new int[arr.length/2];
        int[] b = new int[arr.length-a.length];
        for(int i =0;i< arr.length/2;i++){
            a[i]=arr[i];
        }
        for(int i= arr.length/2; i< arr.length;i++){
            b[i- arr.length/2]=arr[i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,8,2,10,6,9,5,1,7};
        mergeSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
