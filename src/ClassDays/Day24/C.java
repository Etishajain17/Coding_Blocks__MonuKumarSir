package ClassDays.Day24;

public class C extends P{
    int d=2;
    int d2=20;

    @Override                          //ensures override if we don spell mistake like Fun it will show error
    public void fun(){
        System.out.println("fun in C");
    }

    public void fun2(){
        System.out.println("fun2 in C");
    }
}
