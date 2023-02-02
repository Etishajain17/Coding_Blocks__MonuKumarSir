package ClassDays.Day23;
/*
queue --> FIFO

enqueue --> from rear
dequeue --> from front
getFront, isEmpty , isFull , size  , display

lang package by default imported and it has Exception so no need to import

Size is not changeable
so use arraylist
just need to modify push and pop
 */

/*
Circular Queue
 */
public class Queue {
    protected int[] arr;
    protected int front=0;
    protected int size=0;
    public Queue(){
        arr=new int[5];
    }
    public Queue(int n){
        arr=new int[n];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==arr.length;
    }

    public void enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue Full hai");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Khali hai");
        }
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }

    public int getFront(){
        int rv=arr[front];
        return rv;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            int idx=(front + i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
