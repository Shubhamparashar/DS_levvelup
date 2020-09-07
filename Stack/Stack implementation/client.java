/**
 * client
 */
// import java.util.Random;
public class client {

public static void main(String[] args) throws Exception {
        solve();
    }
    public static void solve(){
        dStack st = new dStack();
        for(int i=0; i<10;i++){
            int a =(int) (Math.random())*100;
            st.push(a);
        }
    }
}