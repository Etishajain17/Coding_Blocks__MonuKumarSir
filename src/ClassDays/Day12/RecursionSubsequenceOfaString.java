package ClassDays.Day12;

/*
eg. abcd
    Substring --> order and contiguous (abc,ab)
    Subsequence -->order but nor contiguous (abc,acd,ac)
    Subset --> No order (bac , ca)

    eg. abc
                   a
              /         \
             -           a
           /  \        /   \
          -    b       a    ab
         / \  / \     / \   / \
        -  c b  bc  a  ac ab abc


                  (ques),(ans)
                     abc,-
               /             \
            bc,-             bc,a
           /    \            /   \
         c,-    c,b       c,a     c,ab
        /  \    /  \     /  \     /  \
     -,- -,c -,b -,bc -,a -,ac -,ab -,abc

 */
public class RecursionSubsequenceOfaString {
    public static void printSubsequence(String ques,String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        printSubsequence(ques.substring(1),ans);
        printSubsequence(ques.substring(1),ans+ch);
    }

    public static void main(String[] args) {
        String str="abc";
        printSubsequence(str,"");
    }
}
