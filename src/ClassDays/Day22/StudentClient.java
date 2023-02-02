package ClassDays.Day22;
/*
memory allocation -->  parsing --> constructor{we dn't have any block static or instance}

jvm has control of runing code .
jvm --> sees first RHS
compiler --> sees first LHS

 */

class StudentClient{
    public static void main(String[] args) throws Exception{
        System.out.println("Hey");
        Student s=new Student("Etisha",19);
//        System.out.println(s.name);
//        s.setAge(-90);                  //gnerate exception
//        s.setAge(90);
        System.out.println(s.getAge());

    }
}
