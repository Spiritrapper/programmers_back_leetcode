package 알고리즘예시;

import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    // 생성자 
    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    // Comparable 인터페이스의 compoareTo 메서드구현
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Graph {
    int V, E; // 정점의 개수와 간선의 개수
    Edge edge[]; // 간선 배열

    // 생성자
    public Graph(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for(int i =0; i< e; ++i) {
            edge[i] = new Edge(0, 0, 0);
        }
    }

    // 부모 노드 찾기
    int find(int parent[], int i) {
        if(parent[i] == -1){
            return i;
        }  
        return find(parent, parent[i]);
    }

    // 두개의 서브트리 병합
    void Union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    // 크루스칼 알고리즘 구현
    void KruskalMST() {
        Edge result[] = new Edge[V];    // 최소 신장 트리를 저장할 배열
        int e = 0;  // 결과 배열을 위한 인덱스
        int i = 0;  // 간선을 검사할 인덱스

        // 간선을 가중치별로 정렬
        Arrays.sort(edge);

        // 부모 배열 초기화
        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        // 결과 배열을 구성
        while (e < V -1 && i < E) {
            Edge next_edge = edge[i++];
            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.dest);

            if (x != y) {
                result[e++] = next_edge;
                Union(parent, x, y);
            }
        }
        
        // 결과 출력
        System.out.println("Edge in the MST: ");
        for (i=0; i< e; ++i) {
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
        }
        
    }

}

public class KruskaAlgorithm {

    public static void main(String[] args) {
        int V = 4; // 정점의 개수
        int E = 5; // 간선의 개수
        Graph graph = new Graph(V, E);

        // 간선 추가
        graph.edge[0] = new Edge(0, 1, 10);
        graph.edge[1] = new Edge(0, 2, 6);
        graph.edge[2] = new Edge(0, 3, 5);
        graph.edge[3] = new Edge(1, 3, 15);
        graph.edge[4] = new Edge(2, 3, 4);

        graph.KruskalMST();
    }
}
