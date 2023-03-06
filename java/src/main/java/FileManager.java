import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this will manage files that hold books. it may become obsolete when I switch to SQL or may put it in here.
public class FileManager {

    //this method will read the books from the file that I made and will return as a list
    public List<Book> readBookFile(){
        String filename = "C:\\Users\\Student\\Workspace\\LibrarySideProject\\java\\books.txt";
        File inputFile = new File(filename);
        List<Book> booksList = new ArrayList<>();
        try(Scanner inputStream = new Scanner(inputFile)){
            while(inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] lineArr = line.split("\\|");
                String title = lineArr[0];
                String author = lineArr[1];
                booksList.add(new Book(author,title));
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file was not found");
        }
        return booksList;
    }

}
