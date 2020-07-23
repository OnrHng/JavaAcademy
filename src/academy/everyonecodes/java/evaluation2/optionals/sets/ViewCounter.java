package academy.everyonecodes.java.evaluation2.optionals.sets;

import java.util.*;

public class ViewCounter {
    private List<String> ipList;
    private String ip;

    public ViewCounter() {
        this.ipList = new ArrayList<>();
    }

    public void addViewerIPAddress(String ip) {

        ipList.add(ip);

    }

    public int countUniqueViews() {

        Set<String> ipSet = new HashSet<>(ipList);
        return ipSet.size();

    }
}
