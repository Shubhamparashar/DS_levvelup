/**
 * questions
 */
import java.util.Stack;
public class questions {
public static void main(String[] args) {
    solve();
}
public static void solve(){

}
class pair{
    int idx;
    int val;
    pair(int idx, int val){
        this.idx = idx;
        this.val = val;
    }
}

public static int[] ngor(int [] arr){
    int ans[] = new int[arr.length];
    Stack<pair> st = new Stack<>();
    for(int i =0; i<arr.length;i++){
        if(st.size()==0){
            st.push(new pair(i, arr[i]));

        }else{

        }
    }
    return ans;
}

}