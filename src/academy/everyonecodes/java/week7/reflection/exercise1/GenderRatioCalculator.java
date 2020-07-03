package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;

public class GenderRatioCalculator {
    public String calculate() {
        StudentPerformanceReader reader = new StudentPerformanceReader();
        List<StudentPerformance> studentPerformanceList = reader.read();
        int amountFemale = 0;
        int amountMale = 0;

        for (StudentPerformance studentPerformance : studentPerformanceList) {
            if (studentPerformance.getGender().equals("female")) {
                amountFemale++;
            }else if (studentPerformance.getGender().equals("male")){
                amountMale++;
            }
        }

        return amountFemale + ":" + amountMale;
    }
}
