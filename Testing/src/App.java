import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
      String name = null;

      printLength(name);
      //Testing Gir

    }

    private static void printLength(String myString) throws NullPointerException{
        System.out.println(myString.length());
    }
}
