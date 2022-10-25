package Contests.Contest4_Recursion;
/*
Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words
that can be written with the pressed keys.

Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv
, 8 -> wx , 9 -> yz

E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.

b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

Input Format
    Single line input containing a single integer.

Constraints
    1 <= Length of string <= 10^3

Output Format
    Print all the words in a space separated manner. Also print the count of these numbers in next line.

Sample Input
    12

Sample Output
    ad ae af bd be bf cd ce cf
    9

Explanation
    1 can correspond to 'a' , 'b' or 'c' .
    2 can correspond to 'd', 'e' or 'f'.
    We print all combinations of these
 */
public class RecursionKeypadCodes {
    static String[] arr={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        String str="12";
        System.out.println("\n"+printKeyPadCodes(str,""));
    }
    public static int printKeyPadCodes(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        int ch=ques.charAt(0);
        String quesString=arr[ch-'0'];
        for (int i = 0; i < quesString.length(); i++) {
            count+=printKeyPadCodes(ques.substring(1),ans+quesString.charAt(i));
        }
        return count;
    }
}
