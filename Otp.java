import java.util.Random;

public class OTPGenerator {

    public static void main(String[] args) {
        // Generate a 6-digit OTP
        String otp = generateOTP(6);
        System.out.println("Generated OTP: " + otp);
    }

    // Method to generate OTP of the desired length
    public static String generateOTP(int length) {
        // Create a random object
        Random random = new Random();

        // Generate a random number with the specified length
        int otp = random.nextInt((int) Math.pow(10, length));

        // Format the number with leading zeros if necessary
        return String.format("%0" + length + "d", otp);
    }
}
