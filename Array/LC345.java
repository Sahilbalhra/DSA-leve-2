// https://leetcode.com/problems/reverse-vowels-of-a-string/

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

 

// Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"

public class LC345 {
    public void swap(int i, int j, char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public boolean isVowel(int j,char[] arr){
        if((arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u') || 
           (arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U')){
            return true;
        }else return false;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !isVowel(i, arr)){
                i++;
            }
            while(i<j && !isVowel(j, arr)){
                j--;
            }
            swap(i, j, arr);
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: arr){
            sb.append(ch);
        }
        return sb.toString();
    }
    
}
