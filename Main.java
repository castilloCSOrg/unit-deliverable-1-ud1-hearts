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
   runWeightLossCalculator();
  }
   public static void runWeightLossCalculator()
  {
    try (Scanner scanner = new Scanner(System.in))
   {
    System.out.print("Enter your body weight(in pounds): ");
    double bodyWeight = scanner.nextDouble();

    System.out.print("Enter how many weeks you have to achieve your weight loss goal: ");
    int weeks = scanner.nextInt();

    System.out.print("Enter pounds to lose: ");
    double pounds = scanner.nextDouble();

    double maintenanceCalories = calculateMaintenanceCalories(bodyWeight);
    double dailyCaloriesBurned = calculateDailyCaloriesBurned(bodyWeight);
    double weeklyCaloriesBurned = calculateWeeklyCaloriesBurned(dailyCaloriesBurned);
    double totalCaloriesBurnedOverWeeks = calculateTotalCaloriesBurned(weeklyCaloriesBurned, weeks);
    double poundsBurned = calculatePoundsBurned(totalCaloriesBurnedOverWeeks);
    double gramsOfProtein = calculateGramsOfProtein(bodyWeight);

    formatOutput(pounds, weeks, maintenanceCalories, dailyCaloriesBurned, weeklyCaloriesBurned, poundsBurned, gramsOfProtein);

  }
}

  public static double calculateMaintenanceCalories(double bodyWeight)
  {
    return bodyWeight * 15;
  }
  public static double calculateDailyCaloriesBurned(double bodyWeight)
  {
    return (bodyWeight * 15) - (bodyWeight * 10.5);
  }
  public static double calculateWeeklyCaloriesBurned(double dailyCaloriesBurned)
  {
    return dailyCaloriesBurned * 7;
  }
  public static double calculateTotalCaloriesBurned(double weeklyCaloriesBurned, int weeks)
  {
    return weeklyCaloriesBurned * weeks;

  }
  public static double calculatePoundsBurned(double totalCaloriesBurnedOverWeeks)
  {
    return totalCaloriesBurnedOverWeeks /3500;
  }

  public static double calculateGramsOfProtein(double bodyWeight)
  {
    return bodyWeight * 0.82;
  }

  public static void formatOutput(double pounds, int weeks, double maintenanceCalories, double dailyCaloriesBurned, double weeklyCaloriesBurned, double poundsBurned, double gramsOfProtein)
  {
  System.out.printf("To achieve your goal of losing %.1f pounds in %d weeks:%n", pounds, weeks);
  System.out.printf("You will burn approximately %.2f pounds through weight loss.%n", poundsBurned);
  System.out.printf("Maintenance Calories: %.0f calories per day%n",maintenanceCalories);
  System.out.printf("Daily Calories Burned: %.0f calories per day%n", dailyCaloriesBurned);
  System.out.printf("Weekly Calories Burned: %.0f calories%n", weeklyCaloriesBurned);
  System.out.printf("The goal is to consume %.2f grams of protein per day.%n", gramsOfProtein);
       
  }
}
