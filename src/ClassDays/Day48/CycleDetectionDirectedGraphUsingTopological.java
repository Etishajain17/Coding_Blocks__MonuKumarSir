package ClassDays.Day48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionDirectedGraphUsingTopological {
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public CycleDetectionDirectedGraphUsingTopological(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost); //v1 --> v2
    }

    public boolean topologicalSort(){
        int[] in=inDegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while (!q.isEmpty()){
            int  rv=q.poll();
            count++;
            for(int ngbrs:map.get(rv).keySet()){
                in[ngbrs]--;
                if(in[ngbrs]==0){
                    q.add(ngbrs);
                }
            }
        }
        return count == map.size() ? false : true;
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
        CycleDetectionDirectedGraphUsingTopological gp=new CycleDetectionDirectedGraphUsingTopological(7);
        gp.addEdge(1,4,6);
        gp.addEdge(2,3,7);
        gp.addEdge(3,4,5);
        gp.addEdge(4,5,1);
        gp.addEdge(5,6,4);
        gp.addEdge(7,5,2);
//        gp.addEdge(6,5,2);
        System.out.println(Arrays.toString(gp.inDegree()));
        System.out.println(gp.topologicalSort());
    }
}
