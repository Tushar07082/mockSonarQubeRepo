// src/Main.java
public class Main {
    public static void main(String[] args) {
        String s = null;
        if (s != null &&s.equals("hello")) {
            System.out.println("This will cause NullPointerException!");
        }
    }
}