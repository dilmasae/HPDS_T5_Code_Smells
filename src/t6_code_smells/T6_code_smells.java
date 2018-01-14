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
    
    static String[] long_list_of_parameters(
            String name1, String name2, String name3, String name4, String name5,
            String name6, String name7, String name8, String name9) {
        
        String[] array = new String[] {
            name1, name2, name3, name4, name5, name6, name7, name8, name9};
        return array;
    }
    
    public static void main(String[] args) {
        System.out.println("Code Smells");    
    }
    
}
