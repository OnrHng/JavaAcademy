package academy.everyonecodes.java.week5.set2.exercise3;

import java.util.List;
import java.util.Optional;

public class HappinessScoreFinder {
    public Optional<Double> findFor(List<Optional<HappinessRecord>> recordList, String countryName) {
        try {
            for (Optional<HappinessRecord> record : recordList){
                if (record.isPresent()  && record.get().getCountryName().equals(countryName)) {
                    return Optional.of(record.get().getScore());
                }
            }
        } catch (Exception e) {
            System.out.println("Something goes wrong!!");
            e.printStackTrace();
            return Optional.empty();
        }

        return Optional.empty();
    }
}
