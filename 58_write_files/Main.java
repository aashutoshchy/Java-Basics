import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String textContent = "I'm Ashutosh";

        try(FileWriter writer = new FileWriter("test.txt")) {
            // writer.write("Hello World!!!");
            writer.write(textContent);

            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println("Could");
        }
    }
}
