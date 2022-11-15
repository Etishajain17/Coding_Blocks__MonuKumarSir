package ClassDays.Day22;
/*
memory allocation -->  parsing --> constructor{we dn't have any block static or instance}

jvm has control of runing code .
jvm --> sees first RHS
compiler --> sees first LHS

 */

public --> anywhere
private --> within same class
default --> within same package
protected --> within same package but also in subclass of different package
public class StudentClient {
    public static void main(String[] args) {
        System.out.println("Hey");
        Student s=new Student("Etisha",19);

    }
}
