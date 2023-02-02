package ClassDays.Day24;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,1,7));
        System.out.println(add(5,7,9.8f));
        System.out.println(add(1,2,3,4,5,6,7,8));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b,int c){
        return a+b+c;
    }

    public static int add(int a, int b,float c){
        return (int)(a+b+c);
    }

//    public static int add(int ...a){
//        int sum=0;
//        for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//        }
//        return sum;
//    }

//    public static int add(int ...a,float ...a){}  //not allowed

    public static int add(int x,int ...a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

//    public static int add(int ..a,int x){}  //not allowed
}
