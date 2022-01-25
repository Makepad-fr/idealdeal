package io.makepad.idealdeal.adafruit;

public class FeedMessage {
    String title;
    String description;
    String link;
    String pubDate;
    String guid;

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return this.description;
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


    public String getGuid() {
        return guid;
    }

    public String getPubDate() {
        return pubDate;
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
