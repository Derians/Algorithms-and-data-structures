import java.io.File;

/**
 * Created by Derians
 * Date: 23.10.2018
 * Time: 10:36
 */
public class Recursion {
    public static void main(String[] args) throws InterruptedException {
        int n = 5;
//        countdown(n);

//        while (true) {
//            System.out.println(n--);
//        }

//        System.out.println(factorial(n));


//        File rootDir = new File("C:\\Users\\Public\\");
//        viewDir(rootDir, "");
    }

    private static void viewDir(File rootDir, String prefix) {
        if (rootDir.isFile()) {
            System.out.println("File: " + prefix + rootDir.getName());
        }
        else {
            System.out.println("Dir: " + prefix + rootDir.getName());
//          added null check
            if(rootDir.listFiles() != null) {
                for (File file : rootDir.listFiles()) {
                    System.out.println(file);
                    viewDir(file, prefix + "    ");
                }
            }
        }
    }

    //5! = 5 * 4 * 3 * 2 * 1 = 120
    private static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    private static int countdown(int n) throws InterruptedException {
//        if (n < 0) {
//            return n;
//        }
        System.out.println(n);
//        Thread.sleep(1000);
        return countdown(n - 1);
    }
}
