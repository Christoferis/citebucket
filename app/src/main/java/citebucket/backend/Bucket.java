package citebucket.backend;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

//Data structure, containing Citations
public class Bucket {
    ArrayList<Citation> citations = new ArrayList<>();
    File workingDirectory;

    //if the pages should be indexed when clicked (downloaded and stored for future reference)
    boolean indexing;

    //Interfacing between UI and Cites -> Frontend doesnt need to deal with all the backend, also detached
    public Citation getCitation(String id){
        for(Citation c : citations){
            if(c.getName() == id){
                return c;
            }
        }
        return null;
    }

    //get and store webpage
    public void indexCitation(String id){
        Citation c = this.getCitation(id);
        
        try {
            HttpsURLConnection site = (HttpsURLConnection) c.getSource().getContent();
        } catch (IOException e) {
            //TODO: Statusbar: error
        }


    }

    //Boilerplate
    public void setIndexing(boolean indexing) {
        this.indexing = indexing;
    }

    //only outputs the names -> use this as "id"
    public ArrayList<String> getCitations() {
        ArrayList<String> names = new ArrayList<>();

        for(Citation c : citations){
            names.add(c.getName());
        }

        return names;
    }

    public boolean isIndexing() {
        return indexing;
    }

    public void addCitation(Citation cite){
        citations.add(cite);
    }

    public void removeCitation(Citation cite){
        citations.remove(cite);
    }
    
}
