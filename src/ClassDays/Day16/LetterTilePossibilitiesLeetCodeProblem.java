package ClassDays.Day16;

public class LetterTilePossibilitiesLeetCodeProblem {
    public static void main(String[] args) {
        String str="ABAC";
        int[] freq=new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'A']++;
        }
        TilePossiblities(freq,"");
    }
    public static void TilePossiblities(int[] freq,String ans){
        System.out.println(ans);
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>=1){
                char ch=(char)(i+'A');
                freq[i]--;
                TilePossiblities(freq,ans+ch);
                freq[i]++;
            }
        }
    }
}
