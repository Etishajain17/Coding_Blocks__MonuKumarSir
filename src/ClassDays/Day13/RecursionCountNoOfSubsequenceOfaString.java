package ClassDays.Day13;
/*

                  (ques),(ans)
                     8abc,-
               /             \
            4bc,-              4bc,a
           /    \            /       \
         2c,-   2c,b        2c,a      2c,ab
        /  \    /  \        /  \       /  \
     1-,- 1-,c 1-,b 1-,bc 1-,a 1-,ac 1-,ab 1-,abc


 */
public class RecursionCountNoOfSubsequenceOfaString {
    public static int countSubsequence(String ques,String ans) {
        if(ques.length() == 0){
//            System.out.println(ans);
            return 1;
        }
        char ch=ques.charAt(0);
        int ans1=countSubsequence(ques.substring(1),ans);
        int ans2=countSubsequence(ques.substring(1),ans+ch);
        return ans1+ans2;
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println(countSubsequence(str,""));
    }
//    static int c=0;
//    public static void countSubsequence(String ques,String ans) {
//        if(ques.length() == 0){
//            System.out.println(ans);
//            c++;
//            return;
//        }
//        char ch=ques.charAt(0);
//        countSubsequence(ques.substring(1),ans);
//        countSubsequence(ques.substring(1),ans+ch);
//    }
//
//    public static void main(String[] args) {
//        String str="abc";
//        countSubsequence(str,"");
//        System.out.println(c);
//    }
}
