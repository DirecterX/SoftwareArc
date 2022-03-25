/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;

/**
 *
 * @author Hp
 */
public class JSONBookMetadataExporter extends BookMetadataExporter{

    @Override
    public void export(PrintStream stream) throws IOException, XMLStreamException {
    
        JSONBookMetadataFormatter jsonFormatter = new JSONBookMetadataFormatter();
        ArrayList<Book> collectionBook = super.getBookCollection();
        FileWriter file = null;
        
        for (Book book : collectionBook){
            jsonFormatter.append(book);
        }
        
        try{
            file = new FileWriter("Book_Json.txt");
            file.write(jsonFormatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            file.flush();
            file.close();
        }
    }
    
}
