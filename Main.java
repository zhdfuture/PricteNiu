import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void getResult(int[] array,int n){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n/2;i++){
        list.add(array[i]);
        list.add(array[i+n/2]);
    }
    for(int i=0;i<n;i++){
        array[i]=list.get(i);
    }
    }
    public void Squeue(){
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
            int n=scan.nextInt();
            int k=scan.nextInt();
            int[] array=new int[2*n];
            for(int j=0;j<2*n;j++){
                array[j]=scan.nextInt();
            }
            for(int t=0;t<k;t++){   //翻转的次数
                getResult(array,array.length);
            }
            for(int p=0;p<n*2-1;p++){
                System.out.print(array[p]+" ");
            }
            System.out.println(array[n*2-1]);
        }
    }

    public static void main(String[] args) {

        Main main=new  Main();
        main.Squeue();

    }
}
