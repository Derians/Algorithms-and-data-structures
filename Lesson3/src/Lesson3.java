import java.util.Stack;

/**
 * Created by Ivan Chaykin
 * Date: 16.10.2018
 * Time: 20:35
 */
public class Lesson3 {

    public static void main(String[] args) {

        String text = "Test string";
        System.out.println(text + " => " + flipString(text));
    }

    private static String flipString(String text) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++)
            stack.push(text.charAt(i));

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.empty())
            stringBuilder.append(stack.pop());

        return stringBuilder.toString();
    }
}
