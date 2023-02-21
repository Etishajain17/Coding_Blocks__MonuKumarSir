package ClassDays.Day42;

import java.util.ArrayList;

public class GenericHeap<T extends Comparable<T>> {
    private ArrayList<T> list=new ArrayList<>();
    public void add(T item){
        list.add(item);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(isLarger(list.get(pi),list.get(ci))>0){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public void swap(int i,int j){
        T ith=list.get(i);
        T jth=list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public T remove(){
        swap(0,list.size()-1);
        T rv=list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }
    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<list.size() && isLarger(list.get(mini),list.get(lci))>0){
            mini=lci;
        }
        if(rci<list.size() && isLarger(list.get(mini),list.get(rci))>0){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public T min(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public void display(){
        System.out.println(list);
    }
    public int isLarger(T o1,T o2){
        return o1.compareTo(o2);
    }
}
