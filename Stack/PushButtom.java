import java.util.Stack;

public class PushButtom {
    public static void  pushButtom(Stack<Integer> st,int data){
        if(st.empty()){
            st.push(data);
            return;
        }
        int top=st.pop();
        pushButtom(st, data);
        st.push(top);
       
    }
    public static void main(String[] args) {
        Stack<Integer> obj=new Stack<>();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        pushButtom(obj, 5);
        while(!obj.empty()){
            System.out.println(obj.peek());
            obj.pop();
        }

    }
}
