package in.thirumal.staticExample;

public class StaticBlocks {
    
    static String dbURL;

    static { //Used for class initialization. when class is loaded, 
        //This happens before any instance of the class is created or any static methods are called.
        dbURL = "jdbc:postgresql://localhost:5432/project";
    }
    public static void main(String[] args) {
        System.out.println(dbURL);
    }
}
