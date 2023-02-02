package ClassDays.Day29;

public class LinkedList{
    private class Node{
        int val;
        Node next;

    }
    private Node head;
    private Node tail;
    private int size;

    //O(1)
    public void addFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }

        //O(1)
    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;            //tail helping in this as we dont need to traverse to add at last by maintatining tail pointer
            size++;
        }
    }

        //O(n)
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.next;
        }
        System.out.println(".");
    }

        //O(n)
        public void addAtIndex(int item,int k) throws Exception{
            if(k<0 || k>size){
                throw new Exception("Baklol k out of range hai ");
            }
            if(k==0){
                addFirst(item);
            }
            else if(k==size){
                addLast(item);
            }
            else{
                Node k_1th=getNode(k-1);
                Node nn=new Node();
                nn.val=item;
                nn.next=k_1th.next;
                k_1th.next=nn;
                size++;

            }
        }

        //O(n)
    private Node getNode(int k){
        Node temp=head;
        for (int i = 1; i <=k ; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getAtIndex(int k) throws Exception{
        return getNode(k).val;
    }

    //O(1)
    public int removeFirst(){
        Node temp=head;         //for because if we dont remove the next pointer from old head it would be there in memory and garbage
                                // collector wont take it.
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        else{
            head=head.next;
            temp.next=null;
            size--;
        }
        return temp.val;
    }

    //O(n)
    public int removeLast() throws Exception{
        if(size==1){
            return removeFirst();
        }
        else{
            Node ss=getNode(size-2);
            int rv=tail.val;
            tail=ss;
            tail.next=null;
            size--;
            return rv;
        }
    }

    public int removeAtIndex(int k) throws Exception{
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node prev=getNode(k-1);
            Node curr=prev.next;
            prev.next=curr.next;
            curr.next=null;              //to remove from memory and give to gb collector
            size--;
            return curr.val;
        }
    }
}
