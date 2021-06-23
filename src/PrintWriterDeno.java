import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDeno {

    public static void main(String[] args) throws FileNotFoundException{


        File file = new File("C:\\Users\\Firda\\OneDrive\\Desktop\\Files\\document.txt");

        PrintWriter pw = new PrintWriter(file);
        pw.print("Hell0");

        pw.close();



    }
}
