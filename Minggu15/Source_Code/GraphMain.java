import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Vertex          : ");
        String[] vertex = new String[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Masukkan data vertex ke-" + i + " : ");
            vertex[i] = sc.nextLine();
        }

        Graph<String> graph = new Graph<String>(vertex);


        System.out.print("Masukkan Edge            : ");
        int edge = sc.nextInt();

        // int source, destination;
        // untuk tugas nomor 2
        int pil;
        do {
            System.out.println("1 Untuk Directed | 2 Untuk Undirected");
            System.out.print(": ");
            pil = sc.nextInt();

            System.out.println("Masukkan Edge: <from> <to>");
            if(pil == 1) { // untuk directed
                for (int i = 0; i < edge; i++) {
                    // System.out.print("Masukkan Source      : ");
                    // source = sc.nextInt();
                    // System.out.print("Masukkan Destination : ");
                    // destination = sc.nextInt();
                    graph.graphType(sc.nextInt(), sc.nextInt());
                }
                graph.printGraph();

            } else if (pil == 2) { // untuk undirected
                for (int i = 0; i < edge; i++) {
                    // System.out.print("Masukkan Source      : ");
                    // source = sc.nextInt();
                    // System.out.print("Masukkan Destination : ");
                    // destination = sc.nextInt();
                    graph.addEdge(sc.nextInt(), sc.nextInt());
                }
                graph.printGraph();
            }
        } while (pil!=1 && pil!=2);
        System.out.println("+-----------------------------+");


        // Tugas nomor 1
        // int source, destination;
        // for (int i = 0; i < edge; i++) {
        //     System.out.print("Masukkan Source      : ");
        //     source = sc.nextInt();
        //     System.out.print("Masukkan Destination : ");
        //     destination = sc.nextInt();
        //     graph.addEdge(source, destination);
        // }
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);
        // graph.addEdge(3, 0);
        // graph.printGraph();
        // graph.degree(2);

        // // tambahan langkah 12
        // graph.removeEdge(1, 2);
        // graph.printGraph();

        // // tambahan langkah 14
        // graph.removeEdge(3, 2);
        // graph.printGraph();
        sc.close();
    }
}
