public class AreaOfACube {

    public static void main(String[] args) {
        String x = "Siyabonga";
        String y = "Samukelo";
        
        System.out.println("Before swapping:");
        System.out.println("Your name is: " +x );
        System.out.println("Your surname: " +y);
        
        // Swap the values using a temporary variable
        String temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swapping:" );
        System.out.println("Your name is: " +x );
        System.out.println("Your surname: " +y);
    }
}
