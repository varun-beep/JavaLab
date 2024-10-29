# JavaLab
LAB1_P1:This Java program validates an 8- or 9-digit credit card number using a variation of the Luhn algorithm:
Length Check: Ensures the card number is 8 or 9 digits.
Checksum Calculation: Doubles every other digit (from the right), adjusting if >9, and sums them.
Validation: Compares the last digit with the calculated checksum to determine if the card is valid.
In main, the user enters a number, and the program outputs whether the card is "valid" or "invalid."
(This approach is simplified for hypothetical card numbers, not standard credit cards.)

LAB1_P2:This Java program simulates an "Alphabet War" game where each character in a word has a score associated with either the left or right side: Scoring: Characters 'w', 'p', 'b', 's' add points to the left side, and 'm', 'q', 'd', 'z' add points to the right side.
Single Input Mode: In AlphabetWar(String wo), a single word’s characters are scored to determine which side wins.
Dual Input Mode: In AlphabetWar(String lw, String rw), separate words for each side are scored.
Result: Based on scores, the program outputs which side wins or if it’s a draw.
The main method takes a word from the user and prints the winner.

LAB2_P1:This Java program finds the top K most frequent elements in an integer array:
Frequency Count: A HashMap stores the frequency of each element in the array.
Priority Queue: A max-heap (using a custom comparator) stores elements by frequency and value.
Top-K Extraction: The program extracts the top K elements from the heap and prints them in order.
In main, the user inputs the array size, elements, and K value. The program then displays the K most frequent elements.

LAB2_P2:This Java program calculates the maximum profit from two stock trades, given the prices over a series of days:
Left and Right Profit Arrays:leftProfit[i] tracks the maximum profit achievable up to day i.
rightProfit[i] tracks the maximum profit achievable from day i onward.
Profit Calculation: By summing leftProfit[i] and rightProfit[i] for each day i, the maximum combined profit from two trades is determined.
Result: The program prints the maximum possible profit.
In main, the user inputs the number of days and prices, and findMaxProfit calculates and displays the result.
