package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jarray;
    
    public JSONBookMetadataFormatter(){
        this.reset();
    }
            
    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        this.jarray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject jobject = new JSONObject();
        
        jobject.put("ISBN", b.getISBN());
        jobject.put("Title",b.getTitle());
        jobject.put("Publisher",b.getPublisher());
        String[] author = b.getAuthors();
        String allauthors = "";
        for (int i = 0;i<author.length;i++){
            if (i != (author.length-1)){
                allauthors+=author[i] + " | ";
            }else{
                allauthors+=author[i];
            }
        }
        jobject.put("Author",allauthors);
        this.jarray.add(jobject);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return this.jarray.toString();
    }
    
    public JSONArray getJsonArray() {
        return this.jarray;
    }
}

    