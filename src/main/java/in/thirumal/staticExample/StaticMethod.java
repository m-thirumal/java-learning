package in.thirumal.staticExample;

public class StaticMethod {

    static void displayStaticMethod() {//Can be called without creating an instance of the class
        System.out.println("Static Method is called without creating an object for the instance");
    }

    public static void main(String[] args) {
        displayStaticMethod();
    }
}
