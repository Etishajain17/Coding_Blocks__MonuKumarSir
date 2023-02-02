package ClassDays.Day24;
/*
code likhte h too--> compiler (Sees and Run Acc. to left side)
run krte h too--> JVM (Sees and Run Acc. to right side)

           extends
        A    -->   B
    child         parent

 Student s   =   new Student();
 reference      instance/object


 --- In inheritance ---
 ref var  |   obj inst
 ---------------------
 P obj    |   new P();
 P obj    |   new C();
 C obj    |   new P();
 C obj    |   new C();


 In case whose data member not there aur not accessible use obj type casting
 In case of func whoesever new is done that is run
 If we have same func in parent and also in child i.e. we want to do some new func i.e method overriding


 Multilevel Inheritance

 A --> A , B , C , D
 |
 B --> B , C , D
 |
 C --> C , D
 |
 D --> D


 Multiple Inheritance
       A
     /  \
    B   C

  B,C has fun() their is confusion so not possible in java and achieved through interface only

  Method Overriding --> In different class and inheritance and child has same method as parent i.e. child class is overriding
  Method Overloading --> In same class but type of argument, no. of argument or order of argument changes

  ... for multiple argument in overloading

  By default,parent class of every class is object class


  In inheritance
  public --> anywhere
  private --> different class
  default --> can't be inherited and within package
  protected --> can be inherited and within package

  super() --> when parent have same method and child also and we want to call parent method in child
 */
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("...Inheritance...");
    }
}
