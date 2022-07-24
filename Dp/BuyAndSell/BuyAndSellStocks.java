// Buy And Sell Stocks - One Transaction Allowed

// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed a single transaction.

// Sample Input
// 9
// 11
// 6
// 7
// 19
// 4
// 1
// 6
// 18
// 4
// Sample Output
// 17

package BuyAndSell;
import java.util.*;
public class BuyAndSellStocks {
    public static Scanner scn=new Scanner(System.in);
    
    public static void input(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        
        int n=scn.nextInt();
        int []prices=new int[n];
        input(prices);
        
       int leastPrice=Integer.MAX_VALUE;
       int overallProfit=0;
       int profitOfTheDay=0;
       
       for(int p=0;p<n;p++){
           
           if(prices[p]<leastPrice){
               leastPrice=prices[p];
           }
           profitOfTheDay=prices[p]-leastPrice;
           if(profitOfTheDay>overallProfit){
               overallProfit=profitOfTheDay;
               
           }
       }
       
       System.out.println(overallProfit);
        
    }
}
