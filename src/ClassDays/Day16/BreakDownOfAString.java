package ClassDays.Day16;
/*
Nitin ---> [["N","I","T","I","N"],["N","I","T","IN"],["N","I","TI","N"],["N","I","TIN"],......]
 */
public class BreakDownOfAString {
    public static void main(String[] args) {
        String s="NITIN";
        PartitionStrings(s,"");
    }
    public static void PartitionStrings(String ques,String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <= ques.length() ; cut++) {
            String s=ques.substring(0,cut);
            PartitionStrings(ques.substring(cut),ans+s+"|");
        }
    }
}
