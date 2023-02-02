package Contests.Contest6_LinkedList;
//
//import java.util.*;
//public class Main {
//    class Node{
//        int data;
//        Node next;
//    }
//    Node head;
//    Node tail;
//    int size;
//    public void addLast(int item){
//        Node nn=new Node();
//        nn.data=item;
//        if(size==0){
//            head=tail=nn;
//        }
//        else{
//            tail.next=nn;
//            tail=nn;
//        }
//        size++;
//    }
//
//    public void ans() {
//        Main l1=new Main();
//        Main l2=new Main();
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        for(int i=0;i<a;i++){
//            l1.addLast(sc.nextInt());
//        }
//        for(int i=0;i<b;i++){
//            l2.addLast(sc.nextInt());
//        }
//        Node temp1=l1.head;
//        Node temp2=l2.head;
//        int x=0;
//        while(temp1!=null){
//            x=x*10+temp1.data;
//            temp1=temp1.next;
//        }
//        int y=0;
//        while(temp2!=null){
//            y=y*10+temp2.data;
//            temp2=temp2.next;
//        }
//        int z=x+y;
//        Main ll=new Main();
//        int count=0;
//        while(z>0) {
//            count++;
//            z /= 10;
//        }
//        z=x+y;
//        while(z>0){
//            System.out.println(z);
//            int r=z/((int)(Math.pow(10,count-1)));
//            System.out.println(r);
//            ll.addLast(r);
//            z-=(int)(Math.pow(10,count-1))*r;
//            count--;
//        }
//        Node temp=ll.head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    public static void main(String[] args){
//        Main m=new Main();
//        m.ans();
//    }
//}
import java.util.*;
public class Main {
    class Node{
        int data;
        Node next;
    }
    Node head;
    Node tail;
    int size;
    public void addLast(int item){
        Node nn=new Node();
        nn.data=item;
        if(size == 0){
            head=tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
        size++;
    }
    public void Solution() {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n1=sc.nextInt();
            Main l1=new Main();
            while(n1-->0){
                l1.addLast(sc.nextInt());
            }
            int n2=sc.nextInt();
            Main l2=new Main();
            while(n2-->0){
                l2.addLast(sc.nextInt());
            }
            Node h1=l1.head;
            Node h2=l2.head;
            Node temp=new Node();
            Node ans=temp;
            while(h1!=null && h2!=null){
                Node n=new Node();
                if(h1.data<h2.data){
                    n.data=h1.data;
                    h1=h1.next;
                }else{
                    n.data=h2.data;
                    h2=h2.next;
                }
                temp.next=n;
                temp=temp.next;
            }

            if(h1!=null)
                temp.next=h1;
            else
                temp.next=h2;
            ans=ans.next;
            while(ans!=null){
                System.out.print(ans.data+" ");
                ans=ans.next;
            }
        }
    }
    public static void main(String[] args){
        Main m=new Main();
        m.Solution();
    }
}