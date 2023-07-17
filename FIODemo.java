import java.io.*;

public class FIODemo {
    public static void main(String args[])
            throws FileNotFoundException.IOException {

        FilterInputStream fis = new FilterInputStream("abc.txt");

        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();

        System.out.println("data" + data1 + " " + (char) data1);
        System.out.println("data" + data2 + " " + (char) data2);
        System.out.println("data" + data3 + " " + (char) data3);
        fis.close();
    }
}
