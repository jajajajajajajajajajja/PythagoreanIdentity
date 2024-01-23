import java.util.Scanner;

public class pythagoreanIdentity {

    public static void main(String[] args) {
        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Convert the angle to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculate trigonometric values
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);

        // Verify the Pythagorean identity: sin^2(theta) + cos^2(theta) = 1
        double pythagoreanIdentity = Math.pow(sinValue, 2) + Math.pow(cosValue, 2);

        // Display results
        System.out.println("Angle in degrees: " + angleInDegrees);
        System.out.println("Angle in radians: " + angleInRadians);
        System.out.println("sin(theta): " + sinValue);
        System.out.println("cos(theta): " + cosValue);
        System.out.println("Pythagorean Identity: sin^2(theta) + cos^2(theta) = " + pythagoreanIdentity);
    }
       
}
