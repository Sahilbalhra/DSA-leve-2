// 556. Next Greater Element III
// https://leetcode.com/problems/next-greater-element-iii/

// Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

// Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

 

// Example 1:

// Input: n = 12
// Output: 21
public class LC556 {
    public void swap(char [] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    
    public int nextGreaterElement(int n) {
        char [] arr=(n+ "").toCharArray();
        
        int i=arr.length-1;
        
        //finding the 1st smaller number
        
        while(i>0){
            if(arr[i-1]>=arr[i]){
              i--;
            }
            else{
                break;
            }
        }
        //koai  bhi greater number h hi nhi
        if(i==0){
            return -1;
        }
        
        int idx1=i-1;
        
        int j=arr.length-1;
        //finding the greater number then the smaller number in step 1
        while(j>idx1){
            if(arr[j]>arr[idx1]){
                break;
            }
            j--;
        }
        
        //swap
        swap(arr,idx1,j);
      
        
        //reverse from  end to i
        
        int left=i;
        int right=arr.length -1;
        while(left <right){
            swap(arr,left,right);
            left++;
            right--;
            
        }
        
        String ans=new String(arr);
        long val=Long.parseLong(ans);
        return (val>Integer.MAX_VALUE?-1:(int)val); 
        
        
        
    }

}