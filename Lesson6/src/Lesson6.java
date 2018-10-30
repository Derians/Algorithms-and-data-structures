import java.util.Random;

/**
 * Created by Ivan Chaykin
 * Date: 28.10.2018
 * Time: 16:46
 */
public class Lesson6 {

    public static void main(String[] args) {
        int maxTrees = 20;
        int maxLevel = 4;
        int balancedTreeCounter = 0;

        for (int i = 0; i < maxTrees; i++) {
            TreeImpl tree = new TreeImpl(maxLevel);
            fillTree(tree);
            tree.display();
            System.out.println("Tree " + (i+1) + " is balanced = " + tree.isBalanced());

            if (tree.isBalanced())
                balancedTreeCounter++;
        }

        System.out.println("Balanced trees = "+ balancedTreeCounter + " ( " + ((balancedTreeCounter * 100) / maxTrees) + "% )");
    }

    private static void fillTree(TreeImpl tree) {
        Random random = new Random();
        for (int i = 0; i < 20; i++)
            tree.add(new Person(-20 + random.nextInt(41), "Viktor", 45));
    }
}
