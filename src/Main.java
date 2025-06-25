// src/Main.java
public class Main {
    public static void main(String[] args) {
        String ss = null;
        if (ss.equals("hello")) {
            System.out.println("This will cause NullPointerException!");
        }
    }
}