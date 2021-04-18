package Task4;

// class for checking how works class ThreeNumbersImpl

public class Main {
    public static void main(String[] args) {
        ThreeNumbersImpl demoClass = new ThreeNumbersImpl(1, 5, 100);
        demoClass.printLessThan(8);
        demoClass.printLessThan(-10);
        demoClass.printLessThan(101);
    }
}
