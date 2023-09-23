package ClassDays.Day48;

import ClassDays.Day46.Graph;

import java.util.HashMap;

/*
Use
- Ordering of process sort
- Dependency sort

- Directed Acyclic Graph Applicable
- in degree , out degree

- BFS / DFS for undirected cyclic graph
- Directed Cyclic graph mai cycle h - topological sort where BFS will fail
- Multiple Answers

- Start from indegree zero becoz it is not dependent on anyone
- remove
- self work (print)
- add neighbr whose indegree now becomes zero
- BFS
- indegree zero nhi hogi agr cycle present hogi

- count is not same with map.size then cycle hai
 */

import java.util.*;

public class TopologicalSort {
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public TopologicalSort(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost); //v1 --> v2
    }

    public void topologicalSort(){
        int[] in=inDegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int  rv=q.poll();
            System.out.print(rv+" ");
            for(int ngbrs:map.get(rv).keySet()){
                in[ngbrs]--;
                if(in[ngbrs]==0){
                    q.add(ngbrs);
                }
            }
        }
    }

    public int[] inDegree(){
        int[] in =new int[map.size()+1];
        for(int key:map.keySet()){
            for(int nbrs:map.get(key).keySet()){
                in[nbrs]++;
            }
        }
        return in;
    }
    public static void main(String[] args) {
        TopologicalSort gp=new TopologicalSort(7);
        gp.addEdge(1,4,6);
        gp.addEdge(2,3,7);
        gp.addEdge(3,4,5);
        gp.addEdge(4,5,1);
        gp.addEdge(5,6,4);
        gp.addEdge(7,5,2);
        gp.topologicalSort();
    }
}
