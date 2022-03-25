package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;

public class Main {

    public static void main(String[] args) throws IOException, XMLStreamException {

        // Current usage
       /* BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
*/
        // Expected usage
//        BookMetadataExporter exporter = new XMLBookMetadataExporter();
//        exporter.add(TestData.sailboatBook);
//        exporter.add(TestData.GoFBook);
//        exporter.export(System.out);
        /*-------------------------------XML-----------------------------------------*/
        BookMetadataExporter exporterXML = new XMLBookMetadataExporter();
        exporterXML.add(TestData.sailboatBook);
        exporterXML.add(TestData.GoFBook);
        exporterXML.export(System.out);
        /*-------------------------------CSV-----------------------------------------*/
        BookMetadataExporter exporterCSV = new CSVBookMetadataExporter();
        exporterCSV.add(TestData.dragonBook);
        exporterCSV.add(TestData.dinosaurBook);
        exporterCSV.export(System.out);  
         /*-------------------------------JSON-----------------------------------------*/
        BookMetadataExporter exporterJSON = new JSONBookMetadataExporter();
        exporterJSON.add(TestData.cleanArchBook);
        exporterJSON.add(TestData.GoFBook);
        exporterJSON.add(TestData.sailboatBook);
        exporterJSON.add(TestData.dragonBook);
        exporterJSON.add(TestData.dinosaurBook);
        exporterJSON.export(System.out);  
    }
}
