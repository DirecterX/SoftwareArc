/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.parsers.ParserConfigurationException;
/**
 *
 * @author Hp
 */
public class XMLBookMetadataExporter extends  BookMetadataExporter{
 

    @Override
    public void export(PrintStream stream) throws IOException, XMLStreamException{
       
        XMLBookMetadataFormatter xmlFormatter = new XMLBookMetadataFormatter();
        ArrayList<Book> collectionBook = super.getBookCollection();
        
        for (Book book : collectionBook){
            xmlFormatter.append(book);
        }
         
         String filePath = "Book_XML.xml";
        Writer fileWriter = new FileWriter(filePath);
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(fileWriter);
        xmlStreamWriter.writeCData(xmlFormatter.getMetadataString());
        xmlStreamWriter.flush();
        xmlStreamWriter.close();
      
    }
    
}
