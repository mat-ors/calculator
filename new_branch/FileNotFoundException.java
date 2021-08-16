import java.io.File;
import java.io.FileReader;

public class FilenotFound_Demo {

    public static void main(String args[]) {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }
}public class Unchecked_Demo {

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};
        System.out.println(num[5]);
    }
} 