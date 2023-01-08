import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in kg: ");
        double weight_kg = scanner.nextDouble();
        System.out.println(weight_kg);

        System.out.println("Enter height in meters:");
        double height_mr = scanner.nextDouble();
        double bmi2 = weight_kg / Math.pow(height_mr, 2);

        System.out.println("Your BMI is: " + bmi2);

        System.out.println("The result is below :");
        if (bmi2<=18){
            System.out.println("You are under weight");
        }
        else if (bmi2>=24){
            System.out.println("You are over weight");
        }
        else {
            System.out.println("You are fit");
        }
    }
}