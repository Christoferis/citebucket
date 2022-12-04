package citebucket.backend;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

//Data Struct having all of the Citation info
public class Citation {

    URL source;
    Date added, modified;
    String notes, name;
    public boolean integrity = true;
    
    //use for new additions
    public Citation(String source) {
        added = new Date();
        modified = new Date();

        try {
            this.source = new URL(source);
        } catch (MalformedURLException e) {
            integrity = false;
        }

        //should derive the name from the website
        // this.name =
    }

    //to load in from a file
    public Citation(Long added, Long modified, URL source, String name, String notes) {
        (this.added = new Date()).setTime(added);
        (this.modified = new Date()).setTime(modified);
        this.notes = notes;
        this.source = source;
        this.name = name;
    }

    //all of that stuff
    public URL getSource() {
        return source;
    }

    public void setSource(URL source) {
        this.source = source;
    }

    public Date getAdded() {
        return added;
    }

    public String getNotes() {
        return notes;
    }

    //signifies that it was modified
    public void modified(){
        modified.setTime(modified.getTime());
    }

    public Date getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
