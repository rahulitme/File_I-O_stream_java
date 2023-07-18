
import java.io.*;

public class FILECopy {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("abc.txt");
            fos = new FileOutputStream("bbc.txt");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File is copied");
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
