package ClassDays.Day16;

import java.util.*;

public class OnlyPallindromePartitionsOfAStringIn1DArray {
    public static void main(String[] args) {
        String s="NITIN";
        List<String> ar= new ArrayList<String>();
        PallinPartitionStringsArray(s,ar);
    }
    public static void PallinPartitionStringsArray(String ques,List<String> arr) {
        if(ques.length()==0) {
            System.out.println(arr);
            return;
        }
        for (int cut = 1; cut <= ques.length() ; cut++) {
            String s=ques.substring(0,cut);
            if(isPalindrome(s)) {
                arr.add(s);
                PallinPartitionStringsArray(ques.substring(cut), arr);
                arr.remove(arr.size()-1);
            }
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
