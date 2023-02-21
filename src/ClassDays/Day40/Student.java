package ClassDays.Day40;

public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String s,int i){
        name=s;
        age=i;
    }

    @Override
    public String toString() {
        return "[" + name +
                "," + age +
                ']';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
