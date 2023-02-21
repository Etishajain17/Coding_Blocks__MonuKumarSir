package ClassDays.Day40;

import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Student[] arr=new Student[5];
        System.out.println(arr[0]);
        arr[0]=new Student("pappu",12);
        arr[1]=new Student("puppy",1);
        arr[2]=new Student("A",17);
        arr[3]=new Student("B",99);
        arr[4]=new Student("C",5);
        print(arr);
//        bubble(arr);
        print(arr);
        bubble(arr,new cc());
    }
    public static void print(Object[] arr){
        for (Object s:arr) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
//    public static<T extends Comparable<T>> void bubble(T[] arr){
//        for(int count=1;count<arr.length-1;count++) {
//            for (int i = 0; i <= arr.length - 2; i++) {
////                if (arr[i].age - arr[i + 1].age>0) {
//                if(arr[i].compareTo(arr[i+1])>0){
//                    T temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//    }
    static class cc implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
public static<T> void bubble(T[] arr, Comparator<T> obj){
    for(int count=1;count<arr.length-1;count++) {
        for (int i = 0; i <= arr.length - 2; i++) {
//                if (arr[i].age - arr[i + 1].age>0) {

            if(obj.compare(arr[i+1],arr[i])>0){
                T temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
}
