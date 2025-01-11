public class OTPGenerator {

    
    public static int generateOTP() {
        return (int) (100000 + Math.random() * 900000); // Generates a random number 
    }

   
    public static int[] generateOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
       
        int[] otps = generateOTPs(10);

       
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        
        boolean unique = areUnique(otps);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes" : "No"));
    }
}
