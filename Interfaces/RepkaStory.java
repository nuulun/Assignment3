package Interfaces;
import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;

        for (int i = 0; i < items.size() - 1; i++) {
            first = items.get(i);
            second = items.get(i + 1);
            first.pull(second); // Call the pull method
        }
    }

}