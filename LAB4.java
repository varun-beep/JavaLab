// Abstract class definition
abstract class Robber {
    // Abstract methods
    public abstract int RowHouses(int[] houses);
    public abstract int RoundHouses(int[] houses);
    public abstract int SquareHouse(int[] houses);
    public abstract int MultiHouseBuilding(int[][] buildings);

    // Concrete method
    public void RobbingClass() {
        System.out.println("MScAI&ML");
    }

    // Default method
    public void MachineLearning() {
        System.out.println("I love MachineLearning.");
    }
}

// Subclass implementing abstract methods
class JAVAProfessionalRobber extends Robber {
    // Method to calculate max money for row houses
    @Override
    public int RowHouses(int[] houses) {
        if (houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];

        int[] dp = new int[houses.length];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < houses.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + houses[i]);
        }

        return dp[houses.length - 1];
    }

    // Method to calculate max money for round houses
    @Override
    public int RoundHouses(int[] houses) {
        if (houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];

        return Math.max(RowHouses(java.util.Arrays.copyOfRange(houses, 0, houses.length - 1)),
                        RowHouses(java.util.Arrays.copyOfRange(houses, 1, houses.length)));
    }

    // Method to calculate max money for square houses
    @Override
    public int SquareHouse(int[] houses) {
        return RowHouses(houses); // Same logic as RowHouses
    }

    // Corrected Method for multi-type house buildings
    @Override
    public int MultiHouseBuilding(int[][] buildings) {
        int totalMoney = 0;

        // Iterate through each type of house (row in the array)
        for (int[] building : buildings) {
            totalMoney += RowHouses(building); // Max money for each type of house
        }

        return totalMoney; // Return total sum
    }
}

// Main class
public class LAB4 {
    public static void main(String[] args) {
        // Create an object of JAVAProfessionalRobber
        JAVAProfessionalRobber robber = new JAVAProfessionalRobber();

        // Call concrete methods
        robber.RobbingClass(); // Prints: MScAI&ML
        robber.MachineLearning(); // Prints: I love MachineLearning.

        // Test cases
        int[] rowHouses = {1, 2, 3, 0};
        int[] roundHouses = {1, 2, 3, 4};
        int[] squareHouses = {5, 10, 2, 7};
        int[][] multiHouses = {
            {5, 3, 8, 2},
            {10, 12, 7, 6},
            {4, 9, 11, 5},
            {8, 6, 3, 7}
        };

        // Test RowHouses
        System.out.println("RowHouses([1,2,3,0]) -> " + robber.RowHouses(rowHouses)); // Output: 4

        // Test RoundHouses
        System.out.println("RoundHouses([1,2,3,4]) -> " + robber.RoundHouses(roundHouses)); // Output: 6

        // Test SquareHouse
        System.out.println("SquareHouse([5,10,2,7]) -> " + robber.SquareHouse(squareHouses)); // Output: 17

        // Test MultiHouseBuilding
        System.out.println("MultiHouseBuilding([[5,3,8,2],[10,12,7,6],[4,9,11,5],[8,6,3,7]]) -> " + 
            robber.MultiHouseBuilding(multiHouses)); // Output: 59
    }
}