import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class BasicFileHandling {

    public static void main(String[] args) {

        try {

            // Open file
            File file = new File("sample.txt");

            // Read file
            Scanner reader = new Scanner(file);

            System.out.println("File Contents:\n");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}