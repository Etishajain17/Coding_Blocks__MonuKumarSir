package ClassDays.Day24;

public class Client {
    public static void main(String[] args) {
        //Case1
//        P obj=new P();
//        System.out.println(obj.d);//1
//        System.out.println(obj.d1);//10
//        obj.fun();
//        obj.fun1();



        //Case2
//        P obj=new C();
//        System.out.println(obj.d);//1
//        System.out.println(obj.d1);//10
//        System.out.println(obj.d2); //error not accessible
//        System.out.println(((C)(obj)).d2); //20
//        System.out.println(((C)(obj)).d); //2
//        obj.fun();    // fun in C   //compile time -> P , run time -> C
//        obj.fun1();   // fun1 in P
//        ((C)(obj)).fun2();   //fun2 in C
        // fun in P can't be accessed



        //Case3 not allowed
//        C obj=new P();
//        System.out.println(obj.d);    //accessible
//        System.out.println(obj.d1);   //accessible
//        System.out.println(obj.d2);   //accessible



        //Case4
        C obj=new C();
        System.out.println(obj.d); //2
        System.out.println(obj.d1); //10
        System.out.println(obj.d2); //20
        System.out.println(((P)(obj)).d); //1
        obj.fun(); //fun in C
        obj.fun1(); //fun1 in P
        obj.fun2(); //fun2 in C
//        ((P)(obj)).fun(); //compile time--> fun in P , runtime --> fun in C
    }
}
