import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation (ordered + unique)
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate (will be ignored)

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        // Program continues
        System.out.println("System is ready for further operations...");
    }
}