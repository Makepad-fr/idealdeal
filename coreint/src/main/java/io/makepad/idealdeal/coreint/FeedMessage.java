package io.makepad.idealdeal.coreint;

public class FeedMessage {
    String title;
    String description;
    String link;
    String pubDate;
    String guid;



    public void setTitle(String title){
        this.title = title;
    }


    public void setDescription(String description){
        this.description = description;
    }


    public void setLink(String link){
        this.link = link;
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
