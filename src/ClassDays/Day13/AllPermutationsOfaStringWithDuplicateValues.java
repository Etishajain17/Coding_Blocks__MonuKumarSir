package ClassDays.Day13;

/*
At every level, call for once only for repeated values
Calling for last A
eg. ABA{ABA,AAB,BAA}
                  ABA,""
             /      |      \(NOT FOR THIS A)
          BA,A     AA,B    AB,A
          /  \     /  \(N)
      A,AB  B,AA A,BA
        |    |    |
      ABA   AAB  BAA
 */

public class AllPermutationsOfaStringWithDuplicateValues {
    public static void printPermutationNoDuplaicate(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            boolean f=false;
            for (int j = i+1; j < ques.length(); j++) {
                if(ch == ques.charAt(j)) {
                    f = true;
                    break;
                }
            }
            if(f == false) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                printPermutationNoDuplaicate(s1 + s2, ans + ch);
            }
        }
    }
    public static void main(String[] args) {
        String s="abca";
        printPermutationNoDuplaicate(s,"");
    }
}
