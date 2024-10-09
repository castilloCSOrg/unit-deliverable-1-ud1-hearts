/********************************************
*	AUTHORS:	<Anthony Annis>
* COLLABORATORS: <myself>
*	LAST MODIFIED:	<>
********************************************/

/********************************************
*	<Weight Loss Calculator>
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/
import java.util.Scanner;

public class Main 
{
 public static void main(String[] args)
 {
   try (Scanner scanner = new Scanner(System.in))
   {
    System.out.print("Enter your body weight(in pounds): ");
    double bodyWeight = scanner.nextDouble();

    System.out.print("Enter pounds to lose: ");
    double pounds = scanner.nextDouble();

    System.out.print("Enter weeks to achieve this goal: ");
    int weeks = scanner.nextInt();

    double dailyCalorieDeficit = calculateCalorieDeficit(bodyWeight, pounds, weeks);

    double maintenanceCalories = bodyWeight * 15;
    double totalCalorieDeficit = (pounds * 15) - (bodyWeight * 10.5);
    double gramsOfProtein = bodyWeight * 0.82; 

    formatOutput(pounds, weeks, maintenanceCalories, totalCalorieDeficit, dailyCalorieDeficit, gramsOfProtein);

    scanner.close();

  }

  }

  public static double calculateCalorieDeficit(double bodyWeight, double pounds, int weeks)
  {
    double totalCalorieDeficit = (maintenanceCalories) - (pounds * 10.5);
    double dailyCalorieDeficit = totalCalorieDeficit / weeks;
    
  }

  public static void formatOutput(double pounds, int weeks, double maintenanceCalories, double deficitAmount, double dailyCalorieDeficit)
  {
  System.out.printf("To lose %.1f pounds in %d weeks, you need to cut %.0f calories per day.%n", pounds, weeks, dailyCalorieDeficit);
  System.out.printf("Maintenance Calories: %.0f calories %n", maintenanceCalories);
  System.out.printf("Deficit Amount: %.0f calories%n", deficitAmount);      
  }
}
