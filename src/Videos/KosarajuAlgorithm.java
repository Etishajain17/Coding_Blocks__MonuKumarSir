package Videos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class KosarajuAlgorithm {
    //strongly connected components

    HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public KosarajuAlgorithm(int v){
        for (int i = 0; i <v; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addedge(int va,int vb){
        map.get(va).put(vb,5);
    }
    public int kosarajualgo(){
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        dfs(visited,st,1);
        HashMap<Integer,HashMap<Integer,Integer>> mapa=new HashMap<>();
        transposeGraph(mapa);
        visited=new HashSet<>();
        int count=0;
        while (!st.isEmpty()){
            int pop=st.pop();
            if (!visited.contains(pop)){
                dfs(mapa,visited,pop);
                count++;
            }
        }
        return count;
    }
    private void dfs(HashMap<Integer,HashMap<Integer,Integer>> mapa,HashSet<Integer> visited,int pop){
        visited.add(pop);
        for (int ngbrs: mapa.get(pop).keySet()){
            if (!visited.contains(ngbrs)){
                dfs(mapa,visited,ngbrs);
            }
        }
    }
    private void transposeGraph(HashMap<Integer,HashMap<Integer,Integer>> mapa){
        for (int key:map.keySet()){
            for (int ngbrs:map.get(key).keySet()){
                if (!mapa.containsKey(ngbrs)){
                    mapa.put(ngbrs,new HashMap<>());
                }
                mapa.get(ngbrs).put(key,0);
            }
        }
        for (int key:map.keySet()){
            if (!mapa.containsKey(key)){
                mapa.put(key,new HashMap<>());
            }
        }
    }
    public void dfs(HashSet<Integer> visited,Stack<Integer> st,int i){
        visited.add(i);
        for (int ngbrs: map.get(i).keySet()){
            if (!visited.contains(ngbrs)){
                dfs(visited,st,ngbrs);
            }
        }
        st.push(i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        KosarajuAlgorithm ks=new KosarajuAlgorithm(n);
        int m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            int ea=sc.nextInt();
            int eb=sc.nextInt();
            ks.addedge(ea,eb);
        }
        System.out.println(ks.kosarajualgo());
    }
}
