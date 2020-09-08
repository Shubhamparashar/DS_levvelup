import java.util.*;

public class l001 {

    public static void main(String[] args) {
        solve();
    }
    public static void print(int val){
        System.out.print(val+" ");
    }
    public static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void print(int arr[][]){
        for(int []ar: arr){
            print(ar);
        }
    }

    public static int hv(int n, int m){
        if(n<0|| m<0)return 0;
        if(n==0 && m==0)return 1;
        int h = hv(n, m-1);
        int v = hv(n-1, m);
        return h+v;
    }
    public static int hvd(int n, int m){
        if(n<0|| m<0)return 0;
        if(n==0 && m==0)return 1;
        int h = hvd(n, m-1);
        int v = hvd(n-1, m);
        int d = hvd(n-1, m-1);
        return h+v+d;
    }
    public static int hvd_manymoves(int n, int m){
        if(n<0|| m<0)return 0;
        if(n==0 && m==0)return 1;
        int h = 0, v=0, d=0;
        for(int i =1; i<m&& m-i>=0;i++){
            h += hvd_manymoves(n, m-i);
        }
        for(int i =0; i<n&& n-i>=0;i++)
        v = hvd_manymoves(n-i, m);

        for(int i =0; i<n&& n-i>=0 && m-i>=0;i++)
        d = hvd_manymoves(n-i, m-i);
    
        return h+v+d;
    }
    
    public static int boardpath(int si, int ei, int[] t){
    if(si==ei)return t[si] =1;
    if(t[si]!=0)return t[si];
    int count=0;
    for(int i =1; i<=6&& si+i<=ei;i++){
    count+=boardpath(si+i, ei, t);
    }
    return t[si] =count;
}

public static int boardpath_dp(int si, int ei){
int[] dp = new int[ei+1];
for(si = ei; si>=0;si--)
{    if(si==ei){
    dp[si]= 1;
    continue;
}
    // if(t[si]!=0)return t[si];
    int count=0;
    for(int i =1; i<=6&& si+i<=ei;i++){
    count+=dp[si+i];
    }
    dp[si] =count;}
    return dp[0];
}

public static int boardpath_optimize(int si, int ei){
    Deque<Integer> q = new ArrayDeque();
    q.add(1);
    for( si = ei; si>=1;si--){
        if(q.size()<=6){
            if(q.size()==1){
                q.add(1);
                continue;
            }
         int ele =q.getFirst();
         q.addFirst(ele*2);
        }else{
            // for(int n: q){
            // print(n);
            // }
            int last = q.removeLast();
            int ele =q.getFirst();
         q.addFirst((ele*2)-last);
        }

    }
    return q.getFirst();
    }

public static int maxgold(int[][]m, int i, int j){
    if(j>=m[0].length || i>=m.length || i<0)return 0;
if(j==m[0].length-1&& (i<m.length && i>=0))return m[i][j];
int f = maxgold(m, i, j+1);
int u = maxgold(m, i-1, j+1);
int d = maxgold(m, i+1, j+1);
return m[i][j]+ Math.max(f,Math.max(u, d));

}

public static int pair(int n, int [] t){
    if(n<=1)return t[n]= 1;
    if(t[n]!=0)return t[n];
    return t[n] =pair(n-1, t)+pair(n-2, t)*(n-1);
    
}
public static int countpartition(int n, int k){

    return 0;
}

public static void solve(){
    // int t[] = new int [11];
// System.out.println(boardpath(0, 10, t));
// System.out.println(boardpath_dp(0, 10));
// System.out.println(boardpath_optimize(0, 10));
int min[][] = {
    {1, 2},
    {3, 4}
};
int max =0;
for(int i =0; i<2; i++){
           max = Math.max(max, maxgold(min, i, 0));
    // print(maxgold(min, i, 0));
          }
          print(max);
// int n =5;
// print(pair(n, new int[n+1]));
}


// print(t);
}
