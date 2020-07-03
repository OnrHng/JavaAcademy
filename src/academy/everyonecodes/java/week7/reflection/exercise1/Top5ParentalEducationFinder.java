package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top5ParentalEducationFinder {
    public List<String> find(List<StudentPerformance> studentPerformanceList) {
        List<String> top5ParentalEduList = new ArrayList<>();

        // sort list comparing Math Score
        studentPerformanceList = studentPerformanceList.stream()
                .sorted(Comparator.comparingInt(StudentPerformance::getMathScore).reversed())
                .collect(Collectors.toList());

        // add first 5 element from student performance list into to the list of parental education  and return it
        for (int i = 0; i < 5; i++) {
            String studentParentEdu = String.valueOf(studentPerformanceList.get(i).getParentalEducation());
            top5ParentalEduList.add(studentParentEdu);
        }

        return top5ParentalEduList;
    }
}
