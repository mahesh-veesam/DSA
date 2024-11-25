import javax.management.RuntimeErrorException;

public class stackNotes{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
    }
}
// Stacks using arrays
class Stack{
    private int top = -1;
    private int[] arr = new int[100];

    public void push(int data){
        if (isFull()){
            throw new RuntimeException("Stack if Full!!");
        }
        top++;
        arr[top] = data;
        System.out.println(data);
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty!!");
        }
        int result = arr[top];
        top--;
        return result;
    }


    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top ==  1;
    }
    // public int size(){
    //     return arr.length;
    // }

    public void peek(){
        System.out.println(arr[top]);
    }

}