import java.io.*;
import java.util.Scanner;

public class SCANFileCopy {
    public static void main(String args[])
            throws FileNotFoundException, IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source file");
        String srcfile = sc.nextLine();

        System.out.println("Enter the destination file");
        String desfile = sc.nextLine();

        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(desfile);

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        System.out.println("File is copied successfully!");

        fis.close();
        fos.close();
    }
}
