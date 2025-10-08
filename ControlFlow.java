public class ControlFlow {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C or below");
        }

        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other day");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
