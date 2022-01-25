package io.makepad.idealdeal.adafruit;

public class ReadTest {

    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser(
                "https://jobs.adafruit.com/wpjobboard/xml/rss/?query=&amp;location=&amp;type%5B%5D=7");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }

    }

}