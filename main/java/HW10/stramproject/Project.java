package HW10.stramproject;

import javax.persistence.ManyToOne;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Project {
    public static void main(String[] args) {
        String[] name = {"Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali",
                "Davood", "Reza", "Mohsen"};


        // use array
        Map<Integer, List<String>> re = Arrays.stream(name).collect(groupingBy(String::length));
        System.out.println(re);

        // convert array to list

        List<String> strings = Arrays.asList(name);
        Map<Integer, List<String>> nameGrouping = strings.stream()
                .collect(groupingBy(String::length));

        System.out.println(nameGrouping);


        //use array
        Map<Integer, Long> countArray = Arrays.stream(name)
                .collect(groupingBy(String::length, counting()));
        System.out.println(countArray);
        // use list
        Map<Integer, Long> count = strings.stream()
                .collect(groupingBy(String::length, counting()));
        System.out.println(count);


    }
}
