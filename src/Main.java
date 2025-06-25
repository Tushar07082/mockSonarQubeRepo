// src/Main.java
public class Main {
    public static void main(String[] args) {
        String s = null;
        if (s != null && s.equals("hello")) {
            System.out.println("This will cause NullPointerException!");
        }
    }
    
    /**
     * Checks if a string is not null and not empty
     * @param str the string to check
     * @return true if string is valid, false otherwise
     */
    public static boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }
}