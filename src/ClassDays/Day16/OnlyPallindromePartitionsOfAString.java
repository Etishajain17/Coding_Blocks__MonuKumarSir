package ClassDays.Day16;

public class OnlyPallindromePartitionsOfAString {
    public static void main(String[] args) {
        String s="NITIN";
        PallinPartitionStrings(s,"");
    }
    public static void PallinPartitionStrings(String ques,String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <= ques.length() ; cut++) {
            String s=ques.substring(0,cut);
            if(isPalindrome(s))
                PallinPartitionStrings(ques.substring(cut),ans+s+"|");
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
