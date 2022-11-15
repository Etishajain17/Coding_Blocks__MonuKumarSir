package ClassDays.Day22;

/*
this whenever we need to use data members if not then local variable will be used.
 */
public class Person {
    int age;                     //data members or instance variable
    String name;
    static int count=0;

    public void intro_yourSelf(){              //function
        System.out.println("My name is "+ this.name +" and age is "+ this.age);
    }

    public void sayHey(String name){
        System.out.println(name+" Say Hey "+ this.name);
    }

    public static void fun(){
        System.out.println("I am in Fun.");
    }

    static{                         //static block everything written inside it runs first whenever class loads
        System.out.println("In static");
    }
}


