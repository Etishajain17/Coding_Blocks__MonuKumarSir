package ClassDays.Day14;

/*
Total moves --> 2**(Total plates/discs) +1

eg.3   8-1 = 7

 */
public class TowerOfHanoii {
    public static void printMoves(int n,String src,String hlp,String des) {
        if(n==0)
            return;
        printMoves(n-1,src,des,hlp);
        System.out.println("Move " +n+" th disc from "+src+" -to-> "+des);
        printMoves(n-1,hlp,src,des);
    }
    public static void main(String[] args) {
        int nop=3;
        String src="A";
        String hlp="B";
        String des="C";
        printMoves(nop,src,hlp,des);
    }
}
