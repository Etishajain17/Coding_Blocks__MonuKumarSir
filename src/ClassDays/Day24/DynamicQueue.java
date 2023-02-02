package ClassDays.Day24;

import ClassDays.Day23.Queue;

public class DynamicQueue extends Queue {


    @Override
    public void enqueue(int item) throws Exception{
        if(isFull()){
            int[] a=new int[2*arr.length];
            for (int i = 0; i < size; i++) {
                int idx=(front + i)%arr.length;
                a[i]=arr[idx];
            }
            arr=a;
            front=0;
        }
        super.enqueue(item);
    }

    public static void main(String[] args) throws Exception{
        DynamicQueue dq=new DynamicQueue();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueue(40);
        dq.enqueue(50);
        dq.enqueue(60);
        dq.display();
    }
}
