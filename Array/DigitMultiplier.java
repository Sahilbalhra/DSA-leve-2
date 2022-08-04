// Digit multiplier
// https://practice.geeksforgeeks.org/problems/digit-multiplier3000/1


// Given a positive integer N, find the smallest number S such that the product of all the digits of S is equal to the number N. If there's no such number, Print "-1".
// Example 1:

// Input:
// N = 100
// Output:
// 455
// Explanation:
// 4*5*5 = 100. There are no numbers
// less than 455 with the product of
// it's digit as 100.
// Example 2:

// Input:
// N = 26
// Output:
// -1
// Explanation:
// There are no numbers which can form
// a product of 26 with its digits.



public class DigitMultiplier {
    static String getSmallest(Long N) {
        // code here
        StringBuilder sb=new StringBuilder();
       //smaller then the or equal to 9 
        if(N < 10){
            return N+""; 
        }
        
        //N greater then 9
        for(int div=9;div>1;div--){
            while(N%div==0){
                N=N/div;
                sb.append(div);
            }
        }
        //count  be divided and left equal or greater then 10
        if(N>=10){
            return -1+""; 
        }
        
        return sb.reverse().toString();
    }
    
}
