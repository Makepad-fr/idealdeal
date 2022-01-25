package io.makepad.idealdeal.stackoverflow;

import io.makepad.idealdeal.stackoverflow.Feed;
import io.makepad.idealdeal.stackoverflow.FeedMessage;
import io.makepad.idealdeal.stackoverflow.RSSFeedParser;
public class ReadTest {

    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser(
                "https://stackoverflow.com/jobs/feed");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }

    }

}
