package t6_code_smells;

public class T6_code_smells {

    static void extract_variable() {
        
        String platform = "MAC-1";
        String browser = "IE9";
        int resize = 10;
        
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
            (browser.toUpperCase().indexOf("IE") > -1) &&
            wasInitialized() && resize > 0 ) {
            System.out.println("YEAH!!!");
        }
    }
    
    static boolean wasInitialized() {
        return Math.random() < 0.5;
    }
    
    public static void main(String[] args) {
        System.out.println("Code Smells");    
    }
    
}
