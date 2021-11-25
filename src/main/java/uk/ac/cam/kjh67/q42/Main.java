package uk.ac.cam.kjh67.q42;

public class Main {
    public static void main(String[] args) {
        System.out.println(x());
    }

    public static int x() {
        try {
            System.out.println("Trying");
            return 6;
        }
        finally {
            System.out.println("finally");
            return 1;
            // finally block exits early, so subsequent code not executed
            // (commented out to silence the unreachable statement warnings)
            // System.out.println("end of finally");
        }
    }
}
