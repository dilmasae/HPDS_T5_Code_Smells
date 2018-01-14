package t6_code_smells;

public class T6_code_smells {

    static void extract_variable() {
        
        String platform = "MAC-1";
        String browser = "IE9";
        int resize = 10;
        
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;
        
        if (isMacOs && isIE && wasInitialized() && wasResized) {
            System.out.println("YEAH!!!");
        }
    }
    
    static boolean wasInitialized() {
        return Math.random() < 0.5;
    }
    
    // DEAD CODE AFTER DELETE wasInitialized method
    static double basePrice(double quantity, double itemPrice) {
        return quantity * itemPrice;
    }
    
    public static void main(String[] args) {
        System.out.println("Code Smells");    
    }
    
}
