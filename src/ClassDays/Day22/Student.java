package ClassDays.Day22;

public class Student {
    private int age=19;
    private String name="Kunal";

//    public Student(){             default constructor
//
//    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) throws Exception{                 //throws tells function might have exception
//        if(age<0) {
//           throw new Exception("Bklol -ve age nhi hota hai");      //exception generate
//        }
//        this.age = age;
//    }

    public void setAge(int age) throws Exception{
        try{                                                               //exception generate
            if(age<0) {
                throw new Exception("Bklol -ve age nhi hota hai");
            }
            this.age = age;
        }catch (Exception e){                                             //exception solution
            e.printStackTrace();
        }finally {
            System.out.println("I am in final");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void intro_yourSelf(){
        System.out.println("My name is "+ this.name +" and age is "+ this.age);
    }

    public void sayHey(String name){
        System.out.println(name+" Say Hey "+ this.name);
    }

}
