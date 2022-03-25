package creational;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;

public abstract class BookMetadataExporter extends BookCollection {
    private final ArrayList<Book> collectionBook = new ArrayList<Book>();
    public abstract void export(PrintStream stream) throws IOException, XMLStreamException;
    
    public ArrayList<Book> getBookCollection(){
        return collectionBook;
    }
      
    public void add(Book book){
        collectionBook.add(book);
    }
}
