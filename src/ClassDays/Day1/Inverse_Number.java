
/*      Assume that for a number of n digits, the value of each digit is from 1 to n and is unique.
        E.g. 32145 is a valid input number.
        Write a function that returns its inverse, where inverse is defined as follows
        Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145,
        “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
        Print the value returned.       */

package ClassDays.Day1;

import java.util.*;
public class Inverse_Number {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=0,i=1;
            while(x>0){
                int n=x%10;
                y=y+i*(int)Math.pow(10,n-1);
                i++;
                x/=10;
            }
            System.out.println(y);
    }
}
