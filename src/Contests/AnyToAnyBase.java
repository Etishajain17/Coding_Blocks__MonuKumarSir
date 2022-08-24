package Contests;
/*
Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.

Constraints
  0 < N <= 1000000000

Sample Input
  8
  2
  33

Sample Output
  11011

Explanation
  All input output is as integers and in separate lines.
 */

/*
Output :- Convert one of the either(sb or db) base to 10 and then again convert to desired base.
Rule :- From base 5 to base 10
        div by destination base and multiply by source base.(one base should be 10 for this formula)
        so convert anyone to 10 if in case like 5 to 7
 */
import java.util.*;
public class AnyToAnyBase {
    public static int AnyToAny(int sb,int db,int sn){
        int mul=1,dn=0;
        while(sn>0){
            int rem=sn%db;
            dn+=rem*mul;
            sn/=db;
            mul*=sb;
        }
        return dn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int sn=sc.nextInt();
        int dn1=AnyToAny(sb,10,sn);
        int dn=AnyToAny(10,db,dn1);
        System.out.println(dn);
    }
}
