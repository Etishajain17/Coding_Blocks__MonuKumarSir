package ClassDays.Day13;
/*
eg. ABC{ABC,ACB,BAC,BCA,CAB,CBA}
                  ABC,""
             /      |      \
          BC,A     AC,B     AB,C
          /  \     /  \     /  \
      C,AB  B,AC C,BA A,BC B,CA A,CB
        |    |    |    |    |    |
      ABC   ACB  BAC  BCA  CAB  CBA
 */
public class AllPermutationsOfaString {
    public static void printPermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            printPermutation(s1+s2,ans+ch);
        }
    }
    public static void main(String[] args) {
        String s="abcd";
        printPermutation(s,"");
    }
}
