import java.io.*;

public class FILECopyy {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        System.out.println("File is copied");

        fis.close();
        fos.close();
    }
}
