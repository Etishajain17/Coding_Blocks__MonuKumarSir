package Contests.Contest7_BinaryTree;

import java.util.*;
class Ma{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String server="??011??0";
        int count=0;
        char prev=server.charAt(0);
        for(int i=1;i<server.length();i++){
            if(server.charAt(i)=='?'){
                continue;
            }
            else if(prev=='?'){
                prev=server.charAt(i);
            }else if(prev!=server.charAt(i)){
                count++;
                prev=server.charAt(i);
            }
        }
        System.out.println(count);
    }

}

