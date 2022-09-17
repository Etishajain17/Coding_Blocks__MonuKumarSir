package ClassDays.Day8;
//String immutable--> content will change but not on same location first it will copy on new location and then concat at new location
public class Strings {
    public static void main(String[] args) {
        String s="Hello";
        String s1=new String("Hello");
        String s2="Hello";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s==s1);
        System.out.println(s==s2);
        String s4="Hello"+"Bye";
        String s5="Hello"+"Bye";
        String s6="Hello".concat("Bye");
        String s7="Hello".concat("Bye");
        s=s+"Bye";
        System.out.println(s4==s5);
        System.out.println(s4==s);
        System.out.println(s6==s7);

        String str="Helloheyokaybye";
        System.out.println();
    }
}
