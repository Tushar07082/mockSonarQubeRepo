public class Main {

    public static void main(String[] args) {
        System.out.println("Starting app..."); // ❌ S106 - Use logger instead

        String role = getRole("alice");

        if ("admin".equals(role)) {
            System.out.println("Welcome admin");
        } else if ("admin".equals(role)) {     // ❌ S2583 - Unreachable condition
            System.out.println("Still admin?");
        }

        connect("admin"); // ❌ S1192 - "admin" literal duplicated
    }

    private static String getRole(String user) {
        if ("alice".equals(user)) {
            return "admin";
        }
        return "guest";
    }

    private static void connect(String user) {
        if ("admin".equals(user)) {
            // connect to DB
        }
    }
}
