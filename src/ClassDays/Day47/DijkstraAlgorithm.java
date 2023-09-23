package ClassDays.Day47;

import ClassDays.Day46.Graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DijkstraAlgorithm {
    private HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public DijkstraAlgorithm(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost); //v1 --> v2
        map.get(v2).put(v1,cost); //v2 --> v1
    }
    private class DijkstraPair{
        int vtx;
        String acq_path;
        int cost;
        public DijkstraPair(int vtx,String acq_path,int cost){
            this.acq_path=acq_path;
            this.cost=cost;
            this.vtx=vtx;
        }

        @Override
        public String toString() {
            return "DijkstraPair{" +
                    "vtx=" + vtx +
                    ", acq_path='" + acq_path + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
    public void dijkstraAlgo(){
        PriorityQueue<DijkstraPair> pq=new PriorityQueue<>(
                new Comparator<DijkstraPair>() {
                    @Override
                    public int compare(DijkstraPair o1, DijkstraPair o2) {
                        return o1.cost-o2.cost;
                    }
                });
        Set<Integer> visited=new HashSet<>();
        pq.add(new DijkstraPair(1,"1",0));
        while(!pq.isEmpty()){
            DijkstraPair rv=pq.remove();
            if(visited.contains(rv.vtx))
                continue;
            visited.add(rv.vtx);
            System.out.println(rv);
            for(int neighbrs:map.get(rv.vtx).keySet()){
                if(!visited.contains(neighbrs)){
                    int cost=rv.cost+map.get(rv.vtx).get(neighbrs);
                    pq.add(new DijkstraPair(neighbrs,rv.acq_path+neighbrs,cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        DijkstraAlgorithm gp=new DijkstraAlgorithm(7);
        gp.addEdge(1,4,6);
        gp.addEdge(1,2,10);
        gp.addEdge(2,3,7);
        gp.addEdge(3,4,5);
        gp.addEdge(4,5,1);
        gp.addEdge(5,6,4);
        gp.addEdge(7,5,2);
        gp.addEdge(6,7,3);
        gp.dijkstraAlgo();
    }
}
