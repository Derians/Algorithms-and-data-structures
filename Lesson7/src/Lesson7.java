/**
 * Created by Ivan Chaykin
 * Date: 30.10.2018
 * Time: 11:42
 */
public class Lesson7 {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");

        graph.addEdge("Тула", "Липецк");

        graph.addEdge("Рязань", "Тамбов");

        graph.addEdge("Калуга", "Орел");

        graph.addEdge("Липецк", "Воронеж");

        graph.addEdge("Тамбов", "Саратов");

        graph.addEdge("Орел", "Курск");

        graph.addEdge("Саратов", "Воронеж");

        graph.addEdge("Курск", "Воронеж");

        graph.findShortPath("Москва", "Воронеж");

    }

}
