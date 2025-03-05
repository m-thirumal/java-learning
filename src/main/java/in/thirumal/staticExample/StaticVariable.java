package in.thirumal.staticExample;

public class StaticVariable {

    static int count = 0; //Belongs to Class, shared by all instance of the class

    StaticVariable() {
        count++;
    }

    static void displayCount() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable();
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();

        StaticVariable.displayCount();

    }
}
