import java.io.File;

public class FileClassDemo {

    public static void main(String[] args) {

        //Absolute path -> full path to the file -> C:\Users\firda\OneDrive\Desktop\Files\document.txt
        // Relative path -> relative path in relation to current working directory -> document.txt

        File file = new File("C:\\Users\\firda\\OneDrive\\Desktop\\Files\\document.txt");
        // File object represents a path to a file
        System.out.println(file.exists());

        File file3 = new File("C:\\Users\\firda\\OneDrive\\Desktop\\Files\\document3.txt");
        System.out.println(file3.exists());

        File folder = new File("C:\\Users\\firda\\OneDrive\\Desktop\\Files");
        System.out.println(folder.exists());
        File folder2 = new File("C:\\Users\\firda\\OneDrive\\Desktop\\Files2");
        System.out.println(folder2.exists());

        System.out.println(file.isFile());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

 //       file.renameTo(new File("C:\\Users\\firda\\OneDrive\\Desktop\\Files\\text.txt"));
        System.out.println(file.delete());
    }
}
