import java.util.Scanner;

public class Finder3 {
    public int findKth(int[] a,int n,int K){
        if(K<1||K>n||a==null){
            return 0;
        }

        return findKth1(a,n,K,0,n-1);
    }
    public static int findKth1(int[] a, int n, int K,int left,int right) {
        int par=partion(a,left,right);
        if(par+1==K){
            return a[par];
        }
        if(par+1>K){
          return findKth1(a,n,K,left,par-1);
        }else{
            return findKth1(a,n,K,par+1,right);
        }
    }
    public static int partion(int[] a, int low, int high) {
        int t=a[low];

        while(low<high){
            while(low<high&&a[high]>=t){
                high--;
            }
            if(low>high){
                break;
            }else{
                a[low]=a[high];//相遇
            }
            while((low<high)&&a[low]<=t){
                low++;
            }
            if(low>=high){
                break;
            }
            else{
                a[high]=a[low];
            }
        }
        a[low]=t;
        return low;
    }
    public static void quick(int[] a,int left,int right){
        if(left>=right){
            return;
        }
        int part=partion(a,left,right);
        quick(a,left,part-1);
        quick(a,part+1,right);
    }

    public static void main(String[] args) {
        Finder3 finder3 = new Finder3();
        int[] a = {1, 3, 5, 2, 2, 6, 8, 5, 7, 8, 9, 7, 5};
//      int k=finder3.findKth(a,a.length,6);
//        System.out.println(k);
//        System.out.println(finder3.findKth(a,a.length,6));
//
    }

}



