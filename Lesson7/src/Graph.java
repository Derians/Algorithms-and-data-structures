import java.util.*;
import java.util.function.Function;

/**
 * Created by Ivan Chaykin
 * Date: 30.10.2018
 * Time: 10:41
 */
public class Graph {

    private List<Vertex> vertexes;
    private boolean[][] adjMatrix;

    private int size;

    public Graph(int maxSize) {
        vertexes = new ArrayList<>(maxSize);
        adjMatrix = new boolean[maxSize][maxSize];
        size = 0;
    }

    public void addVertex(String label) {
        Vertex vertex = new Vertex(label);
        vertexes.add(vertex);
        size++;
    }

    public boolean addEdge(String labelFrom, String labelTo) {
        Vertex vertexFrom = findVertex(labelFrom);
        Vertex vertexTo = findVertex(labelTo);
        if (vertexFrom == null || vertexTo == null) {
            return false;
        }

        addEdge(vertexFrom, vertexTo);
        return true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(vertexes.get(i));
        }
    }

    private void addEdge(Vertex vertexFrom, Vertex vertexTo) {
        int indexFrom = vertexes.indexOf(vertexFrom);
        int indexTo = vertexes.indexOf(vertexTo);

        adjMatrix[indexFrom][indexTo] = true;
        adjMatrix[indexTo][indexFrom] = true;
    }

    private Vertex findVertex(String label) {
        for (Vertex vertex : vertexes) {
            if (vertex.getLabel().equals(label)) {
                return vertex;
            }
        }
        return null;
    }

    public void dfs(String startLabel) {
        order(startLabel, new Stack<>(), Stack::peek);
    }

    public void bfs(String startLabel) {
        order(startLabel, new ArrayDeque<>(), Queue::peek);
    }

    private <T extends Collection<Vertex>> void order(String startLabel,
                                                      T collection,
                                                      Function<T, Vertex> peeker) {

        Vertex vertex = findVertex(startLabel);
        if (vertex == null) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        visitVertex(vertex, collection);

        while ( !collection.isEmpty()) {
            Vertex currentVertex = peeker.apply(collection);
            vertex = getAdjUnvisitedVertex(currentVertex);
            if (vertex == null) {
                collection.remove(currentVertex);
            }
            else {
                visitVertex(vertex, collection);
            }
        }

        clearVertexes();

    }

//    This code is for educational purposes.

//    public void dfs(String startLabel) {
//        Vertex vertex = findVertex(startLabel);
//        if (vertex == null) {
//            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
//        }
//
//        Stack<Vertex> stack = new Stack();
//
//        visitVertex(vertex, stack);
//
//        while ( !stack.isEmpty() ) {
//            vertex = getAdjUnvisitedVertex(stack.peek());
//            if (vertex == null) {
//                stack.pop();
//            }
//            else {
//                visitVertex(vertex, stack);
//            }
//        }
//
//        clearVertexes();
//    }
//
//    public void bfs(String startLabel) {
//        Vertex vertex = findVertex(startLabel);
//        if (vertex == null) {
//            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
//        }
//
//        Queue<Vertex> queue = new ArrayDeque();
//
//        visitVertex(vertex, queue);
//
//        while ( !queue.isEmpty()) {
//            vertex = getAdjUnvisitedVertex(queue.peek());
//            if (vertex == null) {
//                queue.remove();
//            }
//            else {
//                visitVertex(vertex, queue);
//            }
//        }
//
//        clearVertexes();
//    }

    private void clearVertexes() {
        for (int i = 0; i < size; i++) {
            vertexes.get(i).setWasVisited(false);
        }
    }

    private void visitVertex(Vertex vertex, Collection<Vertex> keeper) {
        vertex.setWasVisited(true);
//        System.out.println(vertex);
        keeper.add(vertex);
    }
    private void visitVertex(Vertex vertex, Stack<Vertex> stack) {
        vertex.setWasVisited(true);
//        System.out.println(vertex);
        stack.push(vertex);
    }
    private void visitVertex(Vertex vertex, Queue<Vertex> queue) {
        vertex.setWasVisited(true);
//        System.out.println(vertex);
        queue.add(vertex);
    }

    private Vertex getAdjUnvisitedVertex(Vertex vertex) {
        int startIndex = vertexes.indexOf(vertex);
        for (int i = 0; i < size; i++) {
            if (adjMatrix[startIndex][i] && !vertexes.get(i).isWasVisited()) {
                return vertexes.get(i);
            }
        }
        return null;
    }

    private Vertex bfs(Vertex startVertex, Vertex finishVertex) {

        Vertex currentVertex = startVertex;
        Vertex previousVertex;

        Queue<Vertex> queue = new ArrayDeque();

        visitVertex(currentVertex, queue);

        while ( !queue.isEmpty()) {
            previousVertex = queue.peek();
            currentVertex = getAdjUnvisitedVertex(queue.peek());
            if (currentVertex == null) {
                queue.remove();
            }
            else {
                visitVertex(currentVertex, queue);

                currentVertex.setPrevious(previousVertex);

                if (currentVertex.getLabel().equals(finishVertex.getLabel())){
                    break;
                }
            }
        }

        clearVertexes();
        return currentVertex;
    }

    public void findShortPath(String startLabel, String finishLable) {
        Vertex startVertex = findVertex(startLabel);
        Vertex finishVertex = findVertex(finishLable);

        if (startVertex == null) {
            throw new IllegalArgumentException("Invalid startLabel: " + startVertex.getLabel());
        }
        if (finishVertex == null) {
            throw new IllegalArgumentException("Invalid startLabel: " + finishVertex.getLabel());
        }

        Vertex currentVertex = bfs(startVertex, finishVertex);

        Stack<Vertex> stack = new Stack();

        while (currentVertex != null){
            stack.push(currentVertex);
            currentVertex = currentVertex.getPrevious();
        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }

}