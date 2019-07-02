import java.util.Scanner;

public class AntiOrder1 {
    Node node = null;

    public int count(int[] A, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += count1(A[i]);
        }
        return result;
    }

    public int count1(int n) {
        if (this.node == null) {
            node = new Node(n);
            return 0;
        }
        node.put(n);
        return node.getCount(n);
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        while (scan.hasNextInt()) {
//
//            int[] A = new int[n];
//            for (int i = 0; i < n; i++) {
//                A[i] = scan.nextInt();
        int[] A={1,2,3,4,5,6,7,0};
        int n=8;
                AntiOrder1 antiOrder = new AntiOrder1();
                System.out.println(antiOrder.count(A, n));
            }
        }


class Node{
    int value;
    int leftSize=0;     //比当前value大的节点数
    Node left,right;
    public Node(int value){
        this.value=value;
    }
    public void put(int value1){   //比自己大的节点数放到前面, leftSize++
        if(value1>this.value){
            if(left!=null){
                left.put(value1);
            }else{
                left=new Node(value1);
            }
            leftSize++;
        }
        else{
            if(right!=null){
                right.put(value1);  //调用右面节点的排序
            }else{
                right=new Node(value1);
            }
        }

    }
    public int getCount(int value2){ //获取比自己大的节点数
        if(value2==this.value){
            return leftSize;
        }
        else if(value2>this.value){
            return left.getCount(value2);
        }else{
            return  leftSize+1+right.getCount(value2);
        }
    }
}