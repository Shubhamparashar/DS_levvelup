import java.util.*;
import java.lang.*;
import java.io.*;


public class gfg {
	public static void main (String[] args) {
	//  Scanner scn = new Scanner(System.in);
	//  int t = scn.nextInt();
	//  for(int j=0; j<t;j++){
	//      int r=scn.nextInt();
	//      int c = scn.nextInt();
	//      int mine[][] = new int[r][c];
	//      for(int i =0; i<r; i++){
	//          for(int k =0; k<c;k++){
	             
	//              mine[i][j] = scn.nextInt();
	             
	//          }
	//      }
	//      int max =0;
	//        for(int i =0; i<r; i++){
	//        max = Math.max(max, maxgold(mine, i, 0));
	//        }
	//        System.out.println(max);
    //  }
    //  scn.close();
    solve();
    }
    static void solve(){
        int min[][] = {
            {1, 3, 3},
            {2, 1, 4 },
            {0, 6, 4}
        };
        // int max
        for(int i =0; i<3; i++){
            //        max = Math.max(max, maxgold(mine, i, 0));
            print(maxgold(min, i, 0));
                  }
        
    }
	public static int maxgold(int[][]m, int i, int j){
	    if(j==m[0].length-1&& (i<m.length && i>=0))return m[i][j];
	    if(j>=m[0].length || i>=m.length || i<0)return 0;
	    int f = maxgold(m, i, j+1);
	    int u = maxgold(m, i-1, j+1);
	    int d = maxgold(m, i+1, j+1);
	    return m[i][j]+ Math.max(f,Math.max(u, d));
	    
	}
}

