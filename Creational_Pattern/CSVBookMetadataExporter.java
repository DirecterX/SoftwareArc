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
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 *
 * @author Hp
 */
public class CSVBookMetadataExporter extends BookMetadataExporter{

    @Override
    public void export(PrintStream stream) throws IOException, XMLStreamException {
        
        CSVBookMetadataFormatter csvFormatter = new CSVBookMetadataFormatter();
        ArrayList<Book> collectionBook = super.getBookCollection();
        
        for (Book book : collectionBook){
            csvFormatter.append(book);
        }
        String[] text = csvFormatter.getMetadataString().split(" \n ");

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("Book_CSV.csv"), CSVFormat.DEFAULT)) {
            for (String s : text){
                printer.printRecord(s.split(","));
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
