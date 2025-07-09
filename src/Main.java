public class Main {

    private static final String DB_PASSWORD = "admin123"; // S2068 - Hardcoded credentials

    public void processUsers(String[] users) {
        for (String user : users) {
            if (user.equals("admin")) {
                System.out.println("Admin login detected");
            } else if (user.equals("admin")) { // S1192 - Duplicate literal
                System.out.println("Admin login again");
            }

            System.out.println("Processing user: " + user);
        }
    }

    public void riskyMethod(String input) {
        String trimmed = input.trim(); // S2259 - input might be null
        System.out.println("Trimmed input: " + trimmed);
    }

    public boolean login(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password)) { // S2068 and S1192
            System.out.println("Admin logged in successfully");
            return true;
        }
        return false;
    }

    public void duplicateLogicBlock() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Line " + i);
            System.out.println("Line " + i);
            System.out.println("Line " + i); // could be flagged if copy-pasted again
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Line " + i);
            System.out.println("Line " + i);
            System.out.println("Line " + i); // duplicated block - S1192
        }
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.processUsers(new String[] { "user1", "admin", "guest" });
        service.riskyMethod(null); // Triggers null pointer
        service.login("admin", "admin123");
        service.duplicateLogicBlock();
    }
}
