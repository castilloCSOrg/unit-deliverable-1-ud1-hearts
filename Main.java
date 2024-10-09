/********************************************
*	AUTHORS:	<Anthony Annis>
* COLLABORATORS: <myself>
*	LAST MODIFIED:	<10/9/24>
********************************************/

/********************************************
*	<Diet Planner>
*********************************************
*	PROGRAM DESCRIPTION:
*	<Diet Planner requests user input on how much they weigh currently and how many lbs they would like to lose and>
*********************************************
*	ALGORITHM:
*	<Ask user for pounds
Ask User for weeks needed to achieve weight loss goal
Ask user how many pounds they'd like to lose.
Displays maintenance calories,pounds they'd like to lose, weeks in their time frame, how many they need to cut to reach it in that time frame
How many pounds they will lose
How much protein they need daily>
*********************************************
*	STATIC METHODS:
calculateMaintenanceCalories, calculateDailyCaloriesBurned,calculateWeeklyCaloriesBurned, calculateTotalCaloriesBurned,calculatePoundsBurned, calculateGramsOfProtein, calculatePoundsBurnedPerWeek
*********************************************/
import java.util.Scanner;

public class Main 
{
  //start
 public static void main(String[] args)
 {
  //initialization
   runWeightLossCalculator();
  }
  //weight loss method
   public static void runWeightLossCalculator()
  {
    //processing section
    try (Scanner scanner = new Scanner(System.in))
   {
    //input section
    System.out.print("Enter your body weight(in pounds): ");
    double bodyWeight = scanner.nextDouble();

    System.out.print("Enter how many weeks you have to achieve your weight loss goal: ");
    int weeks = scanner.nextInt();

    System.out.print("Enter pounds to lose: ");
    double pounds = scanner.nextDouble();
//calculation section
    double maintenanceCalories = calculateMaintenanceCalories(bodyWeight);
    double dailyCaloriesBurned = calculateDailyCaloriesBurned(bodyWeight);
    double weeklyCaloriesBurned = calculateWeeklyCaloriesBurned(dailyCaloriesBurned);
    double totalCaloriesBurnedOverWeeks = calculateTotalCaloriesBurned(weeklyCaloriesBurned, weeks);
    double poundsBurned = calculatePoundsBurned(totalCaloriesBurnedOverWeeks);
    double gramsOfProtein = calculateGramsOfProtein(bodyWeight);
    double poundsBurnedPerWeek = calculatePoundsBurnedPerWeek(dailyCaloriesBurned, weeks);
//output section
    formatOutput(pounds, weeks, maintenanceCalories, dailyCaloriesBurned, weeklyCaloriesBurned, poundsBurned, gramsOfProtein, poundsBurnedPerWeek);

  }
}
//calculate maintenance calories
  public static double calculateMaintenanceCalories(double bodyWeight)
  {
    return bodyWeight * 15;
  }
  //calculate daily calorie needs minus deficit
  public static double calculateDailyCaloriesBurned(double bodyWeight)
  {
    return (bodyWeight * 15) - (bodyWeight * 10.5);
  }
  //calculate daily calories * days in week
  public static double calculateWeeklyCaloriesBurned(double dailyCaloriesBurned)
  {
    return dailyCaloriesBurned * 7;
  }
  // calculate total calories burned times week user enters
  public static double calculateTotalCaloriesBurned(double weeklyCaloriesBurned, int weeks)
  {
    return weeklyCaloriesBurned * weeks;

  }
  //calculate pounds burned per week in calorie form only
  public static double calculatePoundsBurned(double totalCaloriesBurnedOverWeeks)
  {
    return totalCaloriesBurnedOverWeeks /3500;
  }
// calculate grams of protein
  public static double calculateGramsOfProtein(double bodyWeight)
  {
    return bodyWeight * 0.82;
  }

  //calculate pounds burned per week(to be converted from calories to pounds using calculation)
  public static double calculatePoundsBurnedPerWeek(double dailyCaloriesBurned,int weeks)
  {
    return (dailyCaloriesBurned * weeks) / 3500;
  }

//Output formatting
  public static void formatOutput(double pounds, int weeks, double maintenanceCalories, double dailyCaloriesBurned, double weeklyCaloriesBurned, double poundsBurned,double gramsOfProtein, double poundsBurnedPerWeek)
  {
  System.out.printf("To achieve your goal of losing %.1f pounds in %d weeks:%n", pounds, weeks);
  System.out.printf("You will burn approximately %.2f pounds through weight loss.%n", poundsBurned);
  System.out.printf("Maintenance Calories: %.0f calories per day%n",maintenanceCalories);
  System.out.printf("By cutting %.0f calories, you can reach your goal in your desired time frame%n", dailyCaloriesBurned);
  System.out.printf("You will lose %.2f pounds per week.%n", poundsBurnedPerWeek);
  System.out.printf("The goal is to consume %.2f grams of protein per day.%n", gramsOfProtein);
       
  }
}
