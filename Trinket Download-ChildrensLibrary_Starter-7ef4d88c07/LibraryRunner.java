
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    String authorToFind = "L. Frank Baum";
    ArrayList<Book> childrenBooks = library.getChildrensBooks();
    //library.setChildrensBooks(childrenBooks);
    //System.out.println(childrenBooks);
    for (Book book : library.getChildrensBooks()){
      if (book.getAuthor().equals(authorToFind)){
        System.out.println(book.getTitle());
      }
      String targetRating = "Sky Island";
      double rating = 4.14;
      System.out.println("Books with the same rating as " + targetRating + ":");
      for (Book book2 : library.getChildrensBooks()){
        if (book2.getRating() >= rating){
          System.out.println(book2.getTitle());
        }
      }
    }
    

  }
}