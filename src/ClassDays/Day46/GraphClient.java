package ClassDays.Day46;

import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        Graph gp=new Graph(7);
        gp.addEdge(1,4,6);
        gp.addEdge(1,2,10);
        gp.addEdge(2,3,7);
        gp.addEdge(3,4,5);
//        gp.addEdge(4,5,1);
        gp.addEdge(5,6,4);
        gp.addEdge(7,5,2);
        gp.addEdge(6,7,3);
//
//        gp.display();
//        gp.removeVertex(4);
//        gp.display();
//        System.out.println(gp.hasPath(1,6,new HashSet<>()));
//        gp.printAllPath(1,6,new HashSet<>(),"");
        System.out.println(gp.BFS(1,6));
        System.out.println(gp.DFS(1,6));
        gp.BFT();
        gp.DFT();
    }
}
