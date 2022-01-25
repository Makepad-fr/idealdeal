package io.makepad.idealdeal.berlinstartupjobs;

public class FeedMessage {
    String title;
    String description;
    String link;
    String pubDate;
    String guid;
    String category;
    String language;


    public void setTitle(String title){
        this.title = title;
    }


    public void setDescription(String description){
        this.description = description;
    }

    public String getLink(){
        return this.link;
    }
    public void setLink(String link){
        this.link = link;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString(){
        return "io.makepad.idealdeal.stackoverflow.FeedMessage [title= "+title+" ,description= "+description+" ,link= "+link+",guid= "+guid + ", pubDate= "+pubDate+", ]";
    }
}
