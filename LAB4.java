import java.util.Scanner;

// Abstract class
abstract class Robber {
    // Abstract methods
    public abstract int RowHouses(int[] houses);
    public abstract int RoundHouses(int[] houses);
    public abstract int SquareHouse(int[] houses);
    public abstract int MultiHouseBuilding(int[][] buildings);

    // Concrete method
    public void RobbingClass() {
        System.out.println("MScAI&ML"); // Print
    }

    public void MachineLearning() {
        System.out.println("I love MachineLearning."); // Print
    }
}

// Subclass
class JAVAProfessionalRobber extends Robber {
    @Override
    public int RowHouses(int[] houses) {
        if (houses.length == 0) return 0; // Empty
        int maxMoney = 0; // Total
        for (int i = 0; i < houses.length; i++) {
            if (i == 0 || i == houses.length - 1 || houses[i] > houses[i - 1]) {
                maxMoney += houses[i]; // Add
                i++; // Skip
            }
        }
        return maxMoney; // Return
    }

    @Override
    public int RoundHouses(int[] houses) {
        if (houses.length == 0) return 0; // Empty
        int case1 = RowHouses(java.util.Arrays.copyOfRange(houses, 0, houses.length - 1)); // Case1
        int case2 = RowHouses(java.util.Arrays.copyOfRange(houses, 1, houses.length)); // Case2
        return Math.max(case1, case2); // Max
    }

    @Override
    public int SquareHouse(int[] houses) {
        return RowHouses(houses); // Reuse
    }

    @Override
    public int MultiHouseBuilding(int[][] buildings) {
        int totalMoney = 0; // Total
        for (int[] building : buildings) {
            totalMoney += RowHouses(building); // Add
        }
        return totalMoney; // Return
    }
}

// Main class
public class LAB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input
        JAVAProfessionalRobber robber = new JAVAProfessionalRobber(); // Object

        // RowHouses input
        System.out.println("Enter the number of row houses:"); // Prompt
        int rowCount = scanner.nextInt(); // Read
        int[] rowHouses = new int[rowCount]; // Array
        System.out.println("Enter the money in each row house:"); // Prompt
        for (int i = 0; i < rowCount; i++) {
            rowHouses[i] = scanner.nextInt(); // Read
        }

        // RoundHouses input
        System.out.println("Enter the number of round houses:"); // Prompt
        int roundCount = scanner.nextInt(); // Read
        int[] roundHouses = new int[roundCount]; // Array
        System.out.println("Enter the money in each round house:"); // Prompt
        for (int i = 0; i < roundCount; i++) {
            roundHouses[i] = scanner.nextInt(); // Read
        }

        // SquareHouse input
        System.out.println("Enter the number of square houses:"); // Prompt
        int squareCount = scanner.nextInt(); // Read
        int[] squareHouses = new int[squareCount]; // Array
        System.out.println("Enter the money in each square house:"); // Prompt
        for (int i = 0; i < squareCount; i++) {
            squareHouses[i] = scanner.nextInt(); // Read
        }

        // MultiHouseBuilding input
        System.out.println("Enter the number of house types in the multi-type building:"); // Prompt
        int buildingTypes = scanner.nextInt(); // Read
        int[][] multiHouseBuilding = new int[buildingTypes][]; // Array
        for (int i = 0; i < buildingTypes; i++) {
            System.out.println("Enter the number of houses for type " + (i + 1) + ":"); // Prompt
            int housesInType = scanner.nextInt(); // Read
            multiHouseBuilding[i] = new int[housesInType]; // Array
            System.out.println("Enter the money in each house for type " + (i + 1) + ":"); // Prompt
            for (int j = 0; j < housesInType; j++) {
                multiHouseBuilding[i][j] = scanner.nextInt(); // Read
            }
        }

        // Print results
        System.out.println("Maximum money from Row Houses: " + robber.RowHouses(rowHouses)); // Output
        System.out.println("Maximum money from Round Houses: " + robber.RoundHouses(roundHouses)); // Output
        System.out.println("Maximum money from Square Houses: " + robber.SquareHouse(squareHouses)); // Output
        System.out.println("Maximum money from Multi-Type Houses: " + robber.MultiHouseBuilding(multiHouseBuilding)); // Output

        scanner.close(); // Close
    }
}
