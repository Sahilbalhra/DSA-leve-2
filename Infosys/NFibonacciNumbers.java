public class NFibonacciNumbers {
    public static long[] printFibb(int n) 
    {
        //Your code here
        long A[]= new long[n];
         if(n>1)
      {
       A[0]=1;
       A[1]=1;
       
       for(int i=2;i<n;i++){
           A[i]=A[i-1]+A[i-2];
          }
      }
      else {
          A[0]=1;
         }
        return A;
    }
    
}
