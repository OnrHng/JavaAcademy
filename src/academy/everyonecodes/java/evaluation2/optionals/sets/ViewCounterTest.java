package academy.everyonecodes.java.evaluation2.optionals.sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewCounterTest {

    ViewCounter counter = new ViewCounter();

    @Test
    void countUniqueViews() {
        // some ips are same
        counter.addViewerIPAddress("10.0.0.1");
        counter.addViewerIPAddress("10.0.0.2");
        counter.addViewerIPAddress("10.0.0.3");
        counter.addViewerIPAddress("10.0.1.1");
        counter.addViewerIPAddress("10.0.0.1");
        counter.addViewerIPAddress("10.0.0.2");

        assertEquals(4, counter.countUniqueViews());
    }

    @Test
    void countUniqueViewsFromEmpty() {
        // sorry your video dont have views :(
        int result = counter.countUniqueViews();
        assertEquals(0, result);
    }

    @Test
    void countUniqueViewsFromAllUniquesIp() {
        // some ips are same
        counter.addViewerIPAddress("10.0.0.1");
        counter.addViewerIPAddress("10.0.0.2");
        counter.addViewerIPAddress("10.0.0.3");
        counter.addViewerIPAddress("194.192.64.24");
        counter.addViewerIPAddress("222.204.172.10");
        counter.addViewerIPAddress("192.172.11.22");

        assertEquals(6, counter.countUniqueViews());
    }
}