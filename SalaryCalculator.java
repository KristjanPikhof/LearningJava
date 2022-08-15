import java.util.Scanner;

public class SalaryCalculator {

    public static int vacationDayPerWorkingHours = 40; //let's say 40 hours of work equals to 1 vacation day
    public static int weeksInYear = 52; //say one year has 52 weeks

    public static double salaryCalculator(double hoursWorkedPerWeek, double salaryPerHour) {
        double result = hoursWorkedPerWeek * salaryPerHour;                    
        return result * weeksInYear;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Salary calculator!");
        System.out.println("To calculate your yearly salary insert next numbers:");

        System.out.println("How many hours you work per week?");
        Scanner scannerHours = new Scanner(System.in);
        int inputWorkHours = scannerHours.nextInt();

        if (inputWorkHours < 0) {
            System.out.println("Hours cannot be negative");
            System.out.println("Finishing program");
            return;
        }

        System.out.println("What's your hourly salar?");
        Scanner scannerSalary = new Scanner(System.in);
        int inputSalaryPerHour = scannerSalary.nextInt();

        if (inputSalaryPerHour < 0) {
            System.out.println("Salary cannot be negative");
            System.out.println("Finishing program");
            return;
        }

        int vacationDays = (inputWorkHours * weeksInYear) / vacationDayPerWorkingHours;

        double employeeSalary = salaryCalculator(inputWorkHours, inputSalaryPerHour);
        System.out.println("In this position your yearly salary would be " + employeeSalary + " $");
        System.out.println("Also, you would gather " + vacationDays + " vacation days for working " + (inputWorkHours * weeksInYear) + " hours per year!" );
        System.out.println("Thanks for using Salary calculator!" );
    }
}