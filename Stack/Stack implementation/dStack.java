/**
 * dStack
 */
public class dStack {

    
        private int [] st;
        private int size;
        private int tos;
        
    dStack(){
        setval(10);    }
    dStack(int n){
        setval(10);
   }
   dStack(int[] arr){
    st= arr;
    this.size = arr.length;
    this.tos = arr.length-1;
}

public void setval(int n){
    this.size = 0;
    this.tos = -1;
    this.st = new int [n];
}

public int size(){
    return this.size;
}
   public boolean isEmpty(){
       return this.size ==0;
   }
    public void push(int val){
        if(this.st.length==this.size){
            int temp [] = new int[this.size+10];
            int i =0;
            for(int ele: st){
                 temp[i++]= ele;   
            }
            st = temp;
            push(val);
        }else{
            this.st[++this.tos]= val;
            this.size++;
        }

    }
    private int pop_(){
        this.size--;
        return st[tos--];
    }
    public int pop()throws Exception{
        if(this.size==0){
            throw new Exception("EmptyStack");
        }else{
           return pop_();
        }
    }

    
    
}