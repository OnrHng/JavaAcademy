package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;

public class Hike {
    private String date;
    private List<Hiker> hikerList;

    public Hike(String date, List<Hiker> hikerList) {
        this.date = date;
        this.hikerList = hikerList;
    }

    public String getDate() {
        return date;
    }

    public List<Hiker> getHikerList() {
        return hikerList;
    }
    public boolean addHiker(Hiker hiker) {
        return hikerList.add(hiker);
    }
}
