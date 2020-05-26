package academy.everyonecodes.java.week2.set2.exercise3;

public class HikeDisplay {
    public void display(Hike hike) {
        System.out.println("Date of Hike is: " + hike.getDate());
        System.out.println("-- List of hikers that signed up for the hike --");
        for (Hiker hiker : hike.getHikerList()){
            System.out.println("Hiker's name: " + hiker.getHikerName() + " Phone: " + hiker.getPhoneNumber());
        }
    }
}
