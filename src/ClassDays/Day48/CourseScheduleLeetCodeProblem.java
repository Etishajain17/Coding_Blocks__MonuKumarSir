package ClassDays.Day48;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// bi ---> ai
// https://leetcode.com/problems/course-schedule/
public class CourseScheduleLeetCodeProblem {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            HashMap<Integer,List<Integer>> map =new HashMap<>();
            for(int i=0;i<numCourses;i++){
                map.put(i,new ArrayList<>());
            }
            for (int i = 0; i < prerequisites.length; i++) {
                int va=prerequisites[i][0];
                int vb=prerequisites[i][1];
                map.get(vb).add(va);
            }
            return topologicalSort(map);
        }
        public boolean topologicalSort(HashMap<Integer,List<Integer>> map){
            int[] in=inDegree(map);
            Queue<Integer> q=new LinkedList<>();
            for(int i=0;i<in.length;i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
            int count=0;
            while (!q.isEmpty()){
                int  rv=q.poll();
                count++;
                for(int ngbrs:map.get(rv)){
                    in[ngbrs]--;
                    if(in[ngbrs]==0){
                        q.add(ngbrs);
                    }
                }
            }
            return map.size()==count;
        }

        public int[] inDegree(HashMap<Integer,List<Integer>> map){
            int[] in =new int[map.size()];
            for(int key:map.keySet()){
                for(int nbrs:map.get(key)){
                    in[nbrs]++;
                }
            }
            return in;
        }
    }
}
