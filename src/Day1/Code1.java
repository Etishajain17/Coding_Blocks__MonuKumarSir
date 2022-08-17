package Day1;

public class Code1 {
    public static void main(String[] args) {
        System.out.println("Hlo");
        System.out.print("Hlo");
        System.out.print("sir");
        System.out.println("Bye");
        //-2 % 5 =-2
        //positive remainder of(-2%5) --> -2+5 =3

        int x=9;
        System.out.println(x++);
        System.out.println(x);

        int y=x + x++ +8 + x + x--;
        System.out.println(y);
        System.out.println(--x);

        int p=11+ x++ + x + --x + x-- +7 + x +1;
        System.out.println(p);
    }
}
