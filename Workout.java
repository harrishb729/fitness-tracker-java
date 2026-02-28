public class Workout {

    String workoutName;
    int duration;
    int calories;

    Workout(String workoutName, int duration, int calories) {

        this.workoutName = workoutName;
        this.duration = duration;
        this.calories = calories;
    }

    void displayWorkout() {

        System.out.println("----------------------");
        System.out.println("Workout: " + workoutName);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Calories: " + calories);
    }
}
