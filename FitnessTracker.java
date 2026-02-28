import java.util.ArrayList;
import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Workout> workouts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== FITNESS TRACKER =====");
            System.out.println("1. Add Workout");
            System.out.println("2. View Workouts");
            System.out.println("3. View Total Calories");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter workout name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter duration (minutes): ");
                    int duration = sc.nextInt();

                    System.out.print("Enter calories burned: ");
                    int calories = sc.nextInt();

                    workouts.add(new Workout(name, duration, calories));

                    System.out.println("Workout added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Workout Records ---");

                    for (Workout w : workouts) {
                        w.displayWorkout();
                    }
                    break;

                case 3:
                    int totalCalories = 0;

                    for (Workout w : workouts) {
                        totalCalories += w.calories;
                    }

                    System.out.println("Total Calories Burned: " + totalCalories);
                    break;

                case 4:
                    System.out.println("Exiting Fitness Tracker...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
