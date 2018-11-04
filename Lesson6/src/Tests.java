/**
 * Created by Ivan Chaykin
 * Date: 26.10.2018
 * Time: 12:21
 */
public class Tests {
    public static void main(String[] args) {
        TreeImpl tree = new TreeImpl();
        tree.add(new Person(60, "Petr", 100));
        tree.add(new Person(50, "Petr", 100));
        tree.add(new Person(40, "Petr", 100));
        tree.add(new Person(55, "Petr", 100));
        tree.add(new Person(31, "Petr", 100));
        tree.add(new Person(45, "Petr", 100));
        tree.add(new Person(57, "Petr", 100));
        tree.add(new Person(66, "Petr", 100));
        tree.add(new Person(70, "Petr", 100));
        tree.add(new Person(67, "Petr", 100));
        tree.add(new Person(81, "Petr", 100));
        tree.add(new Person(68, "Petr", 100));
        tree.add(new Person(65, "Petr", 100));
        tree.add(new Person(98, "Petr", 100));
        tree.add(new Person(74, "Petr", 100));
        tree.add(new Person(62, "Petr", 100));
        tree.add(new Person(88, "Petr", 100));
        tree.add(new Person(69, "Petr", 100));
        tree.add(new Person(63, "Petr", 100));

        System.out.println(tree.isBalanced());

        tree.display();

        tree.remove(66);

        System.out.println("search 55: " + tree.find(55));

        tree.display();

//        tree.traverse(TraverseMode.IN_ORDER);
    }
}
