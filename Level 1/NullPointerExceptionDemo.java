public class NullPointerExceptionDemo {

    
    public static void generateException() {
        String text = null; 
        System.out.println("Length of the string: " + text.length());
    }

    
    public static void handleException() {
        String text = null; 
        try {
            
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");
        try {
            generateException(); 
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException:");
        handleException(); 
    }
}