import java.io.File;
import java.util.Scanner;

public class Title {
    public static void main(String [] args) throws Exception{
        File file = new File("movies.txt");
        // (file) instead of System.in to operate on file nit on terminal input
        Scanner scanner = new Scanner(file);
        //COUNTER OF LINES/TITLES IN FILE
        int countTitles = 0;
        String title = " ";
        //unless the file has no more lines:
        while(scanner.hasNextLine()) {
            //scan a line and store it in line variable
            String line = scanner.nextLine();
            // count line
            countTitles ++;
        }
        // pick a random int number from the range of lines in file
        int random = (int) (Math.random() * countTitles) + 1;

        // moving scanner to the beginning of the file
        scanner = new Scanner(file);
        // setting title to randomly picked value to be guessed in the game
        for (int i=0; i<random; i++) {
            title = scanner.nextLine();
        }

        //internal check:
        System.out.println(random + " there are " + countTitles + " titles, and the chosen title is: " + title );


        int titleLength = (title.length());
        char[] encrypted = new char[titleLength];
        // encrypting the title in a new variable that will be a place to store and change the answers
        for (int i=0; i<titleLength; i++) {
            if (title.charAt(i) != ' ')
                encrypted[i] = '_';
            else
                encrypted[i] = title.charAt(i);
        }
        //internal check:
        System.out.println(encrypted);
        




    }
}
