package basics;

public class SalaryCalculator {
    public static void main(String [] args){
        // Let's create a variable to define our career

        // Declare a variable
        String career;
        System.out.println("Program is starting");
        career = "Software Developer";
        System.out.println("My Career: " + career);

        // Declare & Define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary as a " + career + " at the rate of $" + rate + " is $" + salary + " per year.");
    }
}