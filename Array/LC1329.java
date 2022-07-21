// https://leetcode.com/problems/sort-the-matrix-diagonally/

// 1329. Sort the Matrix Diagonally

// A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

// Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.

 

// Example 1:


// Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
// Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]

public class LC1329 {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
   int m=mat[0].length;
 
    
   for(int g=0;g<m;g++){
      ArrayList<Integer> al = new ArrayList<>();
       for(int i=0,j=g;j<m&&i<n;j++,i++){
      
             al.add(mat[i][j]);
           
       }
       Collections.sort(al);
       int k=0;
       for(int i=0,j=g;j<m&&i<n;j++,i++){
      
            mat[i][j]= al.get(k);
           k++;
           
       }
       
     
   } 
     for(int g=1;g<n;g++){
          ArrayList<Integer> al = new ArrayList<>();
        int k=0;
           for(int i=g,j=0;j<m&&i<n;j++,i++){
      
             al.add(mat[i][j]);
           
       }
         Collections.sort(al);
       for(int i=g,j=0;j<m&&i<n;j++,i++){
      
            mat[i][j]= al.get(k);
           k++;
           
       }
   }
    return mat;
        
    }
    public int[][] diagonalSort2(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 int gap=i-j;
                
                if(map.containsKey(gap)==false){
                    map.put(gap,new PriorityQueue<>());
                }
                
                map.get(gap).add(mat[i][j]);
             
            }
        }
        
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 int gap=i-j;
                
               mat[i][j]=map.get(gap).remove();
                }
             
            }
        return mat;
    
        
    }
}
