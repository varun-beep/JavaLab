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

ChatGPT

Share


You said:
package saakshiapplication;

abstract class Employee {
    private int eId;
    private String eName;
    private String des;

    
    public Employee(int eid, String ename, String d) {
        this.eId = eid;
        this.eName = ename;
        this.des = d;
    }

    
    public abstract double calBonus();

   
    public void display() {
        System.out.println("Employee ID: " + eId);
        System.out.println("Name: " + eName);
        System.out.println("Designation: " + des);
        System.out.println("Bonus: " + calBonus());
    }
}

class HourlyEmp extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmp(int eId, String eName, String des, double hourlyRate, int hoursWorked) {
        super(eId, eName, des);  
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    public double calBonus() {
        return (hourlyRate * hoursWorked) * 0.05;
    }

    
    public double calWeeklySalary() {
        return hourlyRate * hoursWorked;
    }


    public void display() {
        super.display();  
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Weekly Salary: " + calWeeklySalary());
        System.out.println("Annual Earnings: " + (calWeeklySalary() * 52));  
    }
}

class SalariedEmp extends Employee {
    protected double monthlySalary;

    public SalariedEmp(int eId, String eName, String des, double monthlySalary) {
        super(eId, eName, des);  
        this.monthlySalary = monthlySalary;
    }

    
    public double calBonus() {
        return monthlySalary * 0.1;
    }

   
    public double calWeeklySalary() {
        return monthlySalary / 4;  
    }

   
    public void display() {
        super.display();  
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Weekly Salary: " + calWeeklySalary());
        System.out.println("Annual Earnings: " + (monthlySalary * 12));  
    }
}

class ExecutiveEmp extends SalariedEmp {
    private double bonusPer;

    public ExecutiveEmp(int eId, String eName, String des, double monthlySalary, double bonusPercentage) {
        super(eId, eName, des, monthlySalary);  
        this.bonusPer = bonusPercentage;
    }


    public double calBonus() {
        double baseBonus = super.calBonus();  
        return baseBonus + (getMonthlySalary() * (bonusPer / 100));
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

   
    public void display() {
        super.display();  // Use super to call the parent display method
        System.out.println("Bonus Percentage: " + bonusPer + "%");
        System.out.println("Annual Earnings: " + ((monthlySalary * 12) + calBonus()));  // Include annual bonus in earnings
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        
        HourlyEmp e1 = new HourlyEmp(1, "Aditi", "Developer", 20.0, 40);
        SalariedEmp e2 = new SalariedEmp(2, "Samyuktaa", "Manager", 3000.0);
        ExecutiveEmp e3 = new ExecutiveEmp(3, "Saakshi", "CEO", 5000.0, 15.0);

        
        System.out.println(" Employee Details:");
        e1.display();
        System.out.println();

        e2.display();
        System.out.println();

        e3.display();
        System.out.println();

        
        double totalPayroll = (e1.calWeeklySalary() * 52) + (e2.monthlySalary * 12) + (e3.getMonthlySalary() * 12 + e3.calBonus());
        System.out.println("Total Payroll for All Employees: " + totalPayroll);
    }
}

Change it to like this (basically change the package and name it LAB3)
ChatGPT said:

ChatGPT
Here's the modified code with the package renamed to LAB3 and the class name changed accordingly:

java
Copy code
package LAB3;

abstract class Employee {
    private int eId;
    private String eName;
    private String des;

    public Employee(int eid, String ename, String d) {
        this.eId = eid;
        this.eName = ename;
        this.des = d;
    }

    public abstract double calBonus();

    public void display() {
        System.out.println("Employee ID: " + eId);
        System.out.println("Name: " + eName);
        System.out.println("Designation: " + des);
        System.out.println("Bonus: " + calBonus());
    }
}

class HourlyEmp extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmp(int eId, String eName, String des, double hourlyRate, int hoursWorked) {
        super(eId, eName, des);  
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calBonus() {
        return (hourlyRate * hoursWorked) * 0.05;
    }

    public double calWeeklySalary() {
        return hourlyRate * hoursWorked;
    }

    public void display() {
        super.display();  
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Weekly Salary: " + calWeeklySalary());
        System.out.println("Annual Earnings: " + (calWeeklySalary() * 52));  
    }
}

class SalariedEmp extends Employee {
    protected double monthlySalary;

    public SalariedEmp(int eId, String eName, String des, double monthlySalary) {
        super(eId, eName, des);  
        this.monthlySalary = monthlySalary;
    }

    public double calBonus() {
        return monthlySalary * 0.1;
    }

    public double calWeeklySalary() {
        return monthlySalary / 4;  
    }

    public void display() {
        super.display();  
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Weekly Salary: " + calWeeklySalary());
        System.out.println("Annual Earnings: " + (monthlySalary * 12));  
    }
}

class ExecutiveEmp extends SalariedEmp {
    private double bonusPer;

    public ExecutiveEmp(int eId, String eName, String des, double monthlySalary, double bonusPercentage) {
        super(eId, eName, des, monthlySalary);  
        this.bonusPer = bonusPercentage;
    }

    public double calBonus() {
        double baseBonus = super.calBonus();  
        return baseBonus + (getMonthlySalary() * (bonusPer / 100));
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void display() {
        super.display();
        System.out.println("Bonus Percentage: " + bonusPer + "%");
        System.out.println("Annual Earnings: " + ((monthlySalary * 12) + calBonus()));  
    }
}

public class LAB3 {
    public static void main(String[] args) {
        
        HourlyEmp e1 = new HourlyEmp(1, "Aditi", "Developer", 20.0, 40);
        SalariedEmp e2 = new SalariedEmp(2, "Samyuktaa", "Manager", 3000.0);
        ExecutiveEmp e3 = new ExecutiveEmp(3, "Saakshi", "CEO", 5000.0, 15.0);

        System.out.println(" Employee Details:");
        e1.display();
        System.out.println();

        e2.display();
        System.out.println();

        e3.display();
        System.out.println();

        double totalPayroll = (e1.calWeeklySalary() * 52) + (e2.monthlySalary * 12) + (e3.getMonthlySalary() * 12 + e3.calBonus());
        System.out.println("Total Payroll for All Employees: " + totalPayroll);
    }
}
This code now reflects the updated package name LAB3 and the main class name LAB3.






You said:
(base) varun@Varuns-MacBook-Air-2 JavaLab-1 %  /usr/bin/env /Library/Java/JavaVirtualMachines/jdk-23.jdk/Contents/Home/bin/ja
va --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/varun/Library/Application\ Support/Code/User/workspace
Storage/e555946d555eb216c6d295349adf756d/redhat.java/jdt_ws/JavaLab-1_3735cca5/bin LAB3 
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

        at LAB3.main(LAB3.java:100)
(base) varun@Varuns-MacBook-Air-2 JavaLab-1 %  cd /Users/varun/Desktop/Java/JAVA_LAB/JavaLab-1 ; /usr/bin/env /Library/Java/J
avaVirtualMachines/jdk-23.jdk/Contents/Home/bin/java --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/varu
n/Library/Application\ Support/Code/User/workspaceStorage/e555946d555eb216c6d295349adf756d/redhat.java/jdt_ws/JavaLab-1_3735c
ca5/bin LAB3 
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
ChatGPT said:

ChatGPT
The "Unresolved compilation problem" error typically suggests there might be an issue with one or more of the following:

Class Path Issues: The program may not be finding the compiled .class files. Ensure that the package name and directory structure are consistent. For instance, if the LAB3 class is in a package named LAB3, it should be placed in a folder named LAB3, with the main LAB3 class file located there.
File Structure with Packages: Since you specified package LAB3; at the top of each file, ensure that the .java files are saved in a folder named LAB3. Also, when you compile, navigate to the parent directory of LAB3 and run:
bash
Copy code
javac LAB3/*.java
And to run it:

bash
Copy code
java LAB3.LAB3
Compilation Before Execution: If any files were modified, they should be recompiled. Try running:
bash
Copy code
javac /path/to/LAB3/*.java
Replace /path/to/ with the actual path to your Java files. Then execute the main class using:

bash
Copy code
java LAB3.LAB3
IDE Configuration: Sometimes, IDEs like Visual Studio Code require a clean build to refresh dependencies. Try cleaning the build and recompiling, or if using an IDE, recompile the project or restart the IDE.
If these steps don’t resolve the error, could you provide more details or specific lines where the issue might be arising? This will help pinpoint the cause.






You said:
give me description for this code like you have before:
for LAB3:
ex: LAB1_P1:This Java program validates an 8- or 9-digit credit card number using a variation of the Luhn algorithm: Length Check: Ensures the card number is 8 or 9 digits. Checksum Calculation: Doubles every other digit (from the right), adjusting if >9, and sums them. Validation: Compares the last digit with the calculated checksum to determine if the card is valid. In main, the user enters a number, and the program outputs whether the card is "valid" or "invalid." (This approach is simplified for hypothetical card numbers, not standard credit cards.)

LAB1_P2:This Java program simulates an "Alphabet War" game where each character in a word has a score associated with either the left or right side: Scoring: Characters 'w', 'p', 'b', 's' add points to the left side, and 'm', 'q', 'd', 'z' add points to the right side. Single Input Mode: In AlphabetWar(String wo), a single word’s characters are scored to determine which side wins. Dual Input Mode: In AlphabetWar(String lw, String rw), separate words for each side are scored. Result: Based on scores, the program outputs which side wins or if it’s a draw. The main method takes a word from the user and prints the winner.

LAB2_P1:This Java program finds the top K most frequent elements in an integer array: Frequency Count: A HashMap stores the frequency of each element in the array. Priority Queue: A max-heap (using a custom comparator) stores elements by frequency and value. Top-K Extraction: The program extracts the top K elements from the heap and prints them in order. In main, the user inputs the array size, elements, and K value. The program then displays the K most frequent elements.

LAB2_P2:This Java program calculates the maximum profit from two stock trades, given the prices over a series of days: Left and Right Profit Arrays:leftProfit[i] tracks the maximum profit achievable up to day i. rightProfit[i] tracks the maximum profit achievable from day i onward. Profit Calculation: By summing leftProfit[i] and rightProfit[i] for each day i, the maximum combined profit from two trades is determined. Result: The program prints the maximum possible profit. In main, the user inputs the number of days and prices, and findMaxProfit calculates and displays the result.

LAB3: This Java program simulates a payroll system with three types of employees: hourly, salaried, and executive. Each employee type has specific attributes and calculates a unique bonus:
1)Employee Class: An abstract base class that defines the common properties (eId, eName, des) and methods (calBonus, display) for all employees. It provides an abstract method calBonus to calculate each employee’s bonus and a display method for printing employee details.
2)HourlyEmp Class: Extends Employee for employees paid hourly. It includes hourlyRate and hoursWorked attributes, with calBonus returning 5% of total earnings for the week. Additionally, calWeeklySalary calculates weekly pay, and display outputs details, including annual earnings.
3)SalariedEmp Class: Extends Employee for salaried employees, with a monthlySalary attribute. The calBonus method calculates a bonus as 10% of the monthly salary. The calWeeklySalary method computes weekly earnings based on the monthly salary, and display outputs monthly and annual earnings.
4)ExecutiveEmp Class: Extends SalariedEmp for executives with a higher, performance-based bonus. It includes a bonusPer attribute, representing the bonus percentage. The calBonus method combines a base bonus (10% of the monthly salary) with an additional bonus based on the bonusPer rate. The display method outputs all details, including total annual earnings, which includes the bonus.
5)LAB3 Main Class: The main program creates instances of each employee type (HourlyEmp, SalariedEmp, ExecutiveEmp) and calls display to print each employee’s details, including salary, bonus, and annual earnings. Finally, it calculates and outputs the total payroll cost for all employees by summing their annual earnings.
This structured design demonstrates inheritance and polymorphism, allowing different employee types to calculate and display their specific earnings and bonuses within a shared payroll system.
