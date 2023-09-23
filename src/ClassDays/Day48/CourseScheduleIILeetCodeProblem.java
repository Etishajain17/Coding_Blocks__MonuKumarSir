package ClassDays.Day48;

import java.util.*;

public class CourseScheduleIILeetCodeProblem {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            HashMap<Integer, List<Integer>> map =new HashMap<>();
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
        public int[] topologicalSort(HashMap<Integer,List<Integer>> map){
            int[] in=inDegree(map);
            int[] arr = new int[map.size()];
            int idx=0;
            Queue<Integer> q=new LinkedList<>();
            for(int i=0;i<in.length;i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
            int count=0;
            List<Integer> ls=new ArrayList<>();
            while (!q.isEmpty()){
                int  rv=q.poll();
                arr[idx++]=rv;
                count++;
                for(int ngbrs:map.get(rv)){
                    in[ngbrs]--;
                    if(in[ngbrs]==0){
                        q.add(ngbrs);
                    }
                }
            }
            return count==map.size() ? arr : new int[0];
        }

        public int[] inDegree(HashMap<Integer,List<Integer>> map){
            int[] in =new int[map.size()];
            for(int key:map.keySet()) {
                for (int nbrs : map.get(key)) {
                    in[nbrs]++;
                }
            }
            return in;
        }
    }
}
