import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC2: Add Passenger Bogies ===");

        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding: " + passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing AC Chair: " + passengerBogies);

        // Check existence
        System.out.println("Contains Sleeper? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final List: " + passengerBogies);
    }
}