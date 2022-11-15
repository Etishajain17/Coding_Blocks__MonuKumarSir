package ClassDays.Day22;

public class Student {
    int age=19;
    String name="Kunal";

//    public Student(){             default constructor
//
//    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void intro_yourSelf(){
        System.out.println("My name is "+ this.name +" and age is "+ this.age);
    }

    public void sayHey(String name){
        System.out.println(name+" Say Hey "+ this.name);
    }

}
