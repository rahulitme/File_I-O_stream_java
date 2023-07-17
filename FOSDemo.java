import java.io.*;

public class FOSDemo {
    public static void main(String args[]) {
        try {
            FileOutputStream fos = new FileOutputStream("abc.txt");
            fos.write(5);
            System.out.println("Data is saved.");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}