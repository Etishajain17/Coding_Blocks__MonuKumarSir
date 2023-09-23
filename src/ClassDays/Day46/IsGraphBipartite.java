package ClassDays.Day46;
/*
https://leetcode.com/problems/is-graph-bipartite/
 */
import java.util.*;
public class IsGraphBipartite {
    class Solution{
        public boolean isBipartite(int[][] graph){
            Map<Integer,Integer> visited=new HashMap<>();
            Queue<BipartitePair> q=new LinkedList<>();
            for (int src=0;src<graph.length;src++){
                if(visited.containsKey(src))
                    continue;
                q.add(new BipartitePair(src,0));
                while(!q.isEmpty()) {
                    //1. remove
                    BipartitePair rv = q.poll();
                    //2. if already visited then ignore kro
                    if (visited.containsKey(rv.vtx)) {
                        if ( visited.get(rv.vtx)!=rv.lv)
                            return false;
                        else
                            continue;
                    }
                    //3. visited mark kro
                    visited.put(rv.vtx,rv.lv);
                    //5. add unvisited neighbours
                    for (int neighbours : graph[rv.vtx]) {
                        if (!visited.containsKey(neighbours))
                            q.add(new BipartitePair(neighbours,rv.lv+1));
                    }
                }
            }
            return true;
        }
    }
    class BipartitePair{
        int vtx;
        int lv;
        public BipartitePair(int src,int lv){
            this.vtx=src;
            this.lv=lv;
        }
    }
}
