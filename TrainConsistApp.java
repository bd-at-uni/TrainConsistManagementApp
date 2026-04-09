import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogies);
    }
}