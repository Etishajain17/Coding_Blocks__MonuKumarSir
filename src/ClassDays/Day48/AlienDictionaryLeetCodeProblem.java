package ClassDays.Day48;

//https://www.lintcode.com/problem/892/
/*
There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a
list of non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language.
Derive the order of letters in this language.

You may assume all letters are in lowercase.
The dictionary is invalid, if string a is prefix of string b and b is appear before a.
If the order is invalid, return an empty string.
There may be multiple valid order of letters, return the smallest in normal lexicographical order.
The letters in one string are of the same rank by default and are sorted in Human dictionary order.

Example 1:

Input：["wrt","wrf","er","ett","rftt"]
Output："wertf"
Explanation：
from "wrt"and"wrf" ,we can get 't'<'f'
from "wrt"and"er" ,we can get 'w'<'e'
from "er"and"ett" ,we can get 'r'<'t'
from "ett"and"rftt" ,we can get 'e'<'r'
So return "wertf"

Example 2:

Input：["z","x"]
Output："zx"
Explanation：
from "z" and "x"，we can get 'z' < 'x'
So return "zx"

 */

/*
https://codeforces.com/contest/510/problem/C
 */
import java.util.*;
public class AlienDictionaryLeetCodeProblem {
    class Solution{
        public String alienOrder(String[] words){
            HashMap<Character,List<Character>> map=new HashMap<>();
            for(int i=0;i<words.length;i++){
                String s=words[i];
                for(int j=0;j<s.length();j++){
                    if(!map.containsKey(s.charAt(j))){
                        map.put(s.charAt(j),new ArrayList<>());
                    }
                }
            }
            for (int i = 0; i < words.length-1; i++) {
                String s1=words[i];
                String s2=words[i+1];
                if(s1.startsWith(s2) && s1.length()>s2.length()){
                    return "";
                }
                for (int j = 0; j < Math.min(s1.length(),s2.length()); j++) {
                    if(s1.charAt(j)!=s2.charAt(j)){
                        map.get(s1.charAt(j)).add(s2.charAt(j));
                        break;
                    }
                }
            }
            return topologicalSort(map);
        }
        public String topologicalSort(HashMap<Character,List<Character>> map){
            int[] in=inDegree(map);
            StringBuilder sb=new StringBuilder();
            Queue<Character> q=new LinkedList<>();
            for (char ch:map.keySet()) {
                if(in[ch-'a']==0 && map.containsKey(ch+'a')){
                    q.add(ch);
                }
            }
            int count=0;
            while(!q.isEmpty()){
                char ch=q.remove();
                count++;
                sb.append(ch);
                for(char nbrs:map.get(ch)){
                    in[nbrs-'a']--;
                    if (in[nbrs-'a']==0){
                        q.add(nbrs);
                    }
                }
            }
            return count==map.size() ? sb.toString() : "";
        }
        public int[] inDegree(HashMap<Character,List<Character>> map){
            int[] in =new int[26];
            for(char key:map.keySet()){
                for(char nbrs:map.get(key)){
                    in[nbrs-'a']++;
                }
            }
            return in;
        }
    }
}
