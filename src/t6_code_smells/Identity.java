package t6_code_smells;

public class Identity {

    public static int id = 1;
    
    public static int getId() {
        return id++;
    }
    
}
