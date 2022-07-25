// 763. Partition Labels
// https://leetcode.com/problems/partition-labels/

// You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
// Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
// Return a list of integers representing the size of these parts.

// Example 1:

// Input: s = "ababcbacadefegdehijhklij"
// Output: [9,7,8]
// Explanation:
// The partition is "ababcbaca", "defegde", "hijhklij".
// This is a partition so that each letter appears in at most one part.
// A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.

import java.util.*;
public class LCPartionLabels {
    public List<Integer> partitionLabels(String s) {
        int map[]=new int[26];
        //filing the array with last occurance of the alphabet 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map[ch-'a']=i;
        }
        
        int start=0;
        int end=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //setting the last idx for partition
            end=Math.max(end,map[ch-'a']);
            
            if(i==end){
                int len=end-start+1;
                list.add(len);
                end=start=i+1;
            }
        }
        return list;
        
    }
    
}
