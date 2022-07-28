import java.util.Scanner;

public class NumberGenrater {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<=n;i++){
            if(i%2==0){
                //even
                 arr[i]=arr[i/2];
            }else{
                //odd
                int t=i/2;
                arr[i]=arr[t]+arr[t+1];
              
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        scn.close();
    }
    
}
