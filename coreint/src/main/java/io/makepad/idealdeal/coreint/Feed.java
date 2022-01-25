package io.makepad.idealdeal.coreint;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    final String title;
    final String link;
    final String description;
    final String pubDate;

    final List<FeedMessage> entries = new ArrayList<FeedMessage>();

    public Feed(String title, String link, String description,
                String pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
    }
    public List<FeedMessage> getMessages() {
        return entries;
    }

    @Override
    public String toString() {
        return "io.makepad.idealdeal.stackoverflow.Feed [ description=" + description
                + ", link=" + link + ", pubDate="
                + pubDate + ", title=" + title  +"]";
    }
}
