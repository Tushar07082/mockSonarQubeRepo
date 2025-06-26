public class Main {  // Class should be final if not extended (S2160)

    public static void main(String[] args) {
        String ss = null;

        if (ss.equals("hello")) {  // NullPointerException risk (S2259)
            System.out.println("This will not cause NullPointerException!");
        }

        int unusedVar = 42;  // Unused variable (S1481)

        try {
            int result = 10 / 0;  // Division by zero (S112)
        } catch (Exception e) {
            e.printStackTrace();  // Avoid using printStackTrace (S106)
        }

        System.out.println("Done"); // Logging should be done via logger (S131)
    }

    private void doSomething() {  // Unused private method (S1144)
        System.out.println("Doing something");
    }

    public void emptyMethod() {   // Empty block (S108)
    }
}
