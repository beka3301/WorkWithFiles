import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter= new FileWriter("abc.txt");
        int counter = 0;
        for (char i = 'A'; i <= 'Z'; ++i) {
            counter++;
            fileWriter.write( "\n"+counter+":"+i+" "+Character.toLowerCase(i));
        }
        for (int j = 0; j <= 9; j++) {
            counter++;
            fileWriter.write("\n"+counter+": " +j);
        }
        fileWriter.close();

        FileReader fileReader= new FileReader("abc.txt");
        Scanner scanner= new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            fileReader.close();
        }
    }
}