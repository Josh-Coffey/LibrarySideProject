import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this will be the class where the user will interact with the library
public class LibraryApp {

    private Screens screens = new Screens();
    private List<Book> bookList = new ArrayList<>();
    private FileManager fileManager = new FileManager();
    private Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {  //uses run method to avoid static stuff
        LibraryApp userAccess = new LibraryApp();
        userAccess.run();
    }

    public void run(){
        screens.introScreen();
        String anyKey = userInput.nextLine();
        if(!anyKey.isEmpty()){
            optionsScreen();
        }
    }

    public void optionsScreen(){
        boolean isOnOptionsScreen = true;
        screens.optionsScreen();
        while(isOnOptionsScreen){
            String userResponse = userInput.nextLine();
            if(userResponse.equals("1")){
                bookList = fileManager.readBookFile();
                for(Book book: bookList){
                    System.out.println(book.getTitle());
                }
            }
        }
    }



}
