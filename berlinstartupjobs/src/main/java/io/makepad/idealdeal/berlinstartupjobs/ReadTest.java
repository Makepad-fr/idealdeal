package io.makepad.idealdeal.berlinstartupjobs;

public class ReadTest {

    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser(
                "https://berlinstartupjobs.com/feed/");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }

    }
}
