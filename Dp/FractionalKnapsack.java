import java.io.*;
import java.util.*;
public class FractionalKnapsack {


  public static Scanner scn = new Scanner(System.in);

  public static void input(int [] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
  }
  
  public static class Item implements Comparable<Item>{
      int val;
      int wt;
      double ratio;
      
      //Constructor Function
      Item(int val,int wt,double ratio){
          this.val=val;
          this.wt=wt;
          this.ratio=ratio;
      }
      
      public int compareTo (Item o){
          if(this.ratio >o.ratio){
              return 1;
          }else if(this.ratio<o.ratio){
              return -1;
          }else{
              return 0;
          }
      }
      
      
  }

    public static void main(String[] args) throws Exception {
    int n = scn.nextInt();
    int [] vals = new int[n];
    int [] wts = new int[n];
    input(vals);
    input(wts);

    int cap = scn.nextInt();
    
    Item[] items=new Item[n];
    
    for(int i=0;i<n;i++){
        
        double r=(vals[i]*1.0)/wts[i];
        
        Item item=new Item(vals[i],wts[i],r);
    }
    
    Arrays.sort(items);
    
    double vib=0;
    int rc=cap;
    
    for(int i=n-1;i>=0;i--){
        if(items[i].wt<=rc){
            vib+=items[i].val;
            rc-=items[i].wt;
        }else{
            vib+=items[i].val*((double)rc/items[i].wt);
            rc=0;
            break;
        }
    }
    System.out.println(vib);

    }
}
    

