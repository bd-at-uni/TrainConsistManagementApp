import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC4: Maintain Ordered Bogies ===");

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert at position
        train.add(2, "Pantry");

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train Consist: " + train);
    }
}