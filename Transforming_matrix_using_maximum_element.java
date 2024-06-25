import java.util.*;
public class Transforming_matrix_using_maximum_element{
    static void print(int[] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your Array:");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        System.out.println("Entered Element is:");
        print(arr);
        int index=-1;
        for(int round=0;round<n;round++){
            int max=arr[0];
            for(int i=0;i<n;i++)
                if(arr[i]>=max){
                    index=i;
                    max=arr[i];
                }
            arr[index]=Integer.MIN_VALUE+round;
        }
        for(int i=0;i<n;i++){
            arr[i]-=Integer.MIN_VALUE;
            arr[i]=n-1-arr[i];
        }
        System.out.println("Transformed Array is:");
        print(arr);
    }
}
