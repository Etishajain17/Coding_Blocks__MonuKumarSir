package ClassDays.Day22;

/*
All dependent class blueprint comes in heap and then p allocated in stack .
Static field called inside in non-static field but not vice versa.
 */

public class PersonClient {
    public static void main(String[] args) {
        System.out.println("Hello");
        Person p=new Person();                       //same package so visible  p--> reference variable
                                                    // new Person() --> object or instance
        System.out.println(p.name);
        System.out.println(p.age);
        p.name="Kaju";
        p.age=21;
        p.intro_yourSelf();

        Person p1=new Person();
        p1.name="Kamlesh";
        p1.age=18;
        p1.intro_yourSelf();                         // first this goes to this and then get recognised through that which
                                                     // object calling
        p1.sayHey("Ram");
        System.out.println(p1.count);
        Person.count+=21;
        System.out.println();
    }
}
