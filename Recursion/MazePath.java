import java.util.*;
class MazePath{
    public static void mazePath(int sr,int sc,int dr,int dc,String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return ;
        }
        //horizontal
        if(sc+1<=dc){
            mazePath(sr, sc+1, dr, dc, psf+"h");
        }
        //vertical
        if(sr+1<=dr){
            mazePath(sr+1, sc, dr, dc, psf+"v");
        }


    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        mazePath(0,0,n-1,m-1," ");
        scn.close();
    }
}