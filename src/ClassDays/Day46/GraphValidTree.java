package ClassDays.Day46;

import java.util.ArrayList;

/*
https://leetcode.ca/all/261.html

261. Graph Valid Tree
Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge is a pair of nodes),
write a function to check whether these edges make up a valid tree.

Example 1:

Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
Output: true
Example 2:

Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
Output: false
Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0,1] is the same as
[1,0] and thus will not appear together in edges.

 */
//import java.util.*;
//public class GraphValidTree {
//    class Solution{
//        public boolean validTree(int n,int[][] edges){
//            HashMap<Integer,List<Integer>> map=new HashMap<>();
//            for (int i = 0; i < n; i++) {
//                map.put(i,new ArrayList<>());
//            }
//            for (int i = 0; i <edges.length ; i++) {
//                int v1=edges[i][0];
//                int v2=edges[i][1];
//                map.get(v1).add(v2);
//                map.get(v2).add(v1);
//            }
//        }
//        public boolean isValid(HashMap<Integer,> map,List<Integer> list){
//            HashSet<Integer> visited=new HashSet<>();
//            Stack<Integer> st=new Stack<>();
//            int count=0;
//            for (int src:map.keySet()){
//                st.push(src);
//                while(!st.isEmpty()){
//                    //1. remove
//                    int rv=st.pop();
//                    //2. if already visited then ignore kro
//                    if(visited.contains(rv)){
//                        continue;
//                    }
//                    //3. visited mark kro
//                    visited.add(rv);
//                    //4. Self Work
//                    System.out.print(rv+" ");
//                    //5. add unvisited neighbours
//                    for (int neighbours: map.get(rv).keySet()){
//                        if(!visited.contains(neighbours))
//                            st.push(neighbours);
//                    }
//                }
//            }
//            return count==1;
//        }
//    }
//}
