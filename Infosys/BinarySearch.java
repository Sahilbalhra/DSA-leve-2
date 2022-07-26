public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]>k){
                j=mid-1;
            }else{
                i=mid+1;
            }
            
        }
        return -1;
        
    }
} 
