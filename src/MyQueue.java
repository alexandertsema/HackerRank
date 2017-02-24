import java.util.Stack;

/**
 * Created by Alex on 2/22/2017.
 */
public class MyQueue<T> {
    public MyQueue() {
    }

    private int size;
    private Stack<T> inbox = new Stack<T>();
    private Stack<T> outbox = new Stack<T>();

    public T peek(){
        if (inbox.size() == 1){
            return inbox.peek();
        }
        return null;
    }

    public T dequeue(){
        if (inbox.size() == 1){
            return inbox.pop();
        }
        else {
            int size = outbox.size();
            for (int i = 0; i < size; i++) {
                inbox.push(outbox.pop());
            }
            return inbox.pop();
        }
    }

    public void enqueue(T element){
        if (inbox.empty()){
            inbox.push(element);
        }
        else if (inbox.size() == 1){
            outbox.push(element);
        }
    }
}
