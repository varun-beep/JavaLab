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

LAB3: This Java program simulates a payroll system with three types of employees: hourly, salaried, and executive. Each employee type has specific attributes and calculates a unique bonus:
1)Employee Class: An abstract base class that defines the common properties (eId, eName, des) and methods (calBonus, display) for all employees. It provides an abstract method calBonus to calculate each employee’s bonus and a display method for printing employee details.
2)HourlyEmp Class: Extends Employee for employees paid hourly. It includes hourlyRate and hoursWorked attributes, with calBonus returning 5% of total earnings for the week. Additionally, calWeeklySalary calculates weekly pay, and display outputs details, including annual earnings.
3)SalariedEmp Class: Extends Employee for salaried employees, with a monthlySalary attribute. The calBonus method calculates a bonus as 10% of the monthly salary. The calWeeklySalary method computes weekly earnings based on the monthly salary, and display outputs monthly and annual earnings.
4)ExecutiveEmp Class: Extends SalariedEmp for executives with a higher, performance-based bonus. It includes a bonusPer attribute, representing the bonus percentage. The calBonus method combines a base bonus (10% of the monthly salary) with an additional bonus based on the bonusPer rate. The display method outputs all details, including total annual earnings, which includes the bonus.
5)LAB3 Main Class: The main program creates instances of each employee type (HourlyEmp, SalariedEmp, ExecutiveEmp) and calls display to print each employee’s details, including salary, bonus, and annual earnings. Finally, it calculates and outputs the total payroll cost for all employees by summing their annual earnings.
This structured design demonstrates inheritance and polymorphism, allowing different employee types to calculate and display their specific earnings and bonuses within a shared payroll system.
