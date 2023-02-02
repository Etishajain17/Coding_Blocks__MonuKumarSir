package ClassDays.Day23;
/*
Array --> linear,contiguous
Stack --> LIFO, insertion and deletion from one end only i.e top
we click on other page it gets stored in stack and get back

push --> insertion
pop --> deletion
peek --> see top element
isEmpty , size , isFull, display

Size is not changeable
so use arraylist
just need to modify push and pop
 */
public class Stack {
    protected int[] arr;
    private int top;

    public Stack() {
        arr=new int[5];
        top=-1;
    }

    public Stack(int n) {
        arr=new int[n];
        top=-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == arr.length-1;
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Bklol Stack full hai");
        }
        top++;
        arr[top] = item;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Bklol Stack Khali hai");
        }
        int rv = arr[top];
        top--;
        return rv;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Bklol Stack Khali hai");
        }
        int rv=arr[top];
        return rv;
    }

    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int size(){
        return top+1;
    }
}
