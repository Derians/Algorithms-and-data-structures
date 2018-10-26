/**
 * Created by Ivan Chaykin
 * Date: 23.10.2018
 * Time: 10:32
 */
public class HelloBye {
    public static void main(String[] args) {
        hello("Artem");
    }

    private static void hello(String name) {
        print("Hellom " + name + "!");
        bye(name);
    }

    private static void bye(String name) {
        print("Good bye, " + name + "!");
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
