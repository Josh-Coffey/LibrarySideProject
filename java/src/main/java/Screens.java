//this class will be where things are displayed to the user in the CLI
public class Screens {

    public void introScreen(){
        System.out.println("Welcome to the library!");
        System.out.println();
        System.out.println("Press any key to continue...");
    }

    public void optionsScreen(){
        System.out.println("Press (1) to print a list of books.");
        //CRUD
        System.out.println("Press (2) to create a book");
        System.out.println("Press (3) to view a book"); //will add more details to books when change to SQL
        System.out.println("Press (4) to update a book's details");
        System.out.println("Press (5) to delete a book");
    }


}
