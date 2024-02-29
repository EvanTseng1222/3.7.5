
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    //ArrayList<String> childrenBooks = new ArrayList<String>();
    ArrayList<Book> childrenBooks = library.getChildrensBooks();
  }


}