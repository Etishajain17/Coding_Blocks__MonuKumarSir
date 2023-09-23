package ClassDays.Day49;

import java.util.*;

//https://leetcode.com/problems/longest-cycle-in-a-graph/
public class LongestCycleInAGraphLeetcodeProblem {
    class Solution {
        public int longestCycle(int[] edges) {
            int[] in=new int[edges.length];
            for(int i=0;i<in.length;i++){
                if(edges[i]!=-1){
                    in[edges[i]]++;
                }
            }
            boolean[] visited=new boolean[edges.length];
            Queue<Integer> q=new LinkedList<>();
            for (int i = 0; i < in.length; i++) {
                if(in[i]==0){
                    q.add(i);
                }
            }
            while(!q.isEmpty()){
                int rv=q.poll();
                visited[rv]=true;
                int ngbrs=edges[rv];
                if(ngbrs!=-1){
                    in[ngbrs]--;
                    if(in[ngbrs]==0)
                        q.add(ngbrs);
                }
            }

            //counting
            int ans=-1;
            for (int i = 0; i < visited.length; i++) {
                if(!visited[i]){
                    int count=1;
                    int ngbrs=edges[i];
                    visited[i]=true;
                    while(ngbrs!=i){
                        visited[ngbrs]=true;
                        count++;
                        ngbrs=edges[ngbrs];
                    }
                    ans=Math.max(ans,count);
                }
            }
            return ans;
        }
    }
}
