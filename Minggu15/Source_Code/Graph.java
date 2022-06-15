public class Graph <T> {
    T[] vertex;
    DoubleLinkedLists list[];

    public Graph(T[] vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedLists[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);

        //add back edge (for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        //degree undirected graph
        System.out.println("degree vertex " + vertex[source] + " : " + list[source].size());

        //degree directed graph
            //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j) == source)
                ++totalIn;
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + vertex[source] + " : " +totalIn);
        System.out.println("Outdegree dari vertex " + vertex[source] + " : " +totalOut);
        System.out.println("Degree vertex " + vertex[source] + " : " +(totalIn + totalOut));
    }
    
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if(i==destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if(list[i].size() > 0 ) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                for(int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" "); 
    }


    // Tugas nomor 2
    boolean graphType(int source, int destination){
        list[source].addFirst(destination);
        return true; // bernilai directed
    }
}