package Day10;
/*
8 Wrapper Classes
 */
public class WrapperClasses {
    public static void main(String[] args) {
        int a=10;        //--> Primitive in Stack and it will store value in a
        Integer a1=10;   //--> Non-Primitive in Heap and it will store address but content printing due to toString() override
        System.out.println(a+" "+a1);
        a1=a;       //--> Autoboxing
        int x=156;
        Integer y=156;
        x=y;        //--> AutoUnboxing
        System.out.println(x==y);     //--> non primitive(wrapper class) and primitive compare then value is compared so true

        /*
        Cache concept in Byte,Short,Integer,Long (Cache to support the object identity semantics of autoboxing for values between -128 and 127
        (inclusive) as required by JLS. )
        -128 to 127 these values won't be made duplicate others won't be made inside the cache like 129, 167, -129
         */
        Integer c=16;
        Integer c1=16;
        Integer d=167;
        Integer d1=167;
        System.out.println(c==c1); //--> true as in cache and so no duplicate value, address comapred and got it same
        System.out.println(d==d1); //--> false not in cache outside it so duplicate made outside cache and address compared and is diff
    }
}
